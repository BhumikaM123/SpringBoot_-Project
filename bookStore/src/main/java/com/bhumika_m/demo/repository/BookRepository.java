package com.bhumika_m.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bhumika_m.demo.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer>  {

}