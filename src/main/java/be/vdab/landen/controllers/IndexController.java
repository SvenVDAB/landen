package be.vdab.landen.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Controller
@RequestMapping("/")
public class IndexController {
    IndexController() throws IOException {
/*        System.out.println("Besturingssysteem:" + System.getProperty("os.name"));
        System.out.println("Gebruikersnaam:" + System.getProperty("user.name"));
        System.out.println("Home directory van de gebruiker:" + System.getProperty("user.home"));*/
        var homeDirectory = Path.of(System.getProperty("user.home"));
        var bestand = homeDirectory.resolve("organisatie.txt");
        if (!Files.exists(bestand)) {
            Files.writeString(bestand, "VDAB");
            System.out.println(bestand + " gemaakt");
        }
    }
}
