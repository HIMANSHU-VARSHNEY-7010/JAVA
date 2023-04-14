package com.SpringDataJPAwithHibernatePart3.SpringDataJPAwithHibernatePart3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//	Create a class Address for Author with instance variables streetNumber, location, State.
//	Create instance variable of Address class inside Author class and save it as embedded object.
//	Introduce a List of subjects for author.
//	Persist 3 subjects for each author.
//	Create an Entity book with an instance variable bookName.
//	Implement One to One mapping between Author and Book.
//	Implement One to Many Mapping between Author and Book(Unidirectional, BiDirectional and without additional table )
//	  and implement cascade save.
//	Implement Many to Many Mapping between Author and Book.
//	Which method on the session object can be used to remove an object from the cache?
//		# We can use session evict() method to remove a single object from the hibernate first level cache.
//		# We can use session clear() method to clear the cache i.e delete all the objects from the cache.
//	What does @transactional annotation do?
//		# A Transaction represents a unit of work performed within the database management system against a database.
//		# We generally group the related work within one transaction so that if part of the work is failed
//			then entire transaction should be failed.
//		# The @Transactional annotation is the metadata that specifies the semantics of the transactions on a method.
//			We have two ways to rollback a transaction: declarative and programmatic. In the declarative approach,
//			we annotate the methods with the @Transactional annotation.
//		# We can use @Transactional to wrap a method in a database transaction. It allows us to set propagation,
//			isolation, timeout, read-only, and rollback conditions for our transaction. We can also specify the
//			transaction manager.
//		# So when you annotate a method with @Transactional , Spring dynamically creates a proxy that implements
//			the same interface(s) as the class you're annotating. And when clients make calls into your object,
//			the calls are intercepted and the behaviors injected via the proxy mechanism.
//
@SpringBootApplication
public class SpringDataJpaWithHibernatePart3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaWithHibernatePart3Application.class, args);
	}

}
