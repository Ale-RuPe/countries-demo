package com.microservice.training.countriesdemo.repository.api;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.microservice.training.countriesdemo.model.entity.CountryEntity;

@Repository
public interface CountryJpaRepository extends CrudRepository<CountryEntity, Integer> {

	CountryEntity findCountryByCountryId(Integer id);

	CountryEntity findCountryByName(String countryName);

	CountryEntity findCountryByCapital(String capitalName);

	List<CountryEntity> findAllByContinent(String name);
}
