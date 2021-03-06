package org.employee.persistence.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class AbstractAuditable extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 7138056997693406739L;

	@Column(name = "createdby")
	private Long createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	@Column(name = "createddate")
	private Date createdDate;

	@Column(name = "lastmodifiedby")
	private Long lastModifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	@Column(name = "lastmodifieddate")
	private Date lastModifiedDate;

}