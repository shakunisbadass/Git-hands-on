package com.bloodbank.stock.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data @Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "available_blood")
public class AvailableBlood {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "blood_id")
	private long id;
	@Column(name = "blood_group")
	private String bloodGroup;
	@JoinColumn(name = "state_id")
	private String state;
	@Column(name = "area")
	private String area;
	@Column(name = "pincode")
	private int pincode;
	@Column(name = "contact_number")
	private String contactNumber;
	@Column(name = "units")
	private int units;
	@Column(name = "donor_id")
	private int donorId;

}

