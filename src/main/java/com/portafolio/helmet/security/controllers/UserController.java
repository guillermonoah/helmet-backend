package com.portafolio.helmet.security.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.portafolio.helmet.security.services.UserService;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{userName}")
    public ResponseEntity<?> getUserByUsername(@PathVariable String userName){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(userService.getByUserName(userName));
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.userService.eliminarPorId(id);
        if (ok){
            return "Se elimino el regitro con id: "+ id;
        }else{
            return "No se pudo eliminar el regitro con id: "+ id;
        }
    }
}
