package com.SpringDataJPAwithHibernatePart3.SpringDataJPAwithHibernatePart3.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookId;
    private String bookName;

    @JsonIgnore
//    @ManyToMany(mappedBy = "bookSet")                           //  ManyToMany
//    private Set<Author> authorSet = new HashSet<Author>();      //  ManyToMany
    @OneToOne(mappedBy = "book")                                // OneToOne
    private Author author;                                      // OneToOne
//    @ManyToOne                                                  //      OneToMany Bidirectional without Table
//    @JoinColumn(name = "author_id")                             //      OneToMany Bidirectional without Table
//    private Author author;                                      //      OneToMany Bidirectional without Table

    public Book() {
    }

//    public Book(int bookId, String bookName) {      //      OneToMany Unidirectional
//        this.bookId = bookId;
//        this.bookName = bookName;
//    }

    public Book(int bookId, String bookName, Author author) {   // OneToOne & OneToMany Bidirectional without Table
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
    }

    public Author getAuthor() {             // OneToOne & OneToMany Bidirectional without Table
        return author;
    }

    public void setAuthor(Author author) {  // OneToOne & OneToMany Bidirectional without Table
        this.author = author;
    }


//    public Book(int bookId, String bookName, Set<Author> authorSet) {   //  ManyToMany
//        this.bookId = bookId;
//        this.bookName = bookName;
//        this.authorSet = authorSet;
//    }
//    public Set<Author> getAuthorSet() {                                 //  ManyToMany
//        return authorSet;
//    }
//    public void setAuthorSet(Set<Author> authorSet) {                   //  ManyToMany
//        this.authorSet = authorSet;
//    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
