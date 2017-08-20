package kovalchuk.controller.admin;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kovalchuk.entity.Brand;
import kovalchuk.entity.City;
import kovalchuk.entity.Status;
import kovalchuk.entity.Transporter;
import kovalchuk.service.BrandService;
import kovalchuk.service.CityService;
import kovalchuk.service.ModelService;
import kovalchuk.service.TransporterService;



@Controller
@RequestMapping("/admin/transporter")
public class AdminTransporterController {
	
	private final TransporterService service;
	
	@Autowired
	private CityService cityService;
	
	@Autowired
	private BrandService brandService;
	
	@Autowired
	private ModelService modelService;
	
	public AdminTransporterController(TransporterService service) {
		this.service = service;
	}
	
	@GetMapping
	public String show(Model model){
		model.addAttribute("transporters", service.findAllView());
		model.addAttribute("cities", service.findAllCity());
		model.addAttribute("brands", service.findAllBrand());
		model.addAttribute("models", service.findAllModel());
		return "transporter";
	}
	
	@GetMapping("/delete/{id}")
	public String show(@PathVariable Integer id){
		service.delete(id);
		return "redirect:/admin/transporter";
	}
	
//	@PostMapping
//	public String save(@RequestParam BigDecimal rate,
//			@RequestParam int maxWeight,
//			@RequestParam String photoUrl,
//			@RequestParam int version,
//			@RequestParam int count,
//			@RequestParam int age,
//			@RequestParam String phone,
//			@RequestParam String brand,
//			@RequestParam String model,
//			@RequestParam int carAge,
//			@RequestParam String cityArrive,
//			@RequestParam LocalDateTime dateArrive,
//			@RequestParam String status){
//		
//		Brand brand1 = brandService.findByName(brand);
//		City cityAr = cityService.findByName(cityArrive);
//	//	Model model1 = modelService.findByName(model);
//		
//		Transporter transporter = new Transporter(rate, maxWeight, photoUrl, version, count, age, phone,
//				brand, model, carAge, cityArrive, dateArrive, Status status);
//		service.save(transporter);
//		return "redirect:/admin/transporter";
//	}

}
