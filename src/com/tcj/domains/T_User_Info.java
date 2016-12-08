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
@Table(name = "t_user_info")
@DataTransferObject
public class T_User_Info implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "UID",length=10,updatable=true)
	private Integer uid;

	@RemoteProperty
	@Column(name = "ADDRESS",length=100,updatable=true)
	private String address;

	@RemoteProperty
	@Column(name = "AMOUNT",length=12,updatable=true)
	private Float amount;

	@RemoteProperty
	@Column(name = "BIRTHDAY",length=0,updatable=true)
	private Date birthday;

	@RemoteProperty
	@Column(name = "CAMOUNT_C",length=32,updatable=true)
	private String camountC;

	@RemoteProperty
	@Column(name = "COMMENT",length=255,updatable=true)
	private String comment;

	@RemoteProperty
	@Column(name = "COMPANY",length=100,updatable=true)
	private String company;

	@RemoteProperty
	@Column(name = "CREATE_TIME",length=0,updatable=true)
	private Date createTime;

	@RemoteProperty
	@Column(name = "CREATE_USER",length=10,updatable=true)
	private Integer createUser;

	@RemoteProperty
	@Column(name = "GENDER",length=30,updatable=true)
	private String gender;

	@RemoteProperty
	@Column(name = "IS_BOUND",length=1,nullable=true,updatable=true)
	private String isBound;

	@RemoteProperty
	@Column(name = "IS_DELETED",length=1,nullable=true,updatable=true)
	private String isDeleted;

	@RemoteProperty
	@Column(name = "LOGIN_PWD",length=32,updatable=true)
	private String loginPwd;

	@RemoteProperty
	@Column(name = "MOBILE",length=20,updatable=true)
	private String mobile;

	@RemoteProperty
	@Column(name = "PAY_PWD",length=32,updatable=true)
	private String payPwd;

	@RemoteProperty
	@Column(name = "ROLE_ID",length=1,nullable=true,updatable=true)
	private String roleId;

	@RemoteProperty
	@Column(name = "TAKE_DATE",length=0,updatable=true)
	private Date takeDate;

	@RemoteProperty
	@Column(name = "UNAME",length=20,updatable=true)
	private String uname;

	@RemoteProperty
	@Column(name = "UPDATE_TIME",length=0,updatable=true)
	private Date updateTime;

	@RemoteProperty
	@Column(name = "UPDATE_USER",length=10,updatable=true)
	private Integer updateUser;

	@RemoteProperty
	@Column(name = "WEIXIN_ID",length=30,updatable=true)
	private String weixinId;


	public void setUid(Integer uid){
		this.uid = uid;
	}

		return this.uid;
	}

		this.address = address;
	}

		return this.address;
	}

		this.amount = amount;
	}

		return this.amount;
	}

		this.birthday = birthday;
	}

		return this.birthday;
	}

		this.camountC = camountC;
	}

		return this.camountC;
	}

		this.comment = comment;
	}

		return this.comment;
	}

		this.company = company;
	}

		return this.company;
	}

		this.createTime = createTime;
	}

		return this.createTime;
	}

		this.createUser = createUser;
	}

		return this.createUser;
	}

		this.gender = gender;
	}

		return this.gender;
	}

		this.isBound = isBound;
	}

		return this.isBound;
	}

		this.isDeleted = isDeleted;
	}

		return this.isDeleted;
	}

		this.loginPwd = loginPwd;
	}

		return this.loginPwd;
	}

		this.mobile = mobile;
	}

		return this.mobile;
	}

		this.payPwd = payPwd;
	}

		return this.payPwd;
	}

		this.roleId = roleId;
	}

		return this.roleId;
	}

		this.takeDate = takeDate;
	}

		return this.takeDate;
	}

		this.uname = uname;
	}

		return this.uname;
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
