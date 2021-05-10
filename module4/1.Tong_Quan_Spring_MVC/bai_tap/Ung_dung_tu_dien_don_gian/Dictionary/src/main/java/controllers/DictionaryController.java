package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    @RequestMapping("/dictionary")
    public String getDictionary(){
        return "dictionary";
    }

    @RequestMapping(value = "/translate", method = RequestMethod.POST)
    public String getTranslate(Model model, @RequestParam String txtSearch){
        model.addAttribute("txtSearch", txtSearch);
        return "translate";
    }
}
