package com.ebsco.publications.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class AbstractEntity
implements PersistedEntity
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	public AbstractEntity()
	{

	}
	
//	@Override
//	public long
//	getId()
//	{
//		return this.id;
//	}
//
//	@Override
//	public void
//	setId(long id)
//	{
//		this.id = id;
//	}

}
