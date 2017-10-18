package com.sam.spring5training.repository;

import com.sam.spring5training.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
