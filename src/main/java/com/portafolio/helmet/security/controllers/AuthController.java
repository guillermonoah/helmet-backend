package com.portafolio.helmet.security.controllers;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.validation.Valid;

import com.portafolio.helmet.security.Message;
import com.portafolio.helmet.security.dtos.JwtDto;
import com.portafolio.helmet.security.dtos.LoginUser;
import com.portafolio.helmet.security.dtos.NewUser;
import com.portafolio.helmet.security.entities.Role;
import com.portafolio.helmet.security.entities.User;
import com.portafolio.helmet.security.enums.RoleList;
import com.portafolio.helmet.security.jwt.JwtProvider;
import com.portafolio.helmet.security.services.RoleService;
import com.portafolio.helmet.security.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class AuthController {

    private final AuthenticationManagerBuilder authenticationManagerBuilder;
    private final PasswordEncoder passwordEncoder;
    private final UserService userService;
    private final RoleService roleService;
    private final JwtProvider jwtProvider;
    @Autowired
    public AuthController(AuthenticationManagerBuilder authenticationManagerBuilder, PasswordEncoder passwordEncoder,
                          UserService userService, RoleService roleService, JwtProvider jwtProvider) {
        this.authenticationManagerBuilder = authenticationManagerBuilder;
        this.passwordEncoder = passwordEncoder;
        this.userService = userService;
        this.roleService = roleService;
        this.jwtProvider = jwtProvider;
}
    @PostMapping("/login")
    public ResponseEntity<Object> login(@Valid @RequestBody LoginUser loginUser, BindingResult bidBindingResult){
        if(bidBindingResult.hasErrors())
            return new ResponseEntity<>(new Message("Revise sus credenciales"), HttpStatus.BAD_REQUEST);
        try {
            UsernamePasswordAuthenticationToken authenticationToken= new UsernamePasswordAuthenticationToken(loginUser.getUserName(), loginUser.getPassword());
            Authentication authentication = authenticationManagerBuilder.getObject().authenticate(authenticationToken);
            SecurityContextHolder.getContext().setAuthentication(authentication);
            String jwt = jwtProvider.generateToken(authentication);
            JwtDto jwtDto = new JwtDto(jwt);
            return new ResponseEntity<>(jwtDto, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(new Message("Revise sus credenciales"), HttpStatus.BAD_REQUEST);
        }
    }
    @PostMapping("/register")
    public ResponseEntity<Object> resgister(@Valid @RequestBody NewUser newUser, BindingResult bindingResult) {

        if (bindingResult.hasErrors())
            return new ResponseEntity<>(new Message("Revise los campos e intente nuevamente"), HttpStatus.BAD_REQUEST);

        User user = new User();
        user.setUserName(newUser.getUserName());
        user.setEmail(newUser.getEmail());
        user.setPassword(passwordEncoder.encode(newUser.getPassword()));
        user.setName(newUser.getName());
        user.setRut(newUser.getRut());
        user.setIdCliente(newUser.getIdCliente());
        user.setNombreDoc(newUser.getNombreDoc());
        Set<Role> roles = new HashSet<>();
        if (newUser.getRoles().contains("ROLE_CUSTOMER"))
            roles.add(roleService.getByRoleName(RoleList.ROLE_CUSTOMER).get());
        if (newUser.getRoles().contains("ROLE_ADMIN"))
            roles.add(roleService.getByRoleName(RoleList.ROLE_ADMIN).get());
        if (newUser.getRoles().contains("ROLE_PROFESSIONAL"))
            roles.add(roleService.getByRoleName(RoleList.ROLE_PROFESSIONAL).get());
        user.setRoles(roles);


        if(userService.save(user)){
            return new ResponseEntity<>(new Message("Registro exitoso! Inicie sesi??n"), HttpStatus.CREATED);
        }
        return new ResponseEntity<>(new Message("Credenciales en uso, intenta con otro usuario o email"), HttpStatus.OK);

    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/register/account")
    public ResponseEntity<?> resgisterAccount(@Valid @RequestBody NewUser newUser, BindingResult bindingResult) {

        if (bindingResult.hasErrors())
            return new ResponseEntity<>(new Message("Revise los campos e intente nuevamente"), HttpStatus.BAD_REQUEST);

        User user = new User();
        user.setUserName(newUser.getUserName());
        user.setEmail(newUser.getEmail());
        user.setPassword(passwordEncoder.encode(newUser.getPassword()));
        user.setName(newUser.getName());
        user.setRut(newUser.getRut());
        user.setNombreDoc(newUser.getNombreDoc());
        user.setIdCliente(newUser.getIdCliente());

        Set<Role> roles = new HashSet<>();
        if (newUser.getRoles().contains("ROLE_ADMIN"))
            roles.add(roleService.getByRoleName(RoleList.ROLE_ADMIN).get());
        if (newUser.getRoles().contains("ROLE_CUSTOMER"))
            roles.add(roleService.getByRoleName(RoleList.ROLE_CUSTOMER).get());
        if (newUser.getRoles().contains("ROLE_PROFESSIONAL"))
            roles.add(roleService.getByRoleName(RoleList.ROLE_PROFESSIONAL).get());
        user.setRoles(roles);
        userService.save(user);
        return new ResponseEntity<>(new Message("Usuario creado con exito!"), HttpStatus.CREATED);
    }


    @GetMapping("/profile/{userName}")
    public ResponseEntity<?> getUserByUsername(@PathVariable String userName){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(userService.getByUserName(userName));
    }

}
