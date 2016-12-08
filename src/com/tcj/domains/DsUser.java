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
@Table(name = "ds_user")
@DataTransferObject
public class DsUser implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "Id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "uname",length=255,nullable=true,updatable=true)
	private String uname;

	@RemoteProperty
	@Column(name = "password",length=255,nullable=true,updatable=true)
	private String password;

	@RemoteProperty
	@Column(name = "sex",length=255,nullable=true,updatable=true)
	private String sex;

	@RemoteProperty
	@Column(name = "email",length=255,nullable=true,updatable=true)
	private String email;


	public void setId(Integer id){
		this.id = id;
	}

		return this.id;
	}

		this.uname = uname;
	}

		return this.uname;
	}

		this.password = password;
	}

		return this.password;
	}

		this.sex = sex;
	}

		return this.sex;
	}

		this.email = email;
	}

		return this.email;
	}
