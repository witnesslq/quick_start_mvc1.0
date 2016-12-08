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
@Table(name = "t_sys_menu")
@DataTransferObject
public class T_Sys_Menu implements Serializable {


	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "MENU_ID",length=10,updatable=true)
	private Integer menuId;

	@RemoteProperty
	@Column(name = "F_MENU_ID",length=60,nullable=true,updatable=true)
	private String fMenuId;

	@RemoteProperty
	@Column(name = "IS_END_MENU",length=1,nullable=true,updatable=true)
	private String isEndMenu;

	@RemoteProperty
	@Column(name = "MEMO",length=100,nullable=true,updatable=true)
	private String memo;

	@RemoteProperty
	@Column(name = "MENU_NAME",length=40,updatable=true)
	private String menuName;

	@RemoteProperty
	@Column(name = "MENU_SRC",length=80,nullable=true,updatable=true)
	private String menuSrc;

	@RemoteProperty
	@Column(name = "SORT",length=10,nullable=true,updatable=true)
	private Integer sort;


	public void setMenuId(Integer menuId){
		this.menuId = menuId;
	}

		return this.menuId;
	}

		this.fMenuId = fMenuId;
	}

		return this.fMenuId;
	}

		this.isEndMenu = isEndMenu;
	}

		return this.isEndMenu;
	}

		this.memo = memo;
	}

		return this.memo;
	}

		this.menuName = menuName;
	}

		return this.menuName;
	}

		this.menuSrc = menuSrc;
	}

		return this.menuSrc;
	}

		this.sort = sort;
	}

		return this.sort;
	}
