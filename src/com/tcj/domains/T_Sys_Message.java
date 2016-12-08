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
@Table(name = "t_sys_message")
@DataTransferObject
public class T_Sys_Message implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "MESSAGE_ID",length=10,updatable=true)
	private Integer messageId;

	@RemoteProperty
	@Column(name = "IS_READ",length=1,updatable=true)
	private String isRead;

	@RemoteProperty
	@Column(name = "MESSAGE_CONTENT",length=2147483647,updatable=true)
	private String messageContent;

	@RemoteProperty
	@Column(name = "RECEIVE_USER_ID",length=10,updatable=true)
	private Integer receiveUserId;

	@RemoteProperty
	@Column(name = "SEND_USER_ID",length=10,updatable=true)
	private Integer sendUserId;


	public void setMessageId(Integer messageId){
		this.messageId = messageId;
	}

		return this.messageId;
	}

		this.isRead = isRead;
	}

		return this.isRead;
	}

		this.messageContent = messageContent;
	}

		return this.messageContent;
	}

		this.receiveUserId = receiveUserId;
	}

		return this.receiveUserId;
	}

		this.sendUserId = sendUserId;
	}

		return this.sendUserId;
	}
