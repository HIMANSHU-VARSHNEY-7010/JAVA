package com.SpringDataJPAwithHibernatePart3.SpringDataJPAwithHibernatePart3.Service.Impl;

import com.SpringDataJPAwithHibernatePart3.SpringDataJPAwithHibernatePart3.Entity.Author;
import com.SpringDataJPAwithHibernatePart3.SpringDataJPAwithHibernatePart3.Entity.Book;
import com.SpringDataJPAwithHibernatePart3.SpringDataJPAwithHibernatePart3.Exception.AuthorAlreadyExistException;
import com.SpringDataJPAwithHibernatePart3.SpringDataJPAwithHibernatePart3.Exception.AuthorNotFoundException;
import com.SpringDataJPAwithHibernatePart3.SpringDataJPAwithHibernatePart3.Repository.AuthorRepository;
import com.SpringDataJPAwithHibernatePart3.SpringDataJPAwithHibernatePart3.Repository.BookRepository;
import com.SpringDataJPAwithHibernatePart3.SpringDataJPAwithHibernatePart3.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Service
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    AuthorRepository authorRepository;
    @Autowired                              //      ManyToMany
    BookRepository bookRepository;          //      ManyToMany

    public String addAuthor(Author author){
        if(getAuthById(author.getId())!=null)
            throw new AuthorAlreadyExistException("Author with id: " + author.getId() + " already exist.");
        Book book = author.getBook();                   // OneToOne
        book.setAuthor(author);                         // OneToOne
        author.setBook(book);                           // OneToOne
//        Set<Book> bookSet = author.getBookSet();        //      OneToMany Bidirectional without Table
//        for(Book book : bookSet){                       //      OneToMany Bidirectional without Table
//            book.setAuthor(author);
//        }
//        author.setBookSet(bookSet);                     //      OneToMany Bidirectional without Table

//        List<Book> bookList = bookRepository.findAll();     //      ManyToMany
//        Set<Book> bookSet = author.getBookSet();            //      ManyToMany
//        Set<Book> books = new HashSet<Book>();              //      ManyToMany
//        for(Book book : bookSet){                           //      ManyToMany
//            int count = 0;
//            for(Book buk : bookList){
//                if(buk.getBookName().equals(book.getBookName())){
//                    count++;
//                    Set<Author> authorSet = buk.getAuthorSet();
//                    authorSet.add(author);
//                    buk.setAuthorSet(authorSet);
//                    books.add(buk);
//                }
//            }
//            if(count==0){
//                Set<Author> authorSet = book.getAuthorSet();
//                authorSet.add(author);
//                book.setAuthorSet(authorSet);
//                books.add(book);
//            }
//        }
//        author.setBookSet(books);                         //      ManyToMany
        authorRepository.save(author);
        return "Author details added to author table in the Database.";
    }

    public String updateAuthor(int id,Author author){
        Author auth = getAuthorById(id);
        auth.setName(author.getName());
        auth.setAddress(author.getAddress());
        auth.setSubjects(author.getSubjects());
        auth.setBook(author.getBook());                 // OneToOne
//        auth.setBookSet(author.getBookSet());         // OneToMany & ManyToMany
        authorRepository.save(auth);
        return "Author details updated in author table in the Database.";
    }

    public String deleteAuthor(int id){
        Author author = getAuthById(id);
        if (author == null) throw new AuthorNotFoundException("Author with id: " + id + " not Found.");
        else authorRepository.deleteById(id);
        return "Author details deleted from author table in the Database.";
    }

    public List<Author> getAuthor(){
        List<Author> authorList = authorRepository.findAll();
        if(authorList.size()==0) throw new AuthorNotFoundException("Author Table is Empty.");
        else return authorList;
    }
    public Author getAuthorById(int id) {
        Author author = getAuthById(id);
        if (author == null) throw new AuthorNotFoundException("Author with id: " + id + " not Found.");
        else return author;
    }
    public Author getAuthById(int id) {
        List<Author> authorList = authorRepository.findAll();
        Author author = authorList.stream()
                .filter(e -> Objects.equals(e.getId(), id))
                .findFirst().orElse(null);
        return author;
    }

}
