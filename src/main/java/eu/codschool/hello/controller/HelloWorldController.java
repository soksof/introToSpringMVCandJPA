package eu.codschool.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("hellomsg", "Hello World!");
        model.addAttribute("anothermessage", "Good evening!");
        return "hello";
    }

    @RequestMapping(value = "/a", method = RequestMethod.GET)
    public String welcome(ModelMap model) {
        model.addAttribute("hellomsg", "Hello World from our Controller class");
        return "welcome";
    }

    @RequestMapping(value = "/introduction", method = RequestMethod.GET)
    public String introduceYourself(ModelMap model) {
    	model.addAttribute("hellomsg", "Hello World from our Controller class. My name is ANONYMOUS");
        return "welcome";
    }
}