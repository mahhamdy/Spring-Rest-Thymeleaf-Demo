package com.afaqy.demo.repository;

import com.afaqy.demo.model.Book;
import org.springframework.data.repository.CrudRepository;


/**
 * @Author: Mahmoud Hamdy
 * @Date: 2021-07-01
 */

public interface BookRepo extends CrudRepository<Book, Long> {

}
