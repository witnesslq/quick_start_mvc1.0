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
@Table(name = "user_tdc")
@DataTransferObject
public class User_Tdc implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "tid",length=10,updatable=true)
	private Integer tid;

	@RemoteProperty
	@Column(name = "id",length=10,nullable=true,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "ewcode",length=255,nullable=true,updatable=true)
	private String ewcode;

	@RemoteProperty
	@Column(name = "state",length=10,updatable=true)
	private Integer state;

	@RemoteProperty
	@Column(name = "ewcodebd",length=255,nullable=true,updatable=true)
	private String ewcodebd;


	public void setTid(Integer tid){
		this.tid = tid;
	}

		return this.tid;
	}

		this.id = id;
	}

		return this.id;
	}

		this.ewcode = ewcode;
	}

		return this.ewcode;
	}

		this.state = state;
	}

		return this.state;
	}

		this.ewcodebd = ewcodebd;
	}

		return this.ewcodebd;
	}
