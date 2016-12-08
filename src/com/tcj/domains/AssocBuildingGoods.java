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
@Table(name = "assoc_building_goods")
@DataTransferObject
public class AssocBuildingGoods implements Serializable {
//��Ʒ��¥���ϵ��

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "goods_id",length=10,updatable=true)
	private Integer goodsId;

	@RemoteProperty
	@Column(name = "building_id",length=10,updatable=true)
	private Integer buildingId;


	public void setId(Integer id){
		this.id = id;
	}

		return this.id;
	}

		this.goodsId = goodsId;
	}

		return this.goodsId;
	}

		this.buildingId = buildingId;
	}

		return this.buildingId;
	}
