package eu.codschool.hello.controller;

import eu.codschool.hello.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("hellomsg", "Hello World!");
        model.addAttribute("anothermessage", "Good evening!");
        return "hello";
    }

    @RequestMapping(value = "/a", method = RequestMethod.GET)
    public ModelAndView welcome() {
        ModelAndView modelAndView = new ModelAndView("welcome");
        modelAndView.addObject("hellomsg", "Hello World from our Controller class");
        return modelAndView;
    }

    @RequestMapping(value = "/introduction", method = RequestMethod.GET)
    public String introduceYourself(ModelMap model) {
    	model.addAttribute("hellomsg", "Hello World from our Controller class. My name is ANONYMOUS");
        return "welcome";
    }
}