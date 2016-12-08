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
@Table(name = "province")
@DataTransferObject
public class Pronivce implements Serializable {


	@Id
	@RemoteProperty
	@Column(name = "id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "provinceID",length=6,nullable=true,updatable=true)
	private String provinceid;

	@RemoteProperty
	@Column(name = "province",length=40,nullable=true,updatable=true)
	private String province;


	public void setId(Integer id){
		this.id = id;
	}

		return this.id;
	}

		this.provinceid = provinceid;
	}

		return this.provinceid;
	}

		this.province = province;
	}

		return this.province;
	}
