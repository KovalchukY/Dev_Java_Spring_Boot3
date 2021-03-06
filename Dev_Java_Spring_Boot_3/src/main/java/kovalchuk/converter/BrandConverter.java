package kovalchuk.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import kovalchuk.entity.Brand;
import kovalchuk.repository.BrandRepository;

@Component
public class BrandConverter implements Converter<String, Brand> {

    private final BrandRepository repository;
	
	public BrandConverter(BrandRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public Brand convert(String name) {
		return repository.findByName(name);
	}
}
