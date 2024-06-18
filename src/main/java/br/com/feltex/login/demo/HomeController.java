package br.com.feltex.login.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "Página inicial";
    }

    @GetMapping("/privado")
    public String acessoPrivado(){
        return "Conteúdo protegido!";
    }

}
