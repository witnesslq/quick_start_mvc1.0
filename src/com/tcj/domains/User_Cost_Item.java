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
@Table(name = "user_cost_item")
@DataTransferObject
public class User_Cost_Item implements Serializable {
//�û����������

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "ucid",length=20,updatable=true)
	private String ucid;

	@RemoteProperty
	@Column(name = "cmid",length=20,nullable=true,updatable=true)
	private String cmid;

	@RemoteProperty
	@Column(name = "bid",length=10,nullable=true,updatable=true)
	private Integer bid;

	@RemoteProperty
	@Column(name = "apid",length=20,nullable=true,updatable=true)
	private String apid;

	@RemoteProperty
	@Column(name = "lid",length=20,nullable=true,updatable=true)
	private String lid;

	@RemoteProperty
	@Column(name = "name",length=55,nullable=true,updatable=true)
	private String name;

	@RemoteProperty
	@Column(name = "flag",length=5,nullable=true,updatable=true)
	private String flag;

	@RemoteProperty
	@Column(name = "status",length=10,nullable=true,updatable=true)
	private Integer status;

	@RemoteProperty
	@Column(name = "create_user",length=32,nullable=true,updatable=true)
	private String createUser;

	@RemoteProperty
	@Column(name = "create_time",length=0,nullable=true,updatable=true)
	private Date createTime;

	@RemoteProperty
	@Column(name = "modify_user",length=32,nullable=true,updatable=true)
	private String modifyUser;

	@RemoteProperty
	@Column(name = "modify_time",length=0,nullable=true,updatable=true)
	private Date modifyTime;


	public void setUcid(String ucid){
		this.ucid = ucid;
	}

		return this.ucid;
	}

		this.cmid = cmid;
	}

		return this.cmid;
	}

		this.bid = bid;
	}

		return this.bid;
	}

		this.apid = apid;
	}

		return this.apid;
	}

		this.lid = lid;
	}

		return this.lid;
	}

		this.name = name;
	}

		return this.name;
	}

		this.flag = flag;
	}

		return this.flag;
	}

		this.status = status;
	}

		return this.status;
	}

		this.createUser = createUser;
	}

		return this.createUser;
	}

		this.createTime = createTime;
	}

		return this.createTime;
	}

		this.modifyUser = modifyUser;
	}

		return this.modifyUser;
	}

		this.modifyTime = modifyTime;
	}

		return this.modifyTime;
	}
