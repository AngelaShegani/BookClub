package com.betaplan.anegla.exaamdemo.repositories;

import java.util.List;

import com.betaplan.anegla.exaamdemo.models.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

    List<Book> findAll();
}
