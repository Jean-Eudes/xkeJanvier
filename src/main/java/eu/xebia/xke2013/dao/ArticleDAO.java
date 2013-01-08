package eu.xebia.xke2013.dao;

import eu.xebia.xke2013.model.Article;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Repository
public class ArticleDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public Article saveArticle(Article article) {
        entityManager.persist(article);
        return article;
    }

    public Article findArticleByCode(String code) {
        Query query = entityManager.createQuery("FROM Article a where a.code = :code");
        query.setParameter("code", code);
        return (Article) query.getSingleResult();
    }

    public Article updateArticle(Article article) {
        return entityManager.merge(article);
    }
}
