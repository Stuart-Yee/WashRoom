package com.washroom.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.washroom.models.Washer;

@Repository
public interface WasherRepository extends CrudRepository<Washer, Long> {

}
