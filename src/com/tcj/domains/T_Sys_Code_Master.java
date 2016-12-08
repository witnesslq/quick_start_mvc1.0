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
@Table(name = "t_sys_code_master")
@DataTransferObject
public class T_Sys_Code_Master implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "CODE_VALUE",length=4,updatable=true)
	private String codeValue;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "CODE_TYPE",length=30,updatable=true)
	private String codeType;

	@RemoteProperty
	@Column(name = "CAN_MODIFY",length=1,nullable=true,updatable=true)
	private String canModify;

	@RemoteProperty
	@Column(name = "TYPE_DESC",length=60,nullable=true,updatable=true)
	private String typeDesc;

	@RemoteProperty
	@Column(name = "CODE_NAME",length=100,nullable=true,updatable=true)
	private String codeName;

	@RemoteProperty
	@Column(name = "CODE_NAME2",length=100,nullable=true,updatable=true)
	private String codeName2;

	@RemoteProperty
	@Column(name = "CREATE_TIME",length=0,updatable=true)
	private Date createTime;

	@RemoteProperty
	@Column(name = "CREATOR",length=40,updatable=true)
	private String creator;

	@RemoteProperty
	@Column(name = "CREATOR_IP",length=15,updatable=true)
	private String creatorIp;

	@RemoteProperty
	@Column(name = "DM",length=10,nullable=true,updatable=true)
	private String dm;

	@RemoteProperty
	@Column(name = "IS_DEFAULT",length=1,nullable=true,updatable=true)
	private String isDefault;

	@RemoteProperty
	@Column(name = "IS_SYS_PROTECT",length=1,nullable=true,updatable=true)
	private String isSysProtect;

	@RemoteProperty
	@Column(name = "MEMO",length=200,nullable=true,updatable=true)
	private String memo;

	@RemoteProperty
	@Column(name = "MODIFIER",length=40,updatable=true)
	private String modifier;

	@RemoteProperty
	@Column(name = "MODIFIER_IP",length=15,updatable=true)
	private String modifierIp;

	@RemoteProperty
	@Column(name = "MODIFY_TIME",length=0,updatable=true)
	private Date modifyTime;

	@RemoteProperty
	@Column(name = "NAME_DESC",length=120,nullable=true,updatable=true)
	private String nameDesc;

	@RemoteProperty
	@Column(name = "PM",length=10,nullable=true,updatable=true)
	private String pm;

	@RemoteProperty
	@Column(name = "SORT",length=10,nullable=true,updatable=true)
	private Integer sort;


	public void setCodeValue(String codeValue){
		this.codeValue = codeValue;
	}

		return this.codeValue;
	}

		this.codeType = codeType;
	}

		return this.codeType;
	}

		this.canModify = canModify;
	}

		return this.canModify;
	}

		this.typeDesc = typeDesc;
	}

		return this.typeDesc;
	}

		this.codeName = codeName;
	}

		return this.codeName;
	}

		this.codeName2 = codeName2;
	}

		return this.codeName2;
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

		this.dm = dm;
	}

		return this.dm;
	}

		this.isDefault = isDefault;
	}

		return this.isDefault;
	}

		this.isSysProtect = isSysProtect;
	}

		return this.isSysProtect;
	}

		this.memo = memo;
	}

		return this.memo;
	}

		this.modifier = modifier;
	}

		return this.modifier;
	}

		this.modifierIp = modifierIp;
	}

		return this.modifierIp;
	}

		this.modifyTime = modifyTime;
	}

		return this.modifyTime;
	}

		this.nameDesc = nameDesc;
	}

		return this.nameDesc;
	}

		this.pm = pm;
	}

		return this.pm;
	}

		this.sort = sort;
	}

		return this.sort;
	}
