package com.ebsco.publications.data;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.ebsco.publications.model.Publication;


public interface PublicationRepository
extends PagingAndSortingRepository<Publication, Long>
{
	
	Publication findByName(@Param("name") String name);
	
}
