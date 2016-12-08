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
@Table(name = "outpay")
@DataTransferObject
public class OutPay implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "outPayId",length=10,updatable=true)
	private Integer outpayid;

	@RemoteProperty
	@Column(name = "requestId",length=19,updatable=true)
	private Integer requestid;

	@RemoteProperty
	@Column(name = "payType",length=3,updatable=true)
	private Integer paytype;

	@RemoteProperty
	@Column(name = "userId",length=10,nullable=true,updatable=true)
	private Integer userid;

	@RemoteProperty
	@Column(name = "amount",length=10,updatable=true)
	private Integer amount;

	@RemoteProperty
	@Column(name = "status",length=3,updatable=true)
	private Integer status;

	@RemoteProperty
	@Column(name = "outStatus",length=32,nullable=true,updatable=true)
	private String outstatus;

	@RemoteProperty
	@Column(name = "outId",length=32,nullable=true,updatable=true)
	private String outid;

	@RemoteProperty
	@Column(name = "created",length=10,nullable=true,updatable=true)
	private Integer created;

	@RemoteProperty
	@Column(name = "updated",length=10,nullable=true,updatable=true)
	private Integer updated;


	public void setOutpayid(Integer outpayid){
		this.outpayid = outpayid;
	}

		return this.outpayid;
	}

		this.requestid = requestid;
	}

		return this.requestid;
	}

		this.paytype = paytype;
	}

		return this.paytype;
	}

		this.userid = userid;
	}

		return this.userid;
	}

		this.amount = amount;
	}

		return this.amount;
	}

		this.status = status;
	}

		return this.status;
	}

		this.outstatus = outstatus;
	}

		return this.outstatus;
	}

		this.outid = outid;
	}

		return this.outid;
	}

		this.created = created;
	}

		return this.created;
	}

		this.updated = updated;
	}

		return this.updated;
	}
