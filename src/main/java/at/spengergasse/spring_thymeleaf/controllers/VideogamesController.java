package at.spengergasse.spring_thymeleaf.controllers;

import at.spengergasse.spring_thymeleaf.entities.VideogamesRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/videogames")
public class VideogamesController {
    private VideogamesRepository videogamesRepository;

        public VideogamesController(VideogamesRepository videogamesRepository) {
            this.videogamesRepository = videogamesRepository;
        }
        @GetMapping("/list")
        public String videogames(Model model){
            model.addAttribute("videogames", videogamesRepository.findAll());
            return "videogameslist";
        }
}
