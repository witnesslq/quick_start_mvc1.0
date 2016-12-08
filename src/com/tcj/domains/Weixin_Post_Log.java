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
@Table(name = "weixin_post_log")
@DataTransferObject
public class Weixin_Post_Log implements Serializable {
//΢�ŷ�����־��

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "Id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "recv",length=40,nullable=true,updatable=true)
	private String recv;

	@RemoteProperty
	@Column(name = "openid",length=40,nullable=true,updatable=true)
	private String openid;

	@RemoteProperty
	@Column(name = "content",length=255,nullable=true,updatable=true)
	private String content;

	@RemoteProperty
	@Column(name = "post_time",length=20,nullable=true,updatable=true)
	private String postTime;

	@RemoteProperty
	@Column(name = "flag",length=20,nullable=true,updatable=true)
	private String flag;


	public void setId(Integer id){
		this.id = id;
	}

		return this.id;
	}

		this.recv = recv;
	}

		return this.recv;
	}

		this.openid = openid;
	}

		return this.openid;
	}

		this.content = content;
	}

		return this.content;
	}

		this.postTime = postTime;
	}

		return this.postTime;
	}

		this.flag = flag;
	}

		return this.flag;
	}
