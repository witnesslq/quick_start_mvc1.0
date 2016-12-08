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
@Table(name = "survey")
@DataTransferObject
public class Survey implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "ip",length=10,updatable=true)
	private Integer ip;

	@RemoteProperty
	@Column(name = "problem",length=255,nullable=true,updatable=true)
	private String problem;

	@RemoteProperty
	@Column(name = "type",length=255,nullable=true,updatable=true)
	private String type;

	@RemoteProperty
	@Column(name = "category",length=255,nullable=true,updatable=true)
	private String category;

	@RemoteProperty
	@Column(name = "onHome",length=255,nullable=true,updatable=true)
	private String onhome;


	public void setIp(Integer ip){
		this.ip = ip;
	}

		return this.ip;
	}

		this.problem = problem;
	}

		return this.problem;
	}

		this.type = type;
	}

		return this.type;
	}

		this.category = category;
	}

		return this.category;
	}

		this.onhome = onhome;
	}

		return this.onhome;
	}
