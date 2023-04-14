package com.SpringDataJPAwithHibernatePart3.SpringDataJPAwithHibernatePart3.Service;


import com.SpringDataJPAwithHibernatePart3.SpringDataJPAwithHibernatePart3.Entity.Author;

import java.util.List;

public interface AuthorService {
    public List<Author> getAuthor();
    public Author getAuthorById(int id);
    public String addAuthor(Author author);
    public String updateAuthor(int id,Author author);
    public String deleteAuthor(int id);
    public Author getAuthById(int id);
}
