package com.jkalango.webapi;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/Jalo")
public class AloController {
@GetMapping
    //requisição e resposta ( REQUEST E RESPONSE)
    public String aloMundo(){
        return "Hello moto \n https://youtu.be/wp1ZltRNdJs?si=7-h4rAWy_XzQyiph";
    }
}
