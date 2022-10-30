package com.portafolio.helmet.security.services;
import com.portafolio.helmet.security.entities.User;
import com.portafolio.helmet.security.entities.MainUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
    private final UserService userService;

    @Autowired
    public UserDetailsServiceImpl(UserService userService) {
        this.userService = userService;
    }
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException{
        User user = userService.getByUserName(userName).get();
        return MainUser.build(user);
    }
}
