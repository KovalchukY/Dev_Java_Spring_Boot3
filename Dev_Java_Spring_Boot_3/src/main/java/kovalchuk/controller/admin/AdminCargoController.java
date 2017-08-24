package kovalchuk.controller.admin;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import kovalchuk.entity.Cargo;
import kovalchuk.entity.City;
import kovalchuk.entity.Goods;
import kovalchuk.service.CargoService;
import kovalchuk.service.CityService;
import kovalchuk.service.GoodsService;

@Controller
@RequestMapping("/admin/cargo")
@SessionAttributes("cargo")
public class AdminCargoController {
	
private final CargoService service;
	
	@Autowired
	private CityService cityService;
	
	@Autowired
	private GoodsService goodsService;
	
	public AdminCargoController(CargoService service) {
		this.service = service;
	}
	
	@ModelAttribute("cargo")
	public Cargo getForm(){
		return new Cargo();
	}
	
	@GetMapping
	public String show(Model model){
		model.addAttribute("cargos", service.findAllView());
		model.addAttribute("cities", service.findAllCity());
		model.addAttribute("goodss", service.findAllGoods());
		return "cargo";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Integer id){
		service.delete(id);
		return "redirect:/admin/cargo";
	}
	
	@PostMapping
	public String save(@ModelAttribute("cargo") Cargo cargo, SessionStatus status) {
		service.save(cargo);
		return cancel(status);
	}
	
//	@PostMapping
//	public String save(@RequestParam String goods,
//			@RequestParam int weight,
//			@RequestParam int height,
//			@RequestParam int width,
//			@RequestParam int length,
//			@RequestParam String cityFrom,
//			@RequestParam String cityTo,
//			@RequestParam BigDecimal price){
//		Goods goods1 = goodsService.findByName(goods);
//		City from = cityService.findByName(cityFrom);
//		City to = cityService.findByName(cityTo);
//		Cargo cargo = new Cargo(goods1, weight, height, width, length, from, to, price);
//		service.save(cargo);
//		return "redirect:/admin/cargo";
//	}
	
//	@GetMapping("/update/{id}")
//	public String update(@PathVariable Integer id, Model model) {
//		model.addAttribute("cargo", service.findAllView(id));
//		return show(model);
//	}
	
	
	
//	@GetMapping("/update/{id}")
//	public String update(@PathVariable Integer id, Model model){
//		model.addAttribute("cargo", service.findOne(id));
//		return show(model);
//	}
	
	@GetMapping("/cancel")
	public String cancel(SessionStatus status){
		status.setComplete();
		return "redirect:/admin/cargo";
	}
}
