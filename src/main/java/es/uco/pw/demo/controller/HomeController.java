package es.uco.pw.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller //Este arroba controller te define un controlador del sistema
public class HomeController {
    @GetMapping("/")
    public String home() {
        return new String("home");
    }
    
}
