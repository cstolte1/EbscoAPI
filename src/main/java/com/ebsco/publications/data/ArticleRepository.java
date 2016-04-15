package com.ebsco.publications.data;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.ebsco.publications.model.Article;

public interface ArticleRepository
extends PagingAndSortingRepository<Article, Long>
{
	
	Article findByTitle(@Param("title") String title);
	
}