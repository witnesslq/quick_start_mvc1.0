package com.tcj.domains.basicsInfo;

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
@Table(name = "t_base_area")
@DataTransferObject
public class BaseArea implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "AREA_ID",length=10,updatable=false)
	private Integer areaId;

	@RemoteProperty
	@Column(name = "AREA_CODE",length=20)
	private String areaCode;

	@RemoteProperty
	@Column(name = "F_AREA_ID",nullable=true)
	private String fAreaId;

	@RemoteProperty
	@Column(name = "AREA_NAME",length=40)
	private String areaName;

	@RemoteProperty
	@Column(name = "AREA_FULL_NAME",length=400)
	private String areaFullName;

	@RemoteProperty
	@Column(name = "GROUP_SORT",length=10,nullable=true)
	private Integer groupSort;

	@RemoteProperty
	@Column(name = "CONTACT_PERSON",length=40,nullable=true)
	private String contactPerson;

	@RemoteProperty
	@Column(name = "CELL_TEL",length=20,nullable=true)
	private String cellTel;

	@RemoteProperty
	@Column(name = "AREA_ADDRESS",length=200,nullable=true)
	private String areaAddress;

	@RemoteProperty
	@Column(name = "FOUND_DATE",length=0,nullable=true,updatable=false)
	private Date foundDate;

	@RemoteProperty
	@Column(name = "CANCEL_DATE",length=0,nullable=true)
	private Date cancelDate;

	@RemoteProperty
	@Column(name = "AREA_FAX",length=20,nullable=true)
	private String areaFax;

	@RemoteProperty
	@Column(name = "AREA_EMAIL",length=30,nullable=true)
	private String areaEmail;

	@RemoteProperty
	@Column(name = "MEMO",length=200,nullable=true)
	private String memo;

	@RemoteProperty
	@Column(name = "IS_DELETED",length=1)
	private String isDeleted;

	@RemoteProperty
	@Column(name = "CREATE_TIME",length=0,updatable=false)
	private Date createTime;

	@RemoteProperty
	@Column(name = "CREATOR",length=40,updatable=false)
	private String creator;

	@RemoteProperty
	@Column(name = "CREATOR_IP",length=15,updatable=false)
	private String creatorIp;

	@RemoteProperty
	@Column(name = "MODIFY_TIME",length=0)
	private Date modifyTime;

	@RemoteProperty
	@Column(name = "MODIFIER",length=40)
	private String modifier;

	@RemoteProperty
	@Column(name = "MODIFIER_IP",length=15)
	private String modifierIp;


	public void setAreaId(Integer areaId){
		this.areaId = areaId;
	}

		return this.areaId;
	}

		this.areaCode = areaCode;
	}

		return this.areaCode;
	}

		this.fAreaId = fAreaId;
	}

		return this.fAreaId;
	}

		this.areaName = areaName;
	}

		return this.areaName;
	}

		this.areaFullName = areaFullName;
	}

		return this.areaFullName;
	}

		this.groupSort = groupSort;
	}

		return this.groupSort;
	}

		this.contactPerson = contactPerson;
	}

		return this.contactPerson;
	}

		this.cellTel = cellTel;
	}

		return this.cellTel;
	}

		this.areaAddress = areaAddress;
	}

		return this.areaAddress;
	}

		this.foundDate = foundDate;
	}

		return this.foundDate;
	}

		this.cancelDate = cancelDate;
	}

		return this.cancelDate;
	}

		this.areaFax = areaFax;
	}

		return this.areaFax;
	}

		this.areaEmail = areaEmail;
	}

		return this.areaEmail;
	}

		this.memo = memo;
	}

		return this.memo;
	}

		this.isDeleted = isDeleted;
	}

		return this.isDeleted;
	}

		this.createTime = createTime;
	}

		return this.createTime;
	}

		this.creator = creator;
	}

		return this.creator;
	}

		this.creatorIp = creatorIp;
	}

		return this.creatorIp;
	}

		this.modifyTime = modifyTime;
	}

		return this.modifyTime;
	}

		this.modifier = modifier;
	}

		return this.modifier;
	}

		this.modifierIp = modifierIp;
	}

		return this.modifierIp;
	}
