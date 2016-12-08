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
@Table(name = "t_order")
@DataTransferObject
public class T_Order implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "OID",length=10,updatable=true)
	private Integer oid;

	@RemoteProperty
	@Column(name = "CID",length=10,updatable=true)
	private Integer cid;

	@RemoteProperty
	@Column(name = "CNAME",length=30,updatable=true)
	private String cname;

	@RemoteProperty
	@Column(name = "CREATE_TIME",length=0,updatable=true)
	private Date createTime;

	@RemoteProperty
	@Column(name = "CREATE_USER",length=10,updatable=true)
	private Integer createUser;

	@RemoteProperty
	@Column(name = "EFFECT_DATA",length=255,updatable=true)
	private String effectData;

	@RemoteProperty
	@Column(name = "EWCODE",length=255,updatable=true)
	private String ewcode;

	@RemoteProperty
	@Column(name = "MID",length=10,updatable=true)
	private Integer mid;

	@RemoteProperty
	@Column(name = "MNAME",length=30,updatable=true)
	private String mname;

	@RemoteProperty
	@Column(name = "SID",length=10,updatable=true)
	private Integer sid;

	@RemoteProperty
	@Column(name = "TOTAL_PRICE",length=12,updatable=true)
	private Float totalPrice;

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


	public void setOid(Integer oid){
		this.oid = oid;
	}

		return this.oid;
	}

		this.cid = cid;
	}

		return this.cid;
	}

		this.cname = cname;
	}

		return this.cname;
	}

		this.createTime = createTime;
	}

		return this.createTime;
	}

		this.createUser = createUser;
	}

		return this.createUser;
	}

		this.effectData = effectData;
	}

		return this.effectData;
	}

		this.ewcode = ewcode;
	}

		return this.ewcode;
	}

		this.mid = mid;
	}

		return this.mid;
	}

		this.mname = mname;
	}

		return this.mname;
	}

		this.sid = sid;
	}

		return this.sid;
	}

		this.totalPrice = totalPrice;
	}

		return this.totalPrice;
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
