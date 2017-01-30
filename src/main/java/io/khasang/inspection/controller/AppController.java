package io.khasang.inspection.controller;

import io.khasang.inspection.messaging.Messages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class AppController {
	@Autowired
	Messages messages;

	@RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
	public String prepareProduct(ModelMap model) {
		return "index";
	}

	@RequestMapping(value = "/allUsers", method = RequestMethod.GET)
	public String allUsers(Model model) {
		model.addAttribute("allUsers", messages.getUserList());
		return "users";
	}

	@RequestMapping(value = "/allMessages", method = RequestMethod.GET)
	public String allMessages(Model model) {
		model.addAttribute("allMessages", messages.getMessageList());
		return "messages";
	}
}
