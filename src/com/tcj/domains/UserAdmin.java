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
public class UserAdmin implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=10,updatable=false)
	private Integer id;

	@RemoteProperty
	@Column(name = "status",length=3,updatable=false)
	private Integer status;

	@RemoteProperty
	@Column(name = "ships_id",length=255,nullable=true,updatable=false)
	private String shipsId;

	@RemoteProperty
	@Column(name = "username",length=50,updatable=false)
	private String username;

	@RemoteProperty
	@Column(name = "mobile",length=96,nullable=true,updatable=false)
	private String mobile;

	@RemoteProperty
	@Column(name = "birthday",length=0,nullable=true,updatable=false)
	private Date birthday;

	@RemoteProperty
	@Column(name = "userType",length=3,updatable=false)
	private Integer usertype;

	@RemoteProperty
	@Column(name = "job",length=3,nullable=true,updatable=false)
	private Integer job;

	@RemoteProperty
	@Column(name = "eligibility_number",length=255,nullable=true,updatable=false)
	private String eligibilityNumber;

	@RemoteProperty
	@Column(name = "eligibility_valid",length=0,nullable=true,updatable=false)
	private Date eligibilityValid;

	@RemoteProperty
	@Column(name = "Train_valid",length=0,nullable=true,updatable=false)
	private Date trainValid;

	@RemoteProperty
	@Column(name = "passwd",length=50,updatable=false)
	private String passwd;

	@RemoteProperty
	@Column(name = "gender",length=3,nullable=true,updatable=false)
	private String gender;

	@RemoteProperty
	@Column(name = "fax",length=50,nullable=true,updatable=false)
	private String fax;

	@RemoteProperty
	@Column(name = "qq",length=50,nullable=true,updatable=false)
	private String qq;

	@RemoteProperty
	@Column(name = "address",length=255,nullable=true,updatable=false)
	private String address;

	@RemoteProperty
	@Column(name = "prepay",length=8,updatable=false)
	private String prepay;

	@RemoteProperty
	@Column(name = "createtime",length=0,nullable=true,updatable=false)
	private Date createtime;

	@RemoteProperty
	@Column(name = "cardId",length=45,nullable=true,updatable=false)
	private String cardid;

	@RemoteProperty
	@Column(name = "openId",length=255,nullable=true,updatable=false)
	private String openid;

	@RemoteProperty
	@Column(name = "emergency_number",length=255,nullable=true,updatable=false)
	private String emergencyNumber;

	@RemoteProperty
	@Column(name = "createUser",length=255,nullable=true,updatable=false)
	private String createuser;

	@RemoteProperty
	@Column(name = "updateUser",length=255,nullable=true,updatable=false)
	private String updateuser;

	@RemoteProperty
	@Column(name = "email",length=255,nullable=true,updatable=false)
	private String email;

	@RemoteProperty
	@Column(name = "member_id",length=255,nullable=true,updatable=false)
	private String memberId;
	
	@RemoteProperty
	@Column(name = "marineId",length=255,nullable=true,updatable=false)
	private String marineId;

	public String getMarineId() {
		return marineId;
	}

	public void setMarineId(String marineId) {
		this.marineId = marineId;
	}

	public void setId(Integer id){
		this.id = id;
	}

		return this.id;
	}

		this.status = status;
	}

		return this.status;
	}

		this.shipsId = shipsId;
	}

		return this.shipsId;
	}

		this.username = username;
	}

		return this.username;
	}

		this.mobile = mobile;
	}

		return this.mobile;
	}

		this.birthday = birthday;
	}

		return this.birthday;
	}

		this.usertype = usertype;
	}

		return this.usertype;
	}

		this.job = job;
	}

		return this.job;
	}

		this.eligibilityNumber = eligibilityNumber;
	}

		return this.eligibilityNumber;
	}

		this.eligibilityValid = eligibilityValid;
	}

		return this.eligibilityValid;
	}

		this.trainValid = trainValid;
	}

		return this.trainValid;
	}

		this.passwd = passwd;
	}

		return this.passwd;
	}

		this.gender = gender;
	}

		return this.gender;
	}

		this.fax = fax;
	}

		return this.fax;
	}

		this.qq = qq;
	}

		return this.qq;
	}

		this.address = address;
	}

		return this.address;
	}

		this.prepay = prepay;
	}

		return this.prepay;
	}

		this.createtime = createtime;
	}

		return this.createtime;
	}

		this.cardid = cardid;
	}

		return this.cardid;
	}

		this.openid = openid;
	}

		return this.openid;
	}

		this.emergencyNumber = emergencyNumber;
	}

		return this.emergencyNumber;
	}

		this.createuser = createuser;
	}

		return this.createuser;
	}

		this.updateuser = updateuser;
	}

		return this.updateuser;
	}

		this.email = email;
	}

		return this.email;
	}

		this.memberId = memberId;
	}

		return this.memberId;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", status=" + status + ", shipsId=" + shipsId
				+ ", username=" + username + ", mobile=" + mobile
				+ ", birthday=" + birthday + ", usertype=" + usertype
				+ ", job=" + job + ", eligibilityNumber=" + eligibilityNumber
				+ ", eligibilityValid=" + eligibilityValid + ", trainValid="
				+ trainValid + ", passwd=" + passwd + ", gender=" + gender
				+ ", fax=" + fax + ", qq=" + qq + ", address=" + address
				+ ", prepay=" + prepay + ", createtime=" + createtime
				+ ", cardid=" + cardid + ", openid=" + openid
				+ ", emergencyNumber=" + emergencyNumber + ", createuser="
				+ createuser + ", updateuser=" + updateuser + ", email="
				+ email + ", memberId=" + memberId + ", marineId=" + marineId
				+ "]";
	}
	
	
