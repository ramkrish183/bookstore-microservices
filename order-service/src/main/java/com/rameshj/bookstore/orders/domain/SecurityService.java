package com.rameshj.bookstore.orders.domain;

import org.springframework.stereotype.Service;

@Service
public class SecurityService {

    public String getLoginUserName() {
         return "user";
       // JwtAuthenticationToken authentication =
       //         (JwtAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
       // Jwt jwt = (Jwt) authentication.getPrincipal();
        /*
        var username = jwt.getClaimAsString("preferred_username");
        var email = jwt.getClaimAsString("email");
        var name = jwt.getClaimAsString("name");
        var token = jwt.getTokenValue();
        var authorities = authentication.getAuthorities();
        */
        //return jwt.getClaimAsString("preferred_username");
    }
}