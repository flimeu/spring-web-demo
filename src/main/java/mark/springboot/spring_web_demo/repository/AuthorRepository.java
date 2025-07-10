package mark.springboot.spring_web_demo.repository;

import mark.springboot.spring_web_demo.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
