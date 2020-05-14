package com.jackelinenascimento.bookstoremanager.repository;

import com.jackelinenascimento.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
