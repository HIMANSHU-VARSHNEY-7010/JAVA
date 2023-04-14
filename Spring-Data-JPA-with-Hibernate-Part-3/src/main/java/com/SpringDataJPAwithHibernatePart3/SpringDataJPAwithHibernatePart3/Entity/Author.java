package com.SpringDataJPAwithHibernatePart3.SpringDataJPAwithHibernatePart3.Entity;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "author_table")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id ;
    @Column(name = "author_name")
    private String name ;
    @Embedded
    private Address address;
    @ElementCollection()
    private List<String> subjects;

    @OneToOne(cascade = CascadeType.ALL)            // OneToOne
    @JoinColumn(name = "book_id")                   // OneToOne
    private Book book;                              // OneToOne
    public Author(int id, String name, Address address, List<String> subjects,Book book) {
        this.id = id;                               // OneToOne
        this.name = name;
        this.address = address;
        this.subjects = subjects;
        this.book = book;
    }
    public Book getBook() {                 // OneToOne
        return book;
    }
    public void setBook(Book book) {        // OneToOne
        this.book = book;
    }

//    @OneToMany(cascade = CascadeType.ALL)                           //      OneToMany Unidirectional
//    @JoinColumn(name = "author_id", referencedColumnName = "id")    //      OneToMany Unidirectional
//    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)  //      OneToMany Bidirectional without Table
//    @ManyToMany(cascade = {                                     //  ManyToMany
//            CascadeType.PERSIST,
//            CascadeType.MERGE
//    })
//    @JoinTable(name = "Author_Book",                            //  ManyToMany
//                joinColumns = { @JoinColumn(name = "author_id", referencedColumnName = "id") },
//                inverseJoinColumns = { @JoinColumn(name = "book_id", referencedColumnName = "bookId") })
//    private Set<Book> bookSet = new HashSet<Book>();            // OneToMany & ManyToMany

//        public Author(int id, String name, Address address, List<String> subjects, Set<Book> bookSet) {
//        this.id = id;                           // OneToMany & ManyToMany
//        this.name = name;
//        this.address = address;
//        this.subjects = subjects;
//        this.bookSet = bookSet;
//    }
//
//    public Set<Book> getBookSet() {               // OneToMany & ManyToMany
//        return bookSet;
//    }
//
//    public void setBookSet(Set<Book> bookSet) {  // OneToMany & ManyToMany
//        this.bookSet = bookSet;
//    }
    public Author() {
    }

//    public Author(int id, String name, Address address, List<String> subjects) {
//        this.id = id;
//        this.name = name;
//        this.address = address;
//        this.subjects = subjects;
//    }
    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", subjects=" + subjects +
                '}';
    }
}
