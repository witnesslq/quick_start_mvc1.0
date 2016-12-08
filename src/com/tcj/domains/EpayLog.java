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
@Table(name = "epaylog")
@DataTransferObject
public class EpayLog implements Serializable {
//����֧����־��

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "orderNo",length=45,nullable=true,updatable=true)
	private String orderno;

	@RemoteProperty
	@Column(name = "transAmt",length=45,nullable=true,updatable=true)
	private String transamt;

	@RemoteProperty
	@Column(name = "customerName",length=45,nullable=true,updatable=true)
	private String customername;

	@RemoteProperty
	@Column(name = "customerEMail",length=45,nullable=true,updatable=true)
	private String customeremail;

	@RemoteProperty
	@Column(name = "bank",length=45,nullable=true,updatable=true)
	private String bank;

	@RemoteProperty
	@Column(name = "plain",length=512,nullable=true,updatable=true)
	private String plain;

	@RemoteProperty
	@Column(name = "signature",length=512,nullable=true,updatable=true)
	private String signature;

	@RemoteProperty
	@Column(name = "transId",length=45,nullable=true,updatable=true)
	private String transid;

	@RemoteProperty
	@Column(name = "merchantId",length=45,nullable=true,updatable=true)
	private String merchantid;

	@RemoteProperty
	@Column(name = "transDateTime",length=45,nullable=true,updatable=true)
	private String transdatetime;

	@RemoteProperty
	@Column(name = "status",length=3,nullable=true,updatable=true)
	private Integer status;

	@RemoteProperty
	@Column(name = "gmtCreate",length=0,nullable=true,updatable=true)
	private Date gmtcreate;


	public void setId(Integer id){
		this.id = id;
	}

		return this.id;
	}

		this.orderno = orderno;
	}

		return this.orderno;
	}

		this.transamt = transamt;
	}

		return this.transamt;
	}

		this.customername = customername;
	}

		return this.customername;
	}

		this.customeremail = customeremail;
	}

		return this.customeremail;
	}

		this.bank = bank;
	}

		return this.bank;
	}

		this.plain = plain;
	}

		return this.plain;
	}

		this.signature = signature;
	}

		return this.signature;
	}

		this.transid = transid;
	}

		return this.transid;
	}

		this.merchantid = merchantid;
	}

		return this.merchantid;
	}

		this.transdatetime = transdatetime;
	}

		return this.transdatetime;
	}

		this.status = status;
	}

		return this.status;
	}

		this.gmtcreate = gmtcreate;
	}

		return this.gmtcreate;
	}
