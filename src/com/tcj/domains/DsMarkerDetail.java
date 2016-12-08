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
@Table(name = "ds_marker_detail")
@DataTransferObject
public class DsMarkerDetail implements Serializable {


	@RemoteProperty
	@Column(name = "map_id",length=10,updatable=true)
	private Integer mapId;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "marker_id",length=10,updatable=true)
	private Integer markerId;

	@RemoteProperty
	@Column(name = "marker_name",length=255,nullable=true,updatable=true)
	private String markerName;

	@RemoteProperty
	@Column(name = "marker_coordinate",length=255,nullable=true,updatable=true)
	private String markerCoordinate;


	public void setMapId(Integer mapId){
		this.mapId = mapId;
	}

		return this.mapId;
	}

		this.markerId = markerId;
	}

		return this.markerId;
	}

		this.markerName = markerName;
	}

		return this.markerName;
	}

		this.markerCoordinate = markerCoordinate;
	}

		return this.markerCoordinate;
	}
