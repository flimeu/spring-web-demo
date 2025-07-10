package mark.springboot.spring_web_demo.repository;

import mark.springboot.spring_web_demo.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}
