package com.example.saigontech.article;

import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ArticleRepository extends JpaRepository<Article, Long> {
    @Query("SELECT a FROM Article a WHERE a.author = ?1")
    List<Article> findAllWrittenBy(Author author);
    @Query("SELECT a.tags FROM Article a WHERE a.title = ?1")
    List<String> findAllTagsOfArticle(String title);
    @Query("SELECT a FROM Article a where a.author = ?1 OR a.title = ?2")
    List<Article> findByAuthorOrTitle(Author author, String title);
    @Query("SELECT a.author from Article a WHERE a.title = ?1")
    Optional<Author> findAuthorOfArticleByTitle(String title);
}
