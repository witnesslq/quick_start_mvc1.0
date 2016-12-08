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
@Table(name = "news")
@DataTransferObject
public class News implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=19,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "channel_id",length=19,nullable=true,updatable=true)
	private Integer channelId;

	@RemoteProperty
	@Column(name = "title",length=255,nullable=true,updatable=true)
	private String title;

	@RemoteProperty
	@Column(name = "provider_id",length=10,nullable=true,updatable=true)
	private Integer providerId;
	
	
	public Integer getProviderId() {
		return providerId;
	}

	public void setProviderId(Integer providerId) {
		this.providerId = providerId;
	}

	@RemoteProperty
	@Column(name = "briefintro",length=255,nullable=true,updatable=true)
	private String briefintro;

	@RemoteProperty
	@Column(name = "image",length=255,nullable=true,updatable=true)
	private String image;

	@RemoteProperty
	@Column(name = "is_scroll",length=255,nullable=true,updatable=true)
	private String isScroll;

	@RemoteProperty
	@Column(name = "content",length=2147483647,nullable=true,updatable=true)
	private String content;

	@RemoteProperty
	@Column(name = "sort",length=10,nullable=true,updatable=true)
	private Integer sort;

	@RemoteProperty
	@Column(name = "status",length=255,nullable=true,updatable=true)
	private String status;

	@RemoteProperty
	@Column(name = "url",length=255,nullable=true,updatable=true)
	private String url;

	@RemoteProperty
	@Column(name = "type",length=255,nullable=true,updatable=true)
	private String type;

	@RemoteProperty
	@Column(name = "gmt_publish",length=0,nullable=true,updatable=true)
	private Date gmtPublish;

	@RemoteProperty
	@Column(name = "gmt_create",length=0,nullable=true,updatable=true)
	private Date gmtCreate;

	@RemoteProperty
	@Column(name = "gmt_modify",length=0,nullable=true,updatable=true)
	private Date gmtModify;

	@RemoteProperty
	@Column(name = "nid",length=32,nullable=true,updatable=true)
	private String nid;

	@RemoteProperty
	@Column(name = "agree_num",length=10,nullable=true,updatable=true)
	private Integer agreeNum;

	@RemoteProperty
	@Column(name = "bid",length=10,nullable=true,updatable=true)
	private Integer bid;

	@RemoteProperty
	@Column(name = "caid",length=32,nullable=true,updatable=true)
	private String caid;

	@RemoteProperty
	@Column(name = "click_num",length=10,nullable=true,updatable=true)
	private Integer clickNum;

	@RemoteProperty
	@Column(name = "create_time",length=0,nullable=true,updatable=true)
	private Date createTime;

	@RemoteProperty
	@Column(name = "create_user",length=32,nullable=true,updatable=true)
	private String createUser;

	@RemoteProperty
	@Column(name = "date",length=0,nullable=true,updatable=true)
	private String date;

	@RemoteProperty
	@Column(name = "disagree_num",length=10,nullable=true,updatable=true)
	private Integer disagreeNum;

	@RemoteProperty
	@Column(name = "english_title",length=25,nullable=true,updatable=true)
	private String englishTitle;

	@RemoteProperty
	@Column(name = "hyperlink",length=255,nullable=true,updatable=true)
	private String hyperlink;

	@RemoteProperty
	@Column(name = "hyperlink_name",length=255,nullable=true,updatable=true)
	private String hyperlinkName;

	@RemoteProperty
	@Column(name = "keywords",length=100,nullable=true,updatable=true)
	private String keywords;

	@RemoteProperty
	@Column(name = "miniture",length=255,nullable=true,updatable=true)
	private String miniture;

	@RemoteProperty
	@Column(name = "mobilecontent",length=2147483647,nullable=true,updatable=true)
	private String mobilecontent;

	@RemoteProperty
	@Column(name = "modify_time",length=0,nullable=true,updatable=true)
	private Date modifyTime;

	@RemoteProperty
	@Column(name = "modify_user",length=32,nullable=true,updatable=true)
	private String modifyUser;

	@RemoteProperty
	@Column(name = "onHome",length=10,nullable=true,updatable=true)
	private Integer onhome;

	@RemoteProperty
	@Column(name = "publish_time",length=0,nullable=true,updatable=true)
	private Date publishTime;

	@RemoteProperty
	@Column(name = "seoDes",length=100,nullable=true,updatable=true)
	private String seodes;

	@RemoteProperty
	@Column(name = "seoKey",length=50,nullable=true,updatable=true)
	private String seokey;


	public void setId(Integer id){
		this.id = id;
	}

		return this.id;
	}

		this.channelId = channelId;
	}

		return this.channelId;
	}

		this.title = title;
	}

		return this.title;
	}

		this.briefintro = briefintro;
	}

		return this.briefintro;
	}

		this.image = image;
	}

		return this.image;
	}

		this.isScroll = isScroll;
	}

		return this.isScroll;
	}

		this.content = content;
	}

		return this.content;
	}

		this.sort = sort;
	}

		return this.sort;
	}

		this.status = status;
	}

		return this.status;
	}

		this.url = url;
	}

		return this.url;
	}

		this.type = type;
	}

		return this.type;
	}

		this.gmtPublish = gmtPublish;
	}

		return this.gmtPublish;
	}

		this.gmtCreate = gmtCreate;
	}

		return this.gmtCreate;
	}

		this.gmtModify = gmtModify;
	}

		return this.gmtModify;
	}

		this.nid = nid;
	}

		return this.nid;
	}

		this.agreeNum = agreeNum;
	}

		return this.agreeNum;
	}

		this.bid = bid;
	}

		return this.bid;
	}

		this.caid = caid;
	}

		return this.caid;
	}

		this.clickNum = clickNum;
	}

		return this.clickNum;
	}

		this.createTime = createTime;
	}

		return this.createTime;
	}

		this.createUser = createUser;
	}

		return this.createUser;
	}

		this.date = date;
	}

		return this.date;
	}

		this.disagreeNum = disagreeNum;
	}

		return this.disagreeNum;
	}

		this.englishTitle = englishTitle;
	}

		return this.englishTitle;
	}

		this.hyperlink = hyperlink;
	}

		return this.hyperlink;
	}

		this.hyperlinkName = hyperlinkName;
	}

		return this.hyperlinkName;
	}

		this.keywords = keywords;
	}

		return this.keywords;
	}

		this.miniture = miniture;
	}

		return this.miniture;
	}

		this.mobilecontent = mobilecontent;
	}

		return this.mobilecontent;
	}

		this.modifyTime = modifyTime;
	}

		return this.modifyTime;
	}

		this.modifyUser = modifyUser;
	}

		return this.modifyUser;
	}

		this.onhome = onhome;
	}

		return this.onhome;
	}

		this.publishTime = publishTime;
	}

		return this.publishTime;
	}

		this.seodes = seodes;
	}

		return this.seodes;
	}

		this.seokey = seokey;
	}

		return this.seokey;
	}
