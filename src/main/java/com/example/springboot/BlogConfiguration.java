package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BlogConfiguration implements ApplicationRunner {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ArticleRepository articleRepository;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        User johnDoe = new User("johnDoe", "John", "Doe", "");
        userRepository.save(johnDoe);

        Article articleLorem = new Article("Lorem", "Lorem", "dolor sit amet", johnDoe, "Lorem");
        articleRepository.save(articleLorem);

        Article articleIpsum = new Article("Ipsum", "Ipsum", "dolor sit amet", johnDoe, "Ipsum");
        articleRepository.save(articleIpsum);
    }
}
