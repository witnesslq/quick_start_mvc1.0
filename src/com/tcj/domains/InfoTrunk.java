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
@Table(name = "infotrunk")
@DataTransferObject
public class InfoTrunk implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "title",length=255,updatable=true)
	private String title;

	@RemoteProperty
	@Column(name = "brieftitle",length=100,nullable=true,updatable=true)
	private String brieftitle;

	@RemoteProperty
	@Column(name = "summary",length=255,nullable=true,updatable=true)
	private String summary;

	@RemoteProperty
	@Column(name = "titlecolor",length=255,nullable=true,updatable=true)
	private String titlecolor;

	@RemoteProperty
	@Column(name = "titlefont",length=255,nullable=true,updatable=true)
	private String titlefont;

	@RemoteProperty
	@Column(name = "titlefontsize",length=3,nullable=true,updatable=true)
	private Integer titlefontsize;

	@RemoteProperty
	@Column(name = "column_id",length=10,updatable=true)
	private Integer columnId;

	@RemoteProperty
	@Column(name = "subcolumn_id",length=10,nullable=true,updatable=true)
	private Integer subcolumnId;

	@RemoteProperty
	@Column(name = "author",length=255,nullable=true,updatable=true)
	private String author;

	@RemoteProperty
	@Column(name = "editor",length=255,nullable=true,updatable=true)
	private String editor;

	@RemoteProperty
	@Column(name = "source",length=255,nullable=true,updatable=true)
	private String source;

	@RemoteProperty
	@Column(name = "viewlevel",length=10,nullable=true,updatable=true)
	private Integer viewlevel;

	@RemoteProperty
	@Column(name = "istop",length=3,nullable=true,updatable=true)
	private Integer istop;

	@RemoteProperty
	@Column(name = "isrecommend",length=3,nullable=true,updatable=true)
	private Integer isrecommend;

	@RemoteProperty
	@Column(name = "ishot",length=3,nullable=true,updatable=true)
	private Integer ishot;

	@RemoteProperty
	@Column(name = "openreview",length=3,nullable=true,updatable=true)
	private Integer openreview;

	@RemoteProperty
	@Column(name = "image1",length=255,nullable=true,updatable=true)
	private String image1;

	@RemoteProperty
	@Column(name = "image2",length=255,nullable=true,updatable=true)
	private String image2;

	@RemoteProperty
	@Column(name = "image3",length=255,nullable=true,updatable=true)
	private String image3;

	@RemoteProperty
	@Column(name = "status",length=3,updatable=true)
	private Integer status;

	@RemoteProperty
	@Column(name = "creator",length=10,updatable=true)
	private Integer creator;

	@RemoteProperty
	@Column(name = "createtime",length=0,updatable=true)
	private Date createtime;

	@RemoteProperty
	@Column(name = "auditor",length=10,nullable=true,updatable=true)
	private Integer auditor;

	@RemoteProperty
	@Column(name = "audittime",length=0,nullable=true,updatable=true)
	private Date audittime;

	@RemoteProperty
	@Column(name = "modifier",length=10,nullable=true,updatable=true)
	private Integer modifier;

	@RemoteProperty
	@Column(name = "modifiedtime",length=0,nullable=true,updatable=true)
	private Date modifiedtime;

	@RemoteProperty
	@Column(name = "viewnum",length=10,updatable=true)
	private Integer viewnum;


	public void setId(Integer id){
		this.id = id;
	}

		return this.id;
	}

		this.title = title;
	}

		return this.title;
	}

		this.brieftitle = brieftitle;
	}

		return this.brieftitle;
	}

		this.summary = summary;
	}

		return this.summary;
	}

		this.titlecolor = titlecolor;
	}

		return this.titlecolor;
	}

		this.titlefont = titlefont;
	}

		return this.titlefont;
	}

		this.titlefontsize = titlefontsize;
	}

		return this.titlefontsize;
	}

		this.columnId = columnId;
	}

		return this.columnId;
	}

		this.subcolumnId = subcolumnId;
	}

		return this.subcolumnId;
	}

		this.author = author;
	}

		return this.author;
	}

		this.editor = editor;
	}

		return this.editor;
	}

		this.source = source;
	}

		return this.source;
	}

		this.viewlevel = viewlevel;
	}

		return this.viewlevel;
	}

		this.istop = istop;
	}

		return this.istop;
	}

		this.isrecommend = isrecommend;
	}

		return this.isrecommend;
	}

		this.ishot = ishot;
	}

		return this.ishot;
	}

		this.openreview = openreview;
	}

		return this.openreview;
	}

		this.image1 = image1;
	}

		return this.image1;
	}

		this.image2 = image2;
	}

		return this.image2;
	}

		this.image3 = image3;
	}

		return this.image3;
	}

		this.status = status;
	}

		return this.status;
	}

		this.creator = creator;
	}

		return this.creator;
	}

		this.createtime = createtime;
	}

		return this.createtime;
	}

		this.auditor = auditor;
	}

		return this.auditor;
	}

		this.audittime = audittime;
	}

		return this.audittime;
	}

		this.modifier = modifier;
	}

		return this.modifier;
	}

		this.modifiedtime = modifiedtime;
	}

		return this.modifiedtime;
	}

		this.viewnum = viewnum;
	}

		return this.viewnum;
	}
