package at.spengergasse.spring_thymeleaf.controllers;

import at.spengergasse.spring_thymeleaf.entities.Videogames;
import at.spengergasse.spring_thymeleaf.entities.VideogamesRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping ("/videogames")
public class VideogamesController {
    private VideogamesRepository videogamesRepository;

    public VideogamesController(VideogamesRepository videogamesRepository) {
        this.videogamesRepository = videogamesRepository;
    }

    @GetMapping("/list")
    public String videogames(Model model) {
        model.addAttribute("videogames", videogamesRepository.findAll());
        return "videogameslist";
    }

    @GetMapping("/add")
    public String addVideogame(Model model) {
        model.addAttribute("videogames", new Videogames());
        return "add_videogames";
    }

    @PostMapping("/add")
    public String addVideogame(@ModelAttribute("videogames") Videogames videogames) {
        videogamesRepository.save(videogames);
        return "redirect:/videogames/list";
    }

    @GetMapping("/edit/{id}")
    public String editVideogame(Model model, @PathVariable Integer id) {
        model.addAttribute("videogames", videogamesRepository.findById(id));
        return "edit_videogames";
    }

    @GetMapping("/delete/{id}")
    public String deleteVideogame(@PathVariable Integer id) {
        videogamesRepository.deleteById(id);
        return "redirect:/videogames/list";
    }
    @PostMapping("/edit")
    public String editVideogame(@ModelAttribute("videogames") Videogames videogames){
        videogamesRepository.save(videogames);
        return "redirect:/videogames/list";
    }
}
