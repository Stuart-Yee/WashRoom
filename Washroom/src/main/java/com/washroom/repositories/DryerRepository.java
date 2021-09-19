package com.washroom.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.washroom.models.Dryer;

@Repository
public interface DryerRepository extends CrudRepository<Dryer, Long> {

}
