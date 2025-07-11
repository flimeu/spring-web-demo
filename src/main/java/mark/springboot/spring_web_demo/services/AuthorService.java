package mark.springboot.spring_web_demo.services;

import mark.springboot.spring_web_demo.domain.Author;

public interface AuthorService {

    Iterable<Author> findAll();
}
