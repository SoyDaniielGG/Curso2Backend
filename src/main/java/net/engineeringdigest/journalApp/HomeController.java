package net.engineeringdigest.journalApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String home() {
        return "🚀 El backend de Daniel Guerrero ITP está corriendo correctamente.";
    }

    @GetMapping("/api/hello")
    public String hello() {
        return "¡Hola, el backend está funcionando!";
    }
}
