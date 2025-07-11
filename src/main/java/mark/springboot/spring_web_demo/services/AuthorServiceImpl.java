package mark.springboot.spring_web_demo.services;

import mark.springboot.spring_web_demo.domain.Author;
import mark.springboot.spring_web_demo.repository.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }
}
