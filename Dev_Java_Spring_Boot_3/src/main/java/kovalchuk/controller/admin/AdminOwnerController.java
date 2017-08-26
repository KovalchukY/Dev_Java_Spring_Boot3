package kovalchuk.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import kovalchuk.model.request.OwnerRequest;
import kovalchuk.service.OwnerService;

@Controller
@RequestMapping("/admin/owner")
@SessionAttributes("owner")
public class AdminOwnerController {
	
	private final OwnerService service;
	
	public AdminOwnerController(OwnerService service) {
		this.service = service;
	}
	
	@ModelAttribute("owner")
	public OwnerRequest getForm(){
		return new OwnerRequest();
	}
	
	@GetMapping
	public String show(Model model){
		model.addAttribute("owners", service.findAllView());
		return "owner";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Integer id){
		service.delete(id);
		return "redirect:/admin/owner";
	}
	
	@PostMapping
	public String save(@ModelAttribute("owner") OwnerRequest request, SessionStatus status){
		service.save(request);
		return cancel(status);
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable Integer id, Model model) {
		model.addAttribute("owner", service.findOne(id));
		return show(model);
	}

	@GetMapping("/cancel")
	public String cancel(SessionStatus status) {
		status.setComplete();
		return "redirect:/admin/owner";
	}
	
}
