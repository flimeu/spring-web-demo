package mark.springboot.spring_web_demo.services;

import mark.springboot.spring_web_demo.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
