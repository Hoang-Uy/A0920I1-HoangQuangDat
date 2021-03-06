package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SanwichController {
    @GetMapping
    public String sandwich(){
        return "index";
    }

    @PostMapping("/sandwich")
    public String result(Model model, @RequestParam(required = false) String condiment){
        model.addAttribute("condiment", condiment);
        return "result";
    }
}
