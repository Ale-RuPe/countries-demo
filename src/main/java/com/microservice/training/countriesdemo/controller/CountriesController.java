package com.microservice.training.countriesdemo.controller;

import com.microservice.training.countriesdemo.model.entity.CountryEntity;
import com.microservice.training.countriesdemo.service.api.ICountriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class CountriesController {

	@Autowired
	ICountriesService countriesService;

	@GetMapping(path = "/api/countries/continent/name/{continentName}")
	public ResponseEntity<List<CountryEntity>> findCountryByContinent(@PathVariable String continentName) {
		return new ResponseEntity<List<CountryEntity>>(countriesService.findCountriesByContinentName(continentName),
				HttpStatus.OK);
	}

	@GetMapping(path = "/api/countries/country/{id}")
	public ResponseEntity<CountryEntity> findCountriesById(@PathVariable Integer id) {
		return new ResponseEntity<CountryEntity>(countriesService.findCountryByCountryId(id), HttpStatus.OK);
	}

	@GetMapping(path = "/api/countries/name/{countryName}")
	public ResponseEntity<CountryEntity> findCountryByName(@PathVariable String countryName) {
		return new ResponseEntity<CountryEntity>(countriesService.findCountriesByName(countryName), HttpStatus.OK);
	}

	@GetMapping(path = "/api/countries/capital/name/{capitalName}")
	public ResponseEntity<CountryEntity> findCountryByCapitalName(@PathVariable String capitalName) {
		return new ResponseEntity<CountryEntity>(countriesService.findCountriesByCapitalName(capitalName),
				HttpStatus.OK);
	}

	@PostMapping(path = "/api/countries/continent/createCountryByContinent")
	public ResponseEntity<CountryEntity> createCountryByContinent(@RequestBody CountryEntity country) {
		return new ResponseEntity<CountryEntity>(countriesService.createCountryByContinent(country), HttpStatus.OK);
	}
}
