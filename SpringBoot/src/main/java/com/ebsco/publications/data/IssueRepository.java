package com.ebsco.publications.data;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.ebsco.publications.model.Issue;

public interface IssueRepository
extends PagingAndSortingRepository<Issue, Long>
{
	
	Issue findByVolume(@Param("volume") long volume);
	
}
