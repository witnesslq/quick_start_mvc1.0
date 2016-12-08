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
@Table(name = "ds_map")
@DataTransferObject
public class DsMap implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "map_id",length=10,updatable=true)
	private Integer mapId;

	@RemoteProperty
	@Column(name = "map_name",length=255,nullable=true,updatable=true)
	private String mapName;

	@RemoteProperty
	@Column(name = "floor",length=255,nullable=true,updatable=true)
	private String floor;

	@RemoteProperty
	@Column(name = "map_level",length=255,nullable=true,updatable=true)
	private String mapLevel;

	@RemoteProperty
	@Column(name = "content",length=65535,nullable=true,updatable=true)
	private String content;


	public void setMapId(Integer mapId){
		this.mapId = mapId;
	}

		return this.mapId;
	}

		this.mapName = mapName;
	}

		return this.mapName;
	}

		this.floor = floor;
	}

		return this.floor;
	}

		this.mapLevel = mapLevel;
	}

		return this.mapLevel;
	}

		this.content = content;
	}

		return this.content;
	}
