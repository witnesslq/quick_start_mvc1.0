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
@Table(name = "tbk_goods")
@DataTransferObject
public class Tbk_Goods implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=255,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "goods_id",length=255,nullable=true,updatable=true)
	private String goodsId;

	@RemoteProperty
	@Column(name = "name",length=255,nullable=true,updatable=true)
	private String name;

	@RemoteProperty
	@Column(name = "image",length=255,nullable=true,updatable=true)
	private String image;

	@RemoteProperty
	@Column(name = "goods_detail_url",length=2147483647,nullable=true,updatable=true)
	private String goodsDetailUrl;

	@RemoteProperty
	@Column(name = "status",length=255,nullable=true,updatable=true)
	private String status;

	@RemoteProperty
	@Column(name = "shop_name",length=255,nullable=true,updatable=true)
	private String shopName;

	@RemoteProperty
	@Column(name = "price",length=255,nullable=true,updatable=true)
	private Float price;

	@RemoteProperty
	@Column(name = "commodity_monthly_sales",length=255,nullable=true,updatable=true)
	private String commodityMonthlySales;

	@RemoteProperty
	@Column(name = "price_to_income",length=255,nullable=true,updatable=true)
	private String priceToIncome;

	@RemoteProperty
	@Column(name = "activity_status",length=255,nullable=true,updatable=true)
	private String activityStatus;

	@RemoteProperty
	@Column(name = "general_commission",length=255,nullable=true,updatable=true)
	private String generalCommission;

	@RemoteProperty
	@Column(name = "activity_to_income",length=255,nullable=true,updatable=true)
	private String activityToIncome;

	@RemoteProperty
	@Column(name = "activity_commission",length=255,nullable=true,updatable=true)
	private String activityCommission;

	@RemoteProperty
	@Column(name = "activity_start_time",length=0,nullable=true,updatable=true)
	private Date activityStartTime;

	@RemoteProperty
	@Column(name = "activity_end_time",length=0,nullable=true,updatable=true)
	private Date activityEndTime;

	@RemoteProperty
	@Column(name = "sales_trademanager",length=255,nullable=true,updatable=true)
	private String salesTrademanager;

	@RemoteProperty
	@Column(name = "tbk_short_url",length=2147483647,nullable=true,updatable=true)
	private String tbkShortUrl;

	@RemoteProperty
	@Column(name = "tbk_url",length=2147483647,nullable=true,updatable=true)
	private String tbkUrl;

	@RemoteProperty
	@Column(name = "amoy_password",length=255,nullable=true,updatable=true)
	private String amoyPassword;

	@RemoteProperty
	@Column(name = "total_coupon",length=255,nullable=true,updatable=true)
	private String totalCoupon;

	@RemoteProperty
	@Column(name = "coupon_surplus",length=255,nullable=true,updatable=true)
	private String couponSurplus;

	@RemoteProperty
	@Column(name = "coupon_denomination",length=255,nullable=true,updatable=true)
	private String couponDenomination;

	@RemoteProperty
	@Column(name = "coupon_start_time",length=0,nullable=true,updatable=true)
	private Date couponStartTime;

	@RemoteProperty
	@Column(name = "coupon_end_time",length=0,nullable=true,updatable=true)
	private Date couponEndTime;

	@RemoteProperty
	@Column(name = "coupon_url",length=2147483647,nullable=true,updatable=true)
	private String couponUrl;

	@RemoteProperty
	@Column(name = "coupon_face",length=255,nullable=true,updatable=true)
	private String couponFace;

	@RemoteProperty
	@Column(name = "create_time",length=0,nullable=true,updatable=true)
	private Date createTime;

	@RemoteProperty
	@Column(name = "update_time",length=0,nullable=true,updatable=true)
	private Date updateTime;

	@RemoteProperty
	@Column(name = "publish_time",length=0,nullable=true,updatable=true)
	private Date publishTime;

	@RemoteProperty
	@Column(name = "remark",length=255,nullable=true,updatable=true)
	private String remark;

	@RemoteProperty
	@Column(name = "F1",length=255,nullable=true,updatable=true)
	private Integer f1;

	@RemoteProperty
	@Column(name = "F2",length=255,nullable=true,updatable=true)
	private String f2;

	@RemoteProperty
	@Column(name = "goods_status",length=255,nullable=true,updatable=true)
	private String goodsStatus;


	public void setId(Integer id){
		this.id = id;
	}

		return this.id;
	}

		this.goodsId = goodsId;
	}

		return this.goodsId;
	}

		this.name = name;
	}

		return this.name;
	}

		this.image = image;
	}

		return this.image;
	}

		this.goodsDetailUrl = goodsDetailUrl;
	}

		return this.goodsDetailUrl;
	}

		this.status = status;
	}

		return this.status;
	}

		this.shopName = shopName;
	}

		return this.shopName;
	}

		this.price = price;
	}

		return this.price;
	}

		this.commodityMonthlySales = commodityMonthlySales;
	}

		return this.commodityMonthlySales;
	}

		this.priceToIncome = priceToIncome;
	}

		return this.priceToIncome;
	}

		this.activityStatus = activityStatus;
	}

		return this.activityStatus;
	}

		this.generalCommission = generalCommission;
	}

		return this.generalCommission;
	}

		this.activityToIncome = activityToIncome;
	}

		return this.activityToIncome;
	}

		this.activityCommission = activityCommission;
	}

		return this.activityCommission;
	}

		this.activityStartTime = activityStartTime;
	}

		return this.activityStartTime;
	}

		this.activityEndTime = activityEndTime;
	}

		return this.activityEndTime;
	}

		this.salesTrademanager = salesTrademanager;
	}

		return this.salesTrademanager;
	}

		this.tbkShortUrl = tbkShortUrl;
	}

		return this.tbkShortUrl;
	}

		this.tbkUrl = tbkUrl;
	}

		return this.tbkUrl;
	}

		this.amoyPassword = amoyPassword;
	}

		return this.amoyPassword;
	}

		this.totalCoupon = totalCoupon;
	}

		return this.totalCoupon;
	}

		this.couponSurplus = couponSurplus;
	}

		return this.couponSurplus;
	}

		this.couponDenomination = couponDenomination;
	}

		return this.couponDenomination;
	}

		this.couponStartTime = couponStartTime;
	}

		return this.couponStartTime;
	}

		this.couponEndTime = couponEndTime;
	}

		return this.couponEndTime;
	}

		this.couponUrl = couponUrl;
	}

		return this.couponUrl;
	}

		this.couponFace = couponFace;
	}

		return this.couponFace;
	}

		this.createTime = createTime;
	}

		return this.createTime;
	}

		this.updateTime = updateTime;
	}

		return this.updateTime;
	}

		this.publishTime = publishTime;
	}

		return this.publishTime;
	}

		this.remark = remark;
	}

		return this.remark;
	}

		this.f1 = f1;
	}

		return this.f1;
	}

		this.f2 = f2;
	}

		return this.f2;
	}

		this.goodsStatus = goodsStatus;
	}

		return this.goodsStatus;
	}
