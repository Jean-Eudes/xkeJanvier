package eu.xebia.xke2013.services;

import eu.xebia.xke2013.dao.ArticleDAO;
import eu.xebia.xke2013.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {

    @Autowired
    private ArticleDAO articleDAO;

    public void saveArticle(Article article) {
        articleDAO.saveArticle(article);
    }

    public Article updateArticle(Article article) {
        return articleDAO.updateArticle(article);
    }

}
