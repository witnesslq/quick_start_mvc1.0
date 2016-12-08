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
@Table(name = "assoc_building_channel")
@DataTransferObject
public class AssocBuildingChannel implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=19,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "building_id",length=19,nullable=true,updatable=true)
	private Integer buildingId;

	@RemoteProperty
	@Column(name = "channel_id",length=19,nullable=true,updatable=true)
	private Integer channelId;


	public void setId(Integer id){
		this.id = id;
	}

		return this.id;
	}

		this.buildingId = buildingId;
	}

		return this.buildingId;
	}

		this.channelId = channelId;
	}

		return this.channelId;
	}
