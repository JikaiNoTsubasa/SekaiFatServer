package fr.triedge.sekai.server.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(method = {RequestMethod.GET}, path = "/test")
    public String test(){

        return "Hello motto";
    }
}
