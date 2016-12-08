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
@Table(name = "orderentity")
@DataTransferObject
public class OrderEntity implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "OID",length=10,updatable=true)
	private Integer oid;

	@RemoteProperty
	@Column(name = "cid",length=10,nullable=true,updatable=true)
	private Integer cid;

	@RemoteProperty
	@Column(name = "cname",length=255,nullable=true,updatable=true)
	private String cname;

	@RemoteProperty
	@Column(name = "create_time",length=255,nullable=true,updatable=true)
	private String createTime;

	@RemoteProperty
	@Column(name = "gname",length=255,nullable=true,updatable=true)
	private String gname;

	@RemoteProperty
	@Column(name = "mname",length=255,nullable=true,updatable=true)
	private String mname;

	@RemoteProperty
	@Column(name = "price",length=12,nullable=true,updatable=true)
	private Float price;

	@RemoteProperty
	@Column(name = "ptotal",length=12,nullable=true,updatable=true)
	private Float ptotal;

	@RemoteProperty
	@Column(name = "quantity",length=10,nullable=true,updatable=true)
	private Integer quantity;

	@RemoteProperty
	@Column(name = "sid",length=10,nullable=true,updatable=true)
	private Integer sid;

	@RemoteProperty
	@Column(name = "type",length=255,nullable=true,updatable=true)
	private String type;

	@RemoteProperty
	@Column(name = "uid",length=10,nullable=true,updatable=true)
	private Integer uid;


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

		this.gname = gname;
	}

		return this.gname;
	}

		this.mname = mname;
	}

		return this.mname;
	}

		this.price = price;
	}

		return this.price;
	}

		this.ptotal = ptotal;
	}

		return this.ptotal;
	}

		this.quantity = quantity;
	}

		return this.quantity;
	}

		this.sid = sid;
	}

		return this.sid;
	}

		this.type = type;
	}

		return this.type;
	}

		this.uid = uid;
	}

		return this.uid;
	}
