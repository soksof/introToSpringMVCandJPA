package eu.codschool.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import eu.codschool.hello.entity.Person;
import eu.codschool.hello.service.PersonService;

@Controller
public class PersonController {
	private final PersonService personService;

	public PersonController(PersonService personService) {
		this.personService = personService;
	}

	@RequestMapping(value = "/person/view", method = RequestMethod.GET)
	public ModelAndView viewPerson(@ModelAttribute("person") Person p) {
		return new ModelAndView("person/view", "person", p);
	}

    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public String newPerson(ModelMap model) {
		model.addAttribute("person", new Person());
		return "person/form";
    }

	@RequestMapping(value = "/person", method = RequestMethod.POST)
	public String addPerson(@ModelAttribute("person") Person p, BindingResult result, ModelMap model) {

		if(!p.getEmail().contains("@")) {
			result.rejectValue("email", "invalid", "Person email value is invalid!");
		}
		if (result.hasErrors()) {
			return "error/person";
		}
		personService.save(p);
		model.addAttribute("message", "Person saved successfuly");
        model.addAttribute("person", p);
		return "person/view";
	}
}