package com.example.springboot;

import com.example.springboot.entity.Article;
import com.example.springboot.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/article")
public class ArticleController {

    @Autowired
    private ArticleRepository articleRepository;

    @GetMapping("/")
    public List<Article> getAllArticles() {
        return (List<Article>) articleRepository.findAll();
    }

    @GetMapping("/{slug}")
    public Article getArticleBySlug(@PathVariable String slug) {
        return articleRepository.findBySlug(slug);
    }
}
