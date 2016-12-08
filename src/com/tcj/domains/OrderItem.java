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
@Table(name = "orderitem")
@DataTransferObject
public class OrderItem implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "orderinfo_id",length=10,updatable=true)
	private Integer orderinfoId;

	@RemoteProperty
	@Column(name = "itemno",length=3,updatable=true)
	private Integer itemno;

	@RemoteProperty
	@Column(name = "goods_id",length=10,updatable=true)
	private Integer goodsId;

	@RemoteProperty
	@Column(name = "goods_name",length=255,nullable=true,updatable=true)
	private String goodsName;

	@RemoteProperty
	@Column(name = "privatecode",length=255,nullable=true,updatable=true)
	private String privatecode;

	@RemoteProperty
	@Column(name = "unitprice",length=10,updatable=true)
	private String unitprice;

	@RemoteProperty
	@Column(name = "itemnum",length=10,updatable=true)
	private Integer itemnum;

	@RemoteProperty
	@Column(name = "unit",length=32,nullable=true,updatable=true)
	private String unit;

	@RemoteProperty
	@Column(name = "itemsum",length=10,updatable=true)
	private String itemsum;

	@RemoteProperty
	@Column(name = "user_id",length=10,nullable=true,updatable=true)
	private Integer userId;

	@RemoteProperty
	@Column(name = "provider_id",length=10,nullable=true,updatable=true)
	private Integer providerId;

	@RemoteProperty
	@Column(name = "goods_state",length=20,nullable=true,updatable=true)
	private String goodsState;

	@RemoteProperty
	@Column(name = "comment_id",length=10,nullable=true,updatable=true)
	private Integer commentId;

	@RemoteProperty
	@Column(name = "status",length=32,nullable=true,updatable=true)
	private String status;


	public void setId(Integer id){
		this.id = id;
	}

		return this.id;
	}

		this.orderinfoId = orderinfoId;
	}

		return this.orderinfoId;
	}

		this.itemno = itemno;
	}

		return this.itemno;
	}

		this.goodsId = goodsId;
	}

		return this.goodsId;
	}

		this.goodsName = goodsName;
	}

		return this.goodsName;
	}

		this.privatecode = privatecode;
	}

		return this.privatecode;
	}

		this.unitprice = unitprice;
	}

		return this.unitprice;
	}

		this.itemnum = itemnum;
	}

		return this.itemnum;
	}

		this.unit = unit;
	}

		return this.unit;
	}

		this.itemsum = itemsum;
	}

		return this.itemsum;
	}

		this.userId = userId;
	}

		return this.userId;
	}

		this.providerId = providerId;
	}

		return this.providerId;
	}

		this.goodsState = goodsState;
	}

		return this.goodsState;
	}

		this.commentId = commentId;
	}

		return this.commentId;
	}

		this.status = status;
	}

		return this.status;
	}
