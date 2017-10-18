package com.sam.spring5training.repository;

import com.sam.spring5training.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long>{
}
