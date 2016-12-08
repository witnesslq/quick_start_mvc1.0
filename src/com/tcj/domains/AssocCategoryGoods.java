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
@Table(name = "assoc_category_goods")
@DataTransferObject
public class AssocCategoryGoods implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "category_id",length=10,updatable=true)
	private Integer categoryId;

	@RemoteProperty
	@Column(name = "goods_id",length=10,updatable=true)
	private Integer goodsId;


	public void setId(Integer id){
		this.id = id;
	}

		return this.id;
	}

		this.categoryId = categoryId;
	}

		return this.categoryId;
	}

		this.goodsId = goodsId;
	}

		return this.goodsId;
	}
