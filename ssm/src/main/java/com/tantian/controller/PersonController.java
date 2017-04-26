package com.tantian.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tantian.model.Person;
import com.tantian.service.IPersonService;

@Controller
public class PersonController {

	@Autowired
	private IPersonService personService;

	public IPersonService getPersonService() {
		return personService;
	}

	@Autowired
	public void setPersonService(IPersonService personService) {
		this.personService = personService;
	}

	@RequestMapping("/showPerson.do")
	public String showPersons(Model model) {
		List<Person> persons = personService.loadPersons();
		model.addAttribute("persons", persons);
		return "test.do";
	}
}