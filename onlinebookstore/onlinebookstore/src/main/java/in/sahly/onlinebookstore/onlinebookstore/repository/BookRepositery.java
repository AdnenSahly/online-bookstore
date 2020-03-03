package in.sahly.onlinebookstore.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sahly.onlinebookstore.onlinebookstore.entity.Book;

public interface BookRepositery extends JpaRepository<Book, Long> {

}
