package com.ebsco.publications.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Issue {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column
	private long volume;
	
	@ManyToOne
	@JoinColumn
	private Publication publication;

	@ManyToMany
	private List<Article> articles;
	
	public Issue()
	{
		this.articles = new ArrayList<>();
	}
	
	public long
	getVolume() {
		return volume;
	}

	public void
	setVolume(long volume) {
		this.volume = volume;
	}

	public Publication
	getPublication() {
		return publication;
	}

	public void
	setPublication(Publication publication) {
		this.publication = publication;
	}

	public List<Article>
	getArticles() {
		return articles;
	}

	public void
	setArticles(List<Article> articles) {
		this.articles = articles;
	}
	
	
}
