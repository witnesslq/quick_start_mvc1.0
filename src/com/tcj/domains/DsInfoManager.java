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
@Table(name = "ds_info_manager")
@DataTransferObject
public class DsInfoManager implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "business_id",length=10,updatable=true)
	private Integer businessId;

	@RemoteProperty
	@Column(name = "marker_id",length=255,nullable=true,updatable=true)
	private String markerId;

	@RemoteProperty
	@Column(name = "business",length=255,nullable=true,updatable=true)
	private String business;

	@RemoteProperty
	@Column(name = "marker_name",length=255,nullable=true,updatable=true)
	private String markerName;

	@RemoteProperty
	@Column(name = "area",length=255,nullable=true,updatable=true)
	private String area;

	@RemoteProperty
	@Column(name = "number",length=255,nullable=true,updatable=true)
	private String number;


	public void setBusinessId(Integer businessId){
		this.businessId = businessId;
	}

		return this.businessId;
	}

		this.markerId = markerId;
	}

		return this.markerId;
	}

		this.business = business;
	}

		return this.business;
	}

		this.markerName = markerName;
	}

		return this.markerName;
	}

		this.area = area;
	}

		return this.area;
	}

		this.number = number;
	}

		return this.number;
	}
