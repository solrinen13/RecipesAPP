package pro.sky.recipesapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.recipesapp.dto.InfoDTO;

import java.time.LocalDate;

@RestController
@RequestMapping("/")
public class InfoController {
private static final InfoDTO INFO = new InfoDTO("Saveliy Kanygin","recipes", LocalDate.now(),"this project was designed to share recipes");
    @GetMapping
    public String helloWorld(){
        return "The application is running";

    }
    @GetMapping("info")
    public InfoDTO page(){
        return INFO;
//        return """
//                Student name: Saveliy Kanygin;\s
//                Project name: Recipes;\s
//                Project creation date: 25.02.2023;\s
//                Project description: this project was designed to share recipes""";

    }

}
