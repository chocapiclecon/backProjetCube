package projetCubeBack.projetCubeBack.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class backController {
    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello world";
    }
}