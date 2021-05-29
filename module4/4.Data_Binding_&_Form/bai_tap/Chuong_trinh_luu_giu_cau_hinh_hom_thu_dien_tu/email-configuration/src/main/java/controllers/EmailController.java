package controllers;

import model.Email;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmailController {

    @GetMapping("/email")
    public String viewForm(Model model){
        model.addAttribute("email",new Email());
        List<Integer> pagesizes = new ArrayList<>();
        pagesizes.add(5);
        pagesizes.add(10);
        pagesizes.add(15);
        pagesizes.add(25);
        pagesizes.add(50);
        pagesizes.add(100);
        List<String> languages = new ArrayList<>();
        languages.add("Vietnamese");
        languages.add("English");
        languages.add("Chinese");
        model.addAttribute("languages",languages);
        model.addAttribute("pagesizes",pagesizes);
        return "create";
    }

    @PostMapping("/createEmail")
    public String ViewResult(@ModelAttribute Email email, Model model){
        model.addAttribute("language",email.getLanguage());
        model.addAttribute("pageSize",email.getPageSize());
        model.addAttribute("enableSpamFilter",email.getEnableSpamFilter());
        model.addAttribute("signature",email.getSignature());
        return "result";
    }
}
