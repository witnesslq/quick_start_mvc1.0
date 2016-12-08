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
@Table(name = "admin_manage")
@DataTransferObject
public class AdminManage implements Serializable {


	@Id

	@RemoteProperty
	@Column(name = "Id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "IS_DELETED",length=10,updatable=true)
	private Integer isDeleted;

	@RemoteProperty
	@Column(name = "create_time",length=0,nullable=true,updatable=true)
	private Date createTime;

	@RemoteProperty
	@Column(name = "create_user",length=255,nullable=true,updatable=true)
	private String createUser;

	@RemoteProperty
	@Column(name = "F3",length=255,nullable=true,updatable=true)
	private String f3;

	@RemoteProperty
	@Column(name = "F4",length=255,nullable=true,updatable=true)
	private String f4;

	@RemoteProperty
	@Column(name = "F5",length=255,nullable=true,updatable=true)
	private String f5;

	@RemoteProperty
	@Column(name = "marine_id",length=19,nullable=true,updatable=true)
	private String marineId;

	@RemoteProperty
	@Column(name = "Maritime_address",length=255,nullable=true,updatable=true)
	private String maritimeAddress;

	@RemoteProperty
	@Column(name = "Maritime_contacts",length=255,nullable=true,updatable=true)
	private String maritimeContacts;

	@RemoteProperty
	@Column(name = "Maritime_mobile",length=255,nullable=true,updatable=true)
	private String maritimeMobile;

	@RemoteProperty
	@Column(name = "Maritime_name",length=255,nullable=true,updatable=true)
	private String maritimeName;

	@RemoteProperty
	@Column(name = "update_time",length=0,nullable=true,updatable=true)
	private Date updateTime;


	public void setId(Integer id){
		this.id = id;
	}

		return this.id;
	}

		this.isDeleted = isDeleted;
	}

		return this.isDeleted;
	}

		this.createTime = createTime;
	}

		return this.createTime;
	}

		this.createUser = createUser;
	}

		return this.createUser;
	}

		this.f3 = f3;
	}

		return this.f3;
	}

		this.f4 = f4;
	}

		return this.f4;
	}

		this.f5 = f5;
	}

		return this.f5;
	}

		this.marineId = marineId;
	}

		return this.marineId;
	}

		this.maritimeAddress = maritimeAddress;
	}

		return this.maritimeAddress;
	}

		this.maritimeContacts = maritimeContacts;
	}

		return this.maritimeContacts;
	}

		this.maritimeMobile = maritimeMobile;
	}

		return this.maritimeMobile;
	}

		this.maritimeName = maritimeName;
	}

		return this.maritimeName;
	}

		this.updateTime = updateTime;
	}

		return this.updateTime;
	}
