package com.microservice.training.countriesdemo.service;

import com.microservice.training.countriesdemo.model.entity.CountryEntity;
import com.microservice.training.countriesdemo.repository.api.CountryJpaRepository;
import com.microservice.training.countriesdemo.service.api.ICountriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import com.microservice.training.countriesdemo.errorhandling.InvalidContinentException;
//import com.microservice.training.countriesdemo.repository.api.ICountriesRepository;

import java.util.List;

@Service
public class CountriesService implements ICountriesService {
	@Autowired
	CountryJpaRepository countriesRepo;

	public CountryEntity findCountryByCountryId(Integer id) {
		return countriesRepo.findCountryByCountryId(id);
	}

	public CountryEntity findCountriesByName(String countryName) {
		return countriesRepo.findCountryByName(countryName);
	}

	public CountryEntity findCountriesByCapitalName(String capitalName) {
		return countriesRepo.findCountryByCapital(capitalName);
	}

	public List<CountryEntity> findCountriesByContinentName(String continentName) {
		return countriesRepo.findAllByContinent(continentName);
	}

	public CountryEntity createCountryByContinent(CountryEntity entity) {
		return countriesRepo.save(entity);
	}
}
