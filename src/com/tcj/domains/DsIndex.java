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
@Table(name = "ds_index")
@DataTransferObject
public class DsIndex implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "Id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "sequence",length=10,nullable=true,updatable=true)
	private Integer sequence;

	@RemoteProperty
	@Column(name = "picLoc",length=255,nullable=true,updatable=true)
	private String picloc;

	@RemoteProperty
	@Column(name = "content",length=255,nullable=true,updatable=true)
	private String content;

	@RemoteProperty
	@Column(name = "englishContent",length=255,nullable=true,updatable=true)
	private String englishcontent;

	@RemoteProperty
	@Column(name = "link",length=255,nullable=true,updatable=true)
	private String link;

	@RemoteProperty
	@Column(name = "category",length=255,nullable=true,updatable=true)
	private String category;

	@RemoteProperty
	@Column(name = "buildingId",length=255,nullable=true,updatable=true)
	private String buildingid;


	public void setId(Integer id){
		this.id = id;
	}

		return this.id;
	}

		this.sequence = sequence;
	}

		return this.sequence;
	}

		this.picloc = picloc;
	}

		return this.picloc;
	}

		this.content = content;
	}

		return this.content;
	}

		this.englishcontent = englishcontent;
	}

		return this.englishcontent;
	}

		this.link = link;
	}

		return this.link;
	}

		this.category = category;
	}

		return this.category;
	}

		this.buildingid = buildingid;
	}

		return this.buildingid;
	}
