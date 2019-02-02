package com.cg.tms.model;

import java.io.Serializable;

public class TrainerDetails implements Serializable {
	public int id;
	public String name;
	public String location;
	public String designation;
	public String technology;
	public String contactNo;

	public TrainerDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TrainerDetails(int id, String name, String location,
			String designation, String technology, String contactNo) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.designation = designation;
		this.technology = technology;
		this.contactNo = contactNo;
	}

	@Override
	public String toString() {
		return "TrainerDetails [id=" + id + ", name=" + name + ", location="
				+ location + ", designation=" + designation + ", technology="
				+ technology + ", contactNo=" + contactNo + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

}
