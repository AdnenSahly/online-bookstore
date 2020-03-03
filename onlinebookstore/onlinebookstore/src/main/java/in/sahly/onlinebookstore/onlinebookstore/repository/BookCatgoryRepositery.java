package in.sahly.onlinebookstore.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import in.sahly.onlinebookstore.onlinebookstore.entity.BookCategorie;
@RepositoryRestResource(collectionResourceRel="bookCategory",path="book-category")
public interface BookCatgoryRepositery extends JpaRepository<BookCategorie, Long> {

}
