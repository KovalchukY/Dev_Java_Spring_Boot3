package kovalchuk.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kovalchuk.service.ModelService;

@Controller
@RequestMapping("/admin/model")
public class AdminModelController {

	private final ModelService service;

	@Autowired
	public AdminModelController(ModelService service) {
		this.service = service;
	}
	
	@GetMapping
	public String show(Model model) {
		model.addAttribute("models", service.findAll());
		return "model";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Integer id) {
		service.delete(id);
		return "redirect:/admin/model";
	}
	
	@PostMapping
	public String save(@RequestParam String name) {
		service.save(new kovalchuk.entity.Model(name));
		return "redirect:/admin/model";
	}
	
}
