package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyController {
    @RequestMapping(value = "/currency", method = RequestMethod.GET)
    public String getCurrency(){
        return "currency";
    }

    @RequestMapping(value = "/converter", method = RequestMethod.POST)
    public String getConverter(Model model, @RequestParam String rate, String usd){
        model.addAttribute("rate", rate);
        model.addAttribute("usd", usd);
        return "converter";
    }
}
