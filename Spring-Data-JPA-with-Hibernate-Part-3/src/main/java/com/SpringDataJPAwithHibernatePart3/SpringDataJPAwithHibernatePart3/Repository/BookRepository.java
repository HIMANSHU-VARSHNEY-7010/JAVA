package com.SpringDataJPAwithHibernatePart3.SpringDataJPAwithHibernatePart3.Repository;

import com.SpringDataJPAwithHibernatePart3.SpringDataJPAwithHibernatePart3.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

}
