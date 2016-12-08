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
@Table(name = "brand")
@DataTransferObject
public class Brand implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "name",length=255,updatable=true)
	private String name;

	@RemoteProperty
	@Column(name = "englishname",length=255,nullable=true,updatable=true)
	private String englishname;

	@RemoteProperty
	@Column(name = "aliasname",length=255,nullable=true,updatable=true)
	private String aliasname;

	@RemoteProperty
	@Column(name = "description",length=255,nullable=true,updatable=true)
	private String description;


	public void setId(Integer id){
		this.id = id;
	}

		return this.id;
	}

		this.name = name;
	}

		return this.name;
	}

		this.englishname = englishname;
	}

		return this.englishname;
	}

		this.aliasname = aliasname;
	}

		return this.aliasname;
	}

		this.description = description;
	}

		return this.description;
	}
