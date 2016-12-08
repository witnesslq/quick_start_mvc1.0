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
@Table(name = "weixin_receive_log")
@DataTransferObject
public class Weixin_Receive_Log implements Serializable {
//΢�Ų���������־

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "Id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "openid",length=40,nullable=true,updatable=true)
	private String openid;

	@RemoteProperty
	@Column(name = "comm",length=40,nullable=true,updatable=true)
	private String comm;

	@RemoteProperty
	@Column(name = "param",length=255,nullable=true,updatable=true)
	private String param;

	@RemoteProperty
	@Column(name = "receive_date",length=0,nullable=true,updatable=true)
	private Date receiveDate;

	@RemoteProperty
	@Column(name = "flag",length=20,nullable=true,updatable=true)
	private String flag;


	public void setId(Integer id){
		this.id = id;
	}

		return this.id;
	}

		this.openid = openid;
	}

		return this.openid;
	}

		this.comm = comm;
	}

		return this.comm;
	}

		this.param = param;
	}

		return this.param;
	}

		this.receiveDate = receiveDate;
	}

		return this.receiveDate;
	}

		this.flag = flag;
	}

		return this.flag;
	}
