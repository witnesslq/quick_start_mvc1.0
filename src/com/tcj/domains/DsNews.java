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
@Table(name = "ds_news")
@DataTransferObject
public class DsNews implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "Id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "type",length=255,nullable=true,updatable=true)
	private String type;

	@RemoteProperty
	@Column(name = "content",length=65535,nullable=true,updatable=true)
	private String content;

	@RemoteProperty
	@Column(name = "time",length=255,nullable=true,updatable=true)
	private String time;

	@RemoteProperty
	@Column(name = "pictures",length=255,nullable=true,updatable=true)
	private String pictures;

	@RemoteProperty
	@Column(name = "title",length=255,nullable=true,updatable=true)
	private String title;


	public void setId(Integer id){
		this.id = id;
	}

		return this.id;
	}

		this.type = type;
	}

		return this.type;
	}

		this.content = content;
	}

		return this.content;
	}

		this.time = time;
	}

		return this.time;
	}

		this.pictures = pictures;
	}

		return this.pictures;
	}

		this.title = title;
	}

		return this.title;
	}
