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
@Table(name = "t_lease_house_info")
@DataTransferObject
public class T_Lease_House_Info implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "HOUSE_INFO_ID",length=10,updatable=true)
	private Integer houseInfoId;

	@RemoteProperty
	@Column(name = "BUILDING_NO",length=4,updatable=true)
	private String buildingNo;

	@RemoteProperty
	@Column(name = "BUILDING_ROOM",length=6,updatable=true)
	private String buildingRoom;

	@RemoteProperty
	@Column(name = "BUILDING_TYPE",length=4,updatable=true)
	private String buildingType;

	@RemoteProperty
	@Column(name = "BUILDING_UNIT",length=2,updatable=true)
	private String buildingUnit;

	@RemoteProperty
	@Column(name = "CHECK_OPINION",length=100,updatable=true)
	private String checkOpinion;

	@RemoteProperty
	@Column(name = "CHECK_RESULT",length=1,updatable=true)
	private String checkResult;

	@RemoteProperty
	@Column(name = "CHECK_TIME",length=0,updatable=true)
	private Date checkTime;

	@RemoteProperty
	@Column(name = "CHECK_USER_ID",length=10,updatable=true)
	private Integer checkUserId;

	@RemoteProperty
	@Column(name = "CQRDZWTS_PATH",length=100,updatable=true)
	private String cqrdzwtsPath;

	@RemoteProperty
	@Column(name = "CREATE_TIME",length=0,updatable=true)
	private Date createTime;

	@RemoteProperty
	@Column(name = "CREATOR",length=40,updatable=true)
	private String creator;

	@RemoteProperty
	@Column(name = "CREATOR_IP",length=15,updatable=true)
	private String creatorIp;

	@RemoteProperty
	@Column(name = "DECORATION",length=4,updatable=true)
	private String decoration;

	@RemoteProperty
	@Column(name = "END_DATE",length=0,updatable=true)
	private Date endDate;

	@RemoteProperty
	@Column(name = "FLOOR_CNT",length=10,updatable=true)
	private Integer floorCnt;

	@RemoteProperty
	@Column(name = "FLOOR_NUM",length=10,updatable=true)
	private Integer floorNum;

	@RemoteProperty
	@Column(name = "HAVE_AC",length=1,updatable=true)
	private String haveAc;

	@RemoteProperty
	@Column(name = "HAVE_BED",length=1,updatable=true)
	private String haveBed;

	@RemoteProperty
	@Column(name = "HAVE_KITCHEN_BATH",length=1,updatable=true)
	private String haveKitchenBath;

	@RemoteProperty
	@Column(name = "HAVE_NETWORK",length=1,updatable=true)
	private String haveNetwork;

	@RemoteProperty
	@Column(name = "HAVE_REFRIGERATOR",length=1,updatable=true)
	private String haveRefrigerator;

	@RemoteProperty
	@Column(name = "HAVE_TV",length=1,updatable=true)
	private String haveTv;

	@RemoteProperty
	@Column(name = "HAVE_WASHING_MACHINE",length=1,updatable=true)
	private String haveWashingMachine;

	@RemoteProperty
	@Column(name = "HAVE_WATER_HEATER",length=1,updatable=true)
	private String haveWaterHeater;

	@RemoteProperty
	@Column(name = "HOUSE_ADD",length=200,updatable=true)
	private String houseAdd;

	@RemoteProperty
	@Column(name = "HOUSE_CODE",length=11,updatable=true)
	private String houseCode;

	@RemoteProperty
	@Column(name = "HOUSE_IMAGE_PATH1",length=100,updatable=true)
	private String houseImagePath1;

	@RemoteProperty
	@Column(name = "HOUSE_IMAGE_PATH2",length=100,updatable=true)
	private String houseImagePath2;

	@RemoteProperty
	@Column(name = "HOUSE_IMAGE_PATH3",length=100,updatable=true)
	private String houseImagePath3;

	@RemoteProperty
	@Column(name = "HOUSE_TYPE",length=4,updatable=true)
	private String houseType;

	@RemoteProperty
	@Column(name = "IS_DELETED",length=1,updatable=true)
	private String isDeleted;

	@RemoteProperty
	@Column(name = "LEASE_STATUS",length=1,updatable=true)
	private String leaseStatus;

	@RemoteProperty
	@Column(name = "LEASE_TYPE",length=4,updatable=true)
	private String leaseType;

	@RemoteProperty
	@Column(name = "LEASER_USER_ID",length=10,updatable=true)
	private Integer leaserUserId;

	@RemoteProperty
	@Column(name = "MEMO",length=200,updatable=true)
	private String memo;

	@RemoteProperty
	@Column(name = "MODIFIER",length=40,updatable=true)
	private String modifier;

	@RemoteProperty
	@Column(name = "MODIFIER_IP",length=15,updatable=true)
	private String modifierIp;

	@RemoteProperty
	@Column(name = "MODIFY_TIME",length=0,updatable=true)
	private Date modifyTime;

	@RemoteProperty
	@Column(name = "ORIENTATION",length=4,updatable=true)
	private String orientation;

	@RemoteProperty
	@Column(name = "P_O_ID_CARD_NO",length=30,updatable=true)
	private String pOIdCardNo;

	@RemoteProperty
	@Column(name = "P_O_PHONE",length=20,updatable=true)
	private String pOPhone;

	@RemoteProperty
	@Column(name = "PAYMENT_WAY",length=4,updatable=true)
	private String paymentWay;

	@RemoteProperty
	@Column(name = "PROCESS_STATUS",length=2,updatable=true)
	private String processStatus;

	@RemoteProperty
	@Column(name = "PROPERTY_OWNER",length=40,updatable=true)
	private String propertyOwner;

	@RemoteProperty
	@Column(name = "PROPORTION_M3",length=22,updatable=true)
	private String proportionM3;

	@RemoteProperty
	@Column(name = "PUBLISH_TIME",length=0,updatable=true)
	private Date publishTime;

	@RemoteProperty
	@Column(name = "PUBLISH_USER_ID",length=10,updatable=true)
	private Integer publishUserId;

	@RemoteProperty
	@Column(name = "RENT_INTENTION",length=22,updatable=true)
	private String rentIntention;

	@RemoteProperty
	@Column(name = "RENTAL_NUM",length=10,updatable=true)
	private Integer rentalNum;

	@RemoteProperty
	@Column(name = "SERVICE_CENTER_ID",length=10,updatable=true)
	private Integer serviceCenterId;

	@RemoteProperty
	@Column(name = "START_DATE",length=0,updatable=true)
	private Date startDate;

	@RemoteProperty
	@Column(name = "TENANT_USER_ID",length=10,updatable=true)
	private Integer tenantUserId;

	@RemoteProperty
	@Column(name = "TENANT_WAY",length=4,updatable=true)
	private String tenantWay;

	@RemoteProperty
	@Column(name = "USING_PROPERTIES",length=4,updatable=true)
	private String usingProperties;

	@RemoteProperty
	@Column(name = "VILLAGE_NAME",length=50,updatable=true)
	private String villageName;


	public void setHouseInfoId(Integer houseInfoId){
		this.houseInfoId = houseInfoId;
	}

		return this.houseInfoId;
	}

		this.buildingNo = buildingNo;
	}

		return this.buildingNo;
	}

		this.buildingRoom = buildingRoom;
	}

		return this.buildingRoom;
	}

		this.buildingType = buildingType;
	}

		return this.buildingType;
	}

		this.buildingUnit = buildingUnit;
	}

		return this.buildingUnit;
	}

		this.checkOpinion = checkOpinion;
	}

		return this.checkOpinion;
	}

		this.checkResult = checkResult;
	}

		return this.checkResult;
	}

		this.checkTime = checkTime;
	}

		return this.checkTime;
	}

		this.checkUserId = checkUserId;
	}

		return this.checkUserId;
	}

		this.cqrdzwtsPath = cqrdzwtsPath;
	}

		return this.cqrdzwtsPath;
	}

		this.createTime = createTime;
	}

		return this.createTime;
	}

		this.creator = creator;
	}

		return this.creator;
	}

		this.creatorIp = creatorIp;
	}

		return this.creatorIp;
	}

		this.decoration = decoration;
	}

		return this.decoration;
	}

		this.endDate = endDate;
	}

		return this.endDate;
	}

		this.floorCnt = floorCnt;
	}

		return this.floorCnt;
	}

		this.floorNum = floorNum;
	}

		return this.floorNum;
	}

		this.haveAc = haveAc;
	}

		return this.haveAc;
	}

		this.haveBed = haveBed;
	}

		return this.haveBed;
	}

		this.haveKitchenBath = haveKitchenBath;
	}

		return this.haveKitchenBath;
	}

		this.haveNetwork = haveNetwork;
	}

		return this.haveNetwork;
	}

		this.haveRefrigerator = haveRefrigerator;
	}

		return this.haveRefrigerator;
	}

		this.haveTv = haveTv;
	}

		return this.haveTv;
	}

		this.haveWashingMachine = haveWashingMachine;
	}

		return this.haveWashingMachine;
	}

		this.haveWaterHeater = haveWaterHeater;
	}

		return this.haveWaterHeater;
	}

		this.houseAdd = houseAdd;
	}

		return this.houseAdd;
	}

		this.houseCode = houseCode;
	}

		return this.houseCode;
	}

		this.houseImagePath1 = houseImagePath1;
	}

		return this.houseImagePath1;
	}

		this.houseImagePath2 = houseImagePath2;
	}

		return this.houseImagePath2;
	}

		this.houseImagePath3 = houseImagePath3;
	}

		return this.houseImagePath3;
	}

		this.houseType = houseType;
	}

		return this.houseType;
	}

		this.isDeleted = isDeleted;
	}

		return this.isDeleted;
	}

		this.leaseStatus = leaseStatus;
	}

		return this.leaseStatus;
	}

		this.leaseType = leaseType;
	}

		return this.leaseType;
	}

		this.leaserUserId = leaserUserId;
	}

		return this.leaserUserId;
	}

		this.memo = memo;
	}

		return this.memo;
	}

		this.modifier = modifier;
	}

		return this.modifier;
	}

		this.modifierIp = modifierIp;
	}

		return this.modifierIp;
	}

		this.modifyTime = modifyTime;
	}

		return this.modifyTime;
	}

		this.orientation = orientation;
	}

		return this.orientation;
	}

		this.pOIdCardNo = pOIdCardNo;
	}

		return this.pOIdCardNo;
	}

		this.pOPhone = pOPhone;
	}

		return this.pOPhone;
	}

		this.paymentWay = paymentWay;
	}

		return this.paymentWay;
	}

		this.processStatus = processStatus;
	}

		return this.processStatus;
	}

		this.propertyOwner = propertyOwner;
	}

		return this.propertyOwner;
	}

		this.proportionM3 = proportionM3;
	}

		return this.proportionM3;
	}

		this.publishTime = publishTime;
	}

		return this.publishTime;
	}

		this.publishUserId = publishUserId;
	}

		return this.publishUserId;
	}

		this.rentIntention = rentIntention;
	}

		return this.rentIntention;
	}

		this.rentalNum = rentalNum;
	}

		return this.rentalNum;
	}

		this.serviceCenterId = serviceCenterId;
	}

		return this.serviceCenterId;
	}

		this.startDate = startDate;
	}

		return this.startDate;
	}

		this.tenantUserId = tenantUserId;
	}

		return this.tenantUserId;
	}

		this.tenantWay = tenantWay;
	}

		return this.tenantWay;
	}

		this.usingProperties = usingProperties;
	}

		return this.usingProperties;
	}

		this.villageName = villageName;
	}

		return this.villageName;
	}
