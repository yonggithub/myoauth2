package com.example.demo.Controller;


import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @descripe:
 */

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/h")
    public String h(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "s";
    }

    @GetMapping("/j")
    public String j(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "j";
    }

}
