package pro.sky.recipesapp.controllers.TestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/")
    public String helloWorld(){
        return "The application is running";

    }
    @GetMapping("/info")
    public String page(){
        return """
                Student name: Saveliy Kanygin;\s
                Project name: Recipes;\s
                Project creation date: 25.02.2023;\s
                Project description: this project was designed to share recipes""";

    }

}
