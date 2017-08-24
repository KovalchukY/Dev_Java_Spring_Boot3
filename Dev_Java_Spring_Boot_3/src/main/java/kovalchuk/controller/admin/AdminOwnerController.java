package kovalchuk.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kovalchuk.entity.Owner;
import kovalchuk.service.OwnerService;

@Controller
@RequestMapping("/admin/owner")
public class AdminOwnerController {
	
	private final OwnerService service;
	
	public AdminOwnerController(OwnerService service) {
		this.service = service;
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
	public String save(@RequestParam String phone,
			@RequestParam int count,
			@RequestParam String address,
			@RequestParam String name){
		Owner owner = new Owner(phone, count, address);
		owner.setName(name);
		service.save(owner);
		return "redirect:/admin/owner";
	}
}
