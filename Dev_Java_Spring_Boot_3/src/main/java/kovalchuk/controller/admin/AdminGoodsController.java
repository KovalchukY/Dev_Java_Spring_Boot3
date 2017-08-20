package kovalchuk.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kovalchuk.entity.Goods;
import kovalchuk.service.GoodsService;

@Controller
@RequestMapping("/admin/goods")
public class AdminGoodsController {
	private final GoodsService service;

	@Autowired
	public AdminGoodsController(GoodsService service) {
		this.service = service;
	}
	
	@GetMapping
	public String show(Model model) {
		model.addAttribute("goods", service.findAll());
		return "goods";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Integer id) {
		service.delete(id);
		return "redirect:/admin/goods";
	}
	
	@PostMapping
	public String save(@RequestParam String name) {
		service.save(new Goods(name));
		return "redirect:/admin/goods";
	}
}
