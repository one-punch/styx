package com.xxshop.foundation.dao;

import com.xxshop.core.base.GenericDAO;
import com.xxshop.foundation.domain.Article;

import org.springframework.stereotype.Repository;

@Repository("articleDAO")
public class ArticleDAO extends GenericDAO<Article>
{
}

