package mark.springboot.spring_web_demo.repository;

import mark.springboot.spring_web_demo.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
