package com.example.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.model.Laptop;

@RepositoryRestResource(collectionResourceRel = "laptop", path = "laptop")
public interface LaptopRepository extends CrudRepository<Laptop, Integer>{

}
