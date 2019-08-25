package com.microservice.training.countriesdemo.service.api;

import com.microservice.training.countriesdemo.model.entity.CountryEntity;

import java.util.List;

public interface ICountriesService {

	CountryEntity findCountryByCountryId(Integer id);

	CountryEntity findCountriesByName(String countryName);

	CountryEntity findCountriesByCapitalName(String capitalName);

	List<CountryEntity> findCountriesByContinentName(String continentName);

	CountryEntity createCountryByContinent(CountryEntity entity);
}
