package com.net355.models;

// Generated Dec 21, 2011 3:28:17 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Module generated by hbm2java
 */
@Entity
@Table(name = "module", catalog = "net355")
public class Module implements java.io.Serializable {

	private String modId;
	private Syscode syscode;
	private String modName;
	private String modHref;
	private String modType;
	private Date addTime;
	private String state;
	private Set<Privilege> privileges = new HashSet<Privilege>(0);

	public Module() {
	}

	public Module(String modId) {
		this.modId = modId;
	}

	public Module(String modId, Syscode syscode, String modName,
			String modHref, String modType, Date addTime, String state,
			Set<Privilege> privileges) {
		this.modId = modId;
		this.syscode = syscode;
		this.modName = modName;
		this.modHref = modHref;
		this.modType = modType;
		this.addTime = addTime;
		this.state = state;
		this.privileges = privileges;
	}

	@Id
	@Column(name = "mod_id", unique = true, nullable = false, length = 32)
	public String getModId() {
		return this.modId;
	}

	public void setModId(String modId) {
		this.modId = modId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sys_id")
	public Syscode getSyscode() {
		return this.syscode;
	}

	public void setSyscode(Syscode syscode) {
		this.syscode = syscode;
	}

	@Column(name = "mod_name", length = 50)
	public String getModName() {
		return this.modName;
	}

	public void setModName(String modName) {
		this.modName = modName;
	}

	@Column(name = "mod_href", length = 200)
	public String getModHref() {
		return this.modHref;
	}

	public void setModHref(String modHref) {
		this.modHref = modHref;
	}

	@Column(name = "mod_type", length = 2)
	public String getModType() {
		return this.modType;
	}

	public void setModType(String modType) {
		this.modType = modType;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "add_time", length = 19)
	public Date getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	@Column(name = "state", length = 2)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "module")
	public Set<Privilege> getPrivileges() {
		return this.privileges;
	}

	public void setPrivileges(Set<Privilege> privileges) {
		this.privileges = privileges;
	}

}