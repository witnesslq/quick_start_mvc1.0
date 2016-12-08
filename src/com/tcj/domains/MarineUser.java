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
@Table(name = "marine_user")
@DataTransferObject
public class MarineUser implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "address",length=255,nullable=true,updatable=true)
	private String address;

	@RemoteProperty
	@Column(name = "birthday",length=0,nullable=true,updatable=true)
	private Date birthday;

	@RemoteProperty
	@Column(name = "cardId",length=45,nullable=true,updatable=true)
	private String cardid;

	@RemoteProperty
	@Column(name = "createtime",length=0,nullable=true,updatable=true)
	private Date createtime;

	@RemoteProperty
	@Column(name = "createUser",length=255,nullable=true,updatable=true)
	private String createuser;

	@RemoteProperty
	@Column(name = "eligibility_number",length=255,nullable=true,updatable=true)
	private String eligibilityNumber;

	@RemoteProperty
	@Column(name = "eligibility_valid",length=0,nullable=true,updatable=true)
	private Date eligibilityValid;

	@RemoteProperty
	@Column(name = "email",length=255,nullable=true,updatable=true)
	private String email;

	@RemoteProperty
	@Column(name = "emergency_number",length=255,nullable=true,updatable=true)
	private String emergencyNumber;

	@RemoteProperty
	@Column(name = "fax",length=50,nullable=true,updatable=true)
	private String fax;

	@RemoteProperty
	@Column(name = "gender",length=3,nullable=true,updatable=true)
	private String gender;

	@RemoteProperty
	@Column(name = "job",length=10,nullable=true,updatable=true)
	private Integer job;

	@RemoteProperty
	@Column(name = "marineId",length=255,nullable=true,updatable=true)
	private String marineid;

	@RemoteProperty
	@Column(name = "member_id",length=255,nullable=true,updatable=true)
	private String memberId;

	@RemoteProperty
	@Column(name = "mobile",length=96,nullable=true,updatable=true)
	private String mobile;

	@RemoteProperty
	@Column(name = "openId",length=255,nullable=true,updatable=true)
	private String openid;

	@RemoteProperty
	@Column(name = "passwd",length=50,nullable=true,updatable=true)
	private String passwd;

	@RemoteProperty
	@Column(name = "prepay",length=8,nullable=true,updatable=true)
	private String prepay;

	@RemoteProperty
	@Column(name = "qq",length=50,nullable=true,updatable=true)
	private String qq;

	@RemoteProperty
	@Column(name = "ships_id",length=255,nullable=true,updatable=true)
	private String shipsId;

	@RemoteProperty
	@Column(name = "status",length=10,nullable=true,updatable=true)
	private Integer status;

	@RemoteProperty
	@Column(name = "Train_valid",length=0,nullable=true,updatable=true)
	private Date trainValid;

	@RemoteProperty
	@Column(name = "updateUser",length=255,nullable=true,updatable=true)
	private String updateuser;

	@RemoteProperty
	@Column(name = "username",length=50,nullable=true,updatable=true)
	private String username;

	@RemoteProperty
	@Column(name = "userType",length=10,nullable=true,updatable=true)
	private Integer usertype;


	public void setId(Integer id){
		this.id = id;
	}

		return this.id;
	}

		this.address = address;
	}

		return this.address;
	}

		this.birthday = birthday;
	}

		return this.birthday;
	}

		this.cardid = cardid;
	}

		return this.cardid;
	}

		this.createtime = createtime;
	}

		return this.createtime;
	}

		this.createuser = createuser;
	}

		return this.createuser;
	}

		this.eligibilityNumber = eligibilityNumber;
	}

		return this.eligibilityNumber;
	}

		this.eligibilityValid = eligibilityValid;
	}

		return this.eligibilityValid;
	}

		this.email = email;
	}

		return this.email;
	}

		this.emergencyNumber = emergencyNumber;
	}

		return this.emergencyNumber;
	}

		this.fax = fax;
	}

		return this.fax;
	}

		this.gender = gender;
	}

		return this.gender;
	}

		this.job = job;
	}

		return this.job;
	}

		this.marineid = marineid;
	}

		return this.marineid;
	}

		this.memberId = memberId;
	}

		return this.memberId;
	}

		this.mobile = mobile;
	}

		return this.mobile;
	}

		this.openid = openid;
	}

		return this.openid;
	}

		this.passwd = passwd;
	}

		return this.passwd;
	}

		this.prepay = prepay;
	}

		return this.prepay;
	}

		this.qq = qq;
	}

		return this.qq;
	}

		this.shipsId = shipsId;
	}

		return this.shipsId;
	}

		this.status = status;
	}

		return this.status;
	}

		this.trainValid = trainValid;
	}

		return this.trainValid;
	}

		this.updateuser = updateuser;
	}

		return this.updateuser;
	}

		this.username = username;
	}

		return this.username;
	}

		this.usertype = usertype;
	}

		return this.usertype;
	}
