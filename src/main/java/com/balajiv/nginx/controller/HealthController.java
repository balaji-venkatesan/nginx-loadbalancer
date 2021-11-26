package com.balajiv.nginx.controller;

import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HealthController {

    @RequestMapping(value = "/health", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String health(){
        return "UP";
    }
}
