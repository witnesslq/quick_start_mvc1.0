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
@Table(name = "fastservice")
@DataTransferObject
public class FastService implements Serializable {
//��ݷ����

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "name",length=255,nullable=true,updatable=true)
	private String name;

	@RemoteProperty
	@Column(name = "picture",length=255,nullable=true,updatable=true)
	private String picture;

	@RemoteProperty
	@Column(name = "url",length=255,nullable=true,updatable=true)
	private String url;

	@RemoteProperty
	@Column(name = "sort",length=10,nullable=true,updatable=true)
	private Integer sort;

	@RemoteProperty
	@Column(name = "building_id",length=10,nullable=true,updatable=true)
	private Integer buildingId;

	@RemoteProperty
	@Column(name = "create_user",length=255,nullable=true,updatable=true)
	private String createUser;

	@RemoteProperty
	@Column(name = "create_time",length=0,nullable=true,updatable=true)
	private Date createTime;

	@RemoteProperty
	@Column(name = "modify_user",length=255,nullable=true,updatable=true)
	private String modifyUser;

	@RemoteProperty
	@Column(name = "modify_time",length=0,nullable=true,updatable=true)
	private Date modifyTime;

	@RemoteProperty
	@Column(name = "is_display",length=255,nullable=true,updatable=true)
	private String isDisplay;


	public void setId(Integer id){
		this.id = id;
	}

		return this.id;
	}

		this.name = name;
	}

		return this.name;
	}

		this.picture = picture;
	}

		return this.picture;
	}

		this.url = url;
	}

		return this.url;
	}

		this.sort = sort;
	}

		return this.sort;
	}

		this.buildingId = buildingId;
	}

		return this.buildingId;
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

		this.isDisplay = isDisplay;
	}

		return this.isDisplay;
	}
