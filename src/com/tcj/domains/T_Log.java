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
@Table(name = "t_log")
@DataTransferObject
public class T_Log implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "ID",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "AMOUNT",length=12,updatable=true)
	private Float amount;

	@RemoteProperty
	@Column(name = "CREATE_TIME",length=0,updatable=true)
	private Date createTime;

	@RemoteProperty
	@Column(name = "CREATE_USER",length=10,updatable=true)
	private Integer createUser;

	@RemoteProperty
	@Column(name = "OID",length=10,updatable=true)
	private Integer oid;

	@RemoteProperty
	@Column(name = "PAYMENT",length=12,updatable=true)
	private Float payment;

	@RemoteProperty
	@Column(name = "TAKE_DATE",length=0,updatable=true)
	private Date takeDate;

	@RemoteProperty
	@Column(name = "TYPE",length=30,updatable=true)
	private String type;

	@RemoteProperty
	@Column(name = "UID",length=10,updatable=true)
	private Integer uid;

	@RemoteProperty
	@Column(name = "UPDATE_TIME",length=0,updatable=true)
	private Date updateTime;

	@RemoteProperty
	@Column(name = "UPDATE_USER",length=10,updatable=true)
	private Integer updateUser;


	public void setId(Integer id){
		this.id = id;
	}

		return this.id;
	}

		this.amount = amount;
	}

		return this.amount;
	}

		this.createTime = createTime;
	}

		return this.createTime;
	}

		this.createUser = createUser;
	}

		return this.createUser;
	}

		this.oid = oid;
	}

		return this.oid;
	}

		this.payment = payment;
	}

		return this.payment;
	}

		this.takeDate = takeDate;
	}

		return this.takeDate;
	}

		this.type = type;
	}

		return this.type;
	}

		this.uid = uid;
	}

		return this.uid;
	}

		this.updateTime = updateTime;
	}

		return this.updateTime;
	}

		this.updateUser = updateUser;
	}

		return this.updateUser;
	}
