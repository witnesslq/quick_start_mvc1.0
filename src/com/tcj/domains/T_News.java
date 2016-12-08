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
@Table(name = "t_news")
@DataTransferObject
public class T_News implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "NID",length=10,updatable=true)
	private Integer nid;

	@RemoteProperty
	@Column(name = "CONTENT",length=255,updatable=true)
	private String content;

	@RemoteProperty
	@Column(name = "CREATE_TIME",length=0,updatable=true)
	private Date createTime;

	@RemoteProperty
	@Column(name = "CREATE_USER",length=10,updatable=true)
	private Integer createUser;

	@RemoteProperty
	@Column(name = "IS_RECOMMENDED",length=1,updatable=true)
	private String isRecommended;

	@RemoteProperty
	@Column(name = "KEYWORDS",length=255,updatable=true)
	private String keywords;

	@RemoteProperty
	@Column(name = "PIC",length=255,updatable=true)
	private String pic;

	@RemoteProperty
	@Column(name = "TITLE",length=255,updatable=true)
	private String title;

	@RemoteProperty
	@Column(name = "TYPE",length=255,updatable=true)
	private String type;

	@RemoteProperty
	@Column(name = "UPDATE_TIME",length=0,updatable=true)
	private Date updateTime;

	@RemoteProperty
	@Column(name = "UPDATE_USER",length=10,updatable=true)
	private Integer updateUser;


	public void setNid(Integer nid){
		this.nid = nid;
	}

		return this.nid;
	}

		this.content = content;
	}

		return this.content;
	}

		this.createTime = createTime;
	}

		return this.createTime;
	}

		this.createUser = createUser;
	}

		return this.createUser;
	}

		this.isRecommended = isRecommended;
	}

		return this.isRecommended;
	}

		this.keywords = keywords;
	}

		return this.keywords;
	}

		this.pic = pic;
	}

		return this.pic;
	}

		this.title = title;
	}

		return this.title;
	}

		this.type = type;
	}

		return this.type;
	}

		this.updateTime = updateTime;
	}

		return this.updateTime;
	}

		this.updateUser = updateUser;
	}

		return this.updateUser;
	}
