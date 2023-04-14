package com.SpringDataJPAwithHibernatePart3.SpringDataJPAwithHibernatePart3.Controller;

import com.SpringDataJPAwithHibernatePart3.SpringDataJPAwithHibernatePart3.Entity.Author;
import com.SpringDataJPAwithHibernatePart3.SpringDataJPAwithHibernatePart3.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @PostMapping("/author")
    public String createAuthor(@RequestBody Author author){
        String result;
        result = authorService.addAuthor(author);
        return result;
    }

    @PutMapping("/author/{id}")
    public String updateAuthorByID(@PathVariable int id,@RequestBody Author author){
        String result;
        result = authorService.updateAuthor(id, author);
        return result;
    }

    @DeleteMapping("/author/{id}")
    public String deleteAuthorByID(@PathVariable int id){
        String result;
        result = authorService.deleteAuthor(id);
        return result;
    }


    @GetMapping("/author")
    public List<Author> findAllAuthor(){
        List<Author> employeeList;
        employeeList = authorService.getAuthor();
        return employeeList;
    }

    @GetMapping("/author/{id}")
    public Author findAuthorByID(@PathVariable int id){
        Author author;
        author = authorService.getAuthorById(id);
        return author;
    }

}
