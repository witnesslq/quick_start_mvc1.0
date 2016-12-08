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
@Table(name = "t_counter_info")
@DataTransferObject
public class T_Counter_Info implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "CID",length=10,updatable=true)
	private Integer cid;

	@RemoteProperty
	@Column(name = "ADDRESS",length=100,updatable=true)
	private String address;

	@RemoteProperty
	@Column(name = "CNAME",length=20,updatable=true)
	private String cname;

	@RemoteProperty
	@Column(name = "COMMENT",length=255,updatable=true)
	private String comment;

	@RemoteProperty
	@Column(name = "CREATE_TIME",length=0,updatable=true)
	private Date createTime;

	@RemoteProperty
	@Column(name = "CREATE_USER",length=10,updatable=true)
	private Integer createUser;

	@RemoteProperty
	@Column(name = "IS_BOUND",length=1,updatable=true)
	private String isBound;

	@RemoteProperty
	@Column(name = "IS_DELETED",length=1,updatable=true)
	private String isDeleted;

	@RemoteProperty
	@Column(name = "LATITUDE",length=12,updatable=true)
	private Float latitude;

	@RemoteProperty
	@Column(name = "LOGIN_PWD",length=32,updatable=true)
	private String loginPwd;

	@RemoteProperty
	@Column(name = "LONGITUDE",length=12,updatable=true)
	private Float longitude;

	@RemoteProperty
	@Column(name = "MID",length=10,updatable=true)
	private Integer mid;

	@RemoteProperty
	@Column(name = "MOBILE",length=20,updatable=true)
	private String mobile;

	@RemoteProperty
	@Column(name = "ROLE_ID",length=1,updatable=true)
	private String roleId;

	@RemoteProperty
	@Column(name = "TEL_NUM",length=20,updatable=true)
	private String telNum;

	@RemoteProperty
	@Column(name = "TEL_NUM2",length=20,updatable=true)
	private String telNum2;

	@RemoteProperty
	@Column(name = "UPDATE_TIME",length=0,updatable=true)
	private Date updateTime;

	@RemoteProperty
	@Column(name = "UPDATE_USER",length=10,updatable=true)
	private Integer updateUser;

	@RemoteProperty
	@Column(name = "WEIXIN_ID",length=30,updatable=true)
	private String weixinId;


	public void setCid(Integer cid){
		this.cid = cid;
	}

		return this.cid;
	}

		this.address = address;
	}

		return this.address;
	}

		this.cname = cname;
	}

		return this.cname;
	}

		this.comment = comment;
	}

		return this.comment;
	}

		this.createTime = createTime;
	}

		return this.createTime;
	}

		this.createUser = createUser;
	}

		return this.createUser;
	}

		this.isBound = isBound;
	}

		return this.isBound;
	}

		this.isDeleted = isDeleted;
	}

		return this.isDeleted;
	}

		this.latitude = latitude;
	}

		return this.latitude;
	}

		this.loginPwd = loginPwd;
	}

		return this.loginPwd;
	}

		this.longitude = longitude;
	}

		return this.longitude;
	}

		this.mid = mid;
	}

		return this.mid;
	}

		this.mobile = mobile;
	}

		return this.mobile;
	}

		this.roleId = roleId;
	}

		return this.roleId;
	}

		this.telNum = telNum;
	}

		return this.telNum;
	}

		this.telNum2 = telNum2;
	}

		return this.telNum2;
	}

		this.updateTime = updateTime;
	}

		return this.updateTime;
	}

		this.updateUser = updateUser;
	}

		return this.updateUser;
	}

		this.weixinId = weixinId;
	}

		return this.weixinId;
	}
