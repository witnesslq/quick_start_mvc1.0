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
@Table(name = "payment")
@DataTransferObject
public class Payment implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=20,updatable=true)
	private String id;

	@RemoteProperty
	@Column(name = "provider_id",length=20,nullable=true,updatable=true)
	private String providerId;

	@RemoteProperty
	@Column(name = "city_id",length=10,nullable=true,updatable=true)
	private Integer cityId;

	@RemoteProperty
	@Column(name = "bid",length=20,nullable=true,updatable=true)
	private String bid;

	@RemoteProperty
	@Column(name = "alipay_name",length=20,nullable=true,updatable=true)
	private String alipayName;

	@RemoteProperty
	@Column(name = "parent_id",length=20,nullable=true,updatable=true)
	private String parentId;

	@RemoteProperty
	@Column(name = "parent_key",length=30,nullable=true,updatable=true)
	private String parentKey;

	@RemoteProperty
	@Column(name = "unified_collection_account",length=20,nullable=true,updatable=true)
	private String unifiedCollectionAccount;

	@RemoteProperty
	@Column(name = "remark",length=30,nullable=true,updatable=true)
	private String remark;

	@RemoteProperty
	@Column(name = "Actual_collection_account",length=20,nullable=true,updatable=true)
	private String actualCollectionAccount;

	@RemoteProperty
	@Column(name = "weChat_wallet",length=255,nullable=true,updatable=true)
	private String wechatWallet;

	@RemoteProperty
	@Column(name = "create_time",length=0,nullable=true,updatable=true)
	private Date createTime;

	@RemoteProperty
	@Column(name = "update_time",length=0,nullable=true,updatable=true)
	private Date updateTime;

	@RemoteProperty
	@Column(name = "create_user",length=255,nullable=true,updatable=true)
	private String createUser;

	@RemoteProperty
	@Column(name = "update_user",length=255,nullable=true,updatable=true)
	private String updateUser;


	public void setId(String id){
		this.id = id;
	}

		return this.id;
	}

		this.providerId = providerId;
	}

		return this.providerId;
	}

		this.cityId = cityId;
	}

		return this.cityId;
	}

		this.bid = bid;
	}

		return this.bid;
	}

		this.alipayName = alipayName;
	}

		return this.alipayName;
	}

		this.parentId = parentId;
	}

		return this.parentId;
	}

		this.parentKey = parentKey;
	}

		return this.parentKey;
	}

		this.unifiedCollectionAccount = unifiedCollectionAccount;
	}

		return this.unifiedCollectionAccount;
	}

		this.remark = remark;
	}

		return this.remark;
	}

		this.actualCollectionAccount = actualCollectionAccount;
	}

		return this.actualCollectionAccount;
	}

		this.wechatWallet = wechatWallet;
	}

		return this.wechatWallet;
	}

		this.createTime = createTime;
	}

		return this.createTime;
	}

		this.updateTime = updateTime;
	}

		return this.updateTime;
	}

		this.createUser = createUser;
	}

		return this.createUser;
	}

		this.updateUser = updateUser;
	}

		return this.updateUser;
	}
