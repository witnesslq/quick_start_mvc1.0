package com.tcj.domains;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.directwebremoting.annotations.DataTransferObject;
import org.directwebremoting.annotations.RemoteProperty;
import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name = "codetype")
@DataTransferObject
public class CodeType implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "Id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "codeDescription",length=255,nullable=true,updatable=true)
	private String codedescription;

	@RemoteProperty
	@Column(name = "codetype",length=255,nullable=true,updatable=true)
	private String codetype;


	public void setId(Integer id){
		this.id = id;
	}

		return this.id;
	}

		this.codedescription = codedescription;
	}

		return this.codedescription;
	}

		this.codetype = codetype;
	}

		return this.codetype;
	}
