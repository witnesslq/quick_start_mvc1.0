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
@Table(name = "channel")
@DataTransferObject
public class Channel implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "building_id",length=19,nullable=true,updatable=true)
	private Integer buildingId;

	@RemoteProperty
	@Column(name = "name",length=100,nullable=true,updatable=true)
	private String name;

	@RemoteProperty
	@Column(name = "status",length=3,nullable=true,updatable=true)
	private Integer status;

	@RemoteProperty
	@Column(name = "remark",length=255,nullable=true,updatable=true)
	private String remark;

	@RemoteProperty
	@Column(name = "logo",length=255,nullable=true,updatable=true)
	private String logo;

	@RemoteProperty
	@Column(name = "url",length=255,nullable=true,updatable=true)
	private String url;

	@RemoteProperty
	@Column(name = "is_display",length=3,nullable=true,updatable=true)
	private Integer isDisplay;

	@RemoteProperty
	@Column(name = "sort",length=10,nullable=true,updatable=true)
	private Integer sort;

	@RemoteProperty
	@Column(name = "create_time",length=255,nullable=true,updatable=true)
	private String createTime;

	@RemoteProperty
	@Column(name = "modify_time",length=255,nullable=true,updatable=true)
	private String modifyTime;

	@RemoteProperty
	@Column(name = "pic",length=50,nullable=true,updatable=true)
	private String pic;


	public void setId(Integer id){
		this.id = id;
	}

		return this.id;
	}

		this.buildingId = buildingId;
	}

		return this.buildingId;
	}

		this.name = name;
	}

		return this.name;
	}

		this.status = status;
	}

		return this.status;
	}

		this.remark = remark;
	}

		return this.remark;
	}

		this.logo = logo;
	}

		return this.logo;
	}

		this.url = url;
	}

		return this.url;
	}

		this.isDisplay = isDisplay;
	}

		return this.isDisplay;
	}

		this.sort = sort;
	}

		return this.sort;
	}

		this.createTime = createTime;
	}

		return this.createTime;
	}

		this.modifyTime = modifyTime;
	}

		return this.modifyTime;
	}

		this.pic = pic;
	}

		return this.pic;
	}
