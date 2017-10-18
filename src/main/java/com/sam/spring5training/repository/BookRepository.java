package com.sam.spring5training.repository;

import com.sam.spring5training.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long>{


}
