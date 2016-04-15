package com.ebsco.publications.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Publication
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column
	private String name;

	@OneToMany
	private List<Issue> issues;
	
	public Publication()
	{
		this.issues = new ArrayList<>();
	}
	
	public String
	getName()
	{
		return name;
	}

	public void
	setName(String name)
	{
		this.name = name;
	}

	public List<Issue>
	getIssues() {
		return issues;
	}

	public void
	setIssues(List<Issue> issues) {
		this.issues = issues;
	}
	
	
}
