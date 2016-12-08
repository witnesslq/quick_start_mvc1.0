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
@Table(name = "stock_detail_log")
@DataTransferObject
public class StockDetailLog implements Serializable {
//������������־��

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "Id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "importBillID",length=255,nullable=true,updatable=true)
	private String importbillid;

	@RemoteProperty
	@Column(name = "goods_id",length=10,nullable=true,updatable=true)
	private Integer goodsId;

	@RemoteProperty
	@Column(name = "goods_name",length=255,nullable=true,updatable=true)
	private String goodsName;

	@RemoteProperty
	@Column(name = "user_name",length=255,nullable=true,updatable=true)
	private String userName;

	@RemoteProperty
	@Column(name = "miniature",length=255,nullable=true,updatable=true)
	private String miniature;

	@RemoteProperty
	@Column(name = "logType",length=255,nullable=true,updatable=true)
	private String logtype;

	@RemoteProperty
	@Column(name = "importPrice",length=10,nullable=true,updatable=true)
	private Integer importprice;

	@RemoteProperty
	@Column(name = "Quantity",length=10,nullable=true,updatable=true)
	private Integer quantity;

	@RemoteProperty
	@Column(name = "singlePrice",length=10,nullable=true,updatable=true)
	private Integer singleprice;

	@RemoteProperty
	@Column(name = "create_user",length=255,nullable=true,updatable=true)
	private String createUser;

	@RemoteProperty
	@Column(name = "create_time",length=0,nullable=true,updatable=true)
	private Date createTime;

	@RemoteProperty
	@Column(name = "update_user",length=255,nullable=true,updatable=true)
	private String updateUser;

	@RemoteProperty
	@Column(name = "update_time",length=0,nullable=true,updatable=true)
	private Date updateTime;


	public void setId(Integer id){
		this.id = id;
	}

		return this.id;
	}

		this.importbillid = importbillid;
	}

		return this.importbillid;
	}

		this.goodsId = goodsId;
	}

		return this.goodsId;
	}

		this.goodsName = goodsName;
	}

		return this.goodsName;
	}

		this.userName = userName;
	}

		return this.userName;
	}

		this.miniature = miniature;
	}

		return this.miniature;
	}

		this.logtype = logtype;
	}

		return this.logtype;
	}

		this.importprice = importprice;
	}

		return this.importprice;
	}

		this.quantity = quantity;
	}

		return this.quantity;
	}

		this.singleprice = singleprice;
	}

		return this.singleprice;
	}

		this.createUser = createUser;
	}

		return this.createUser;
	}

		this.createTime = createTime;
	}

		return this.createTime;
	}

		this.updateUser = updateUser;
	}

		return this.updateUser;
	}

		this.updateTime = updateTime;
	}

		return this.updateTime;
	}
