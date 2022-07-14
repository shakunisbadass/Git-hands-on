package com.bloodbank.bloodrequirement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Data 
@Getter
@Setter 
@NoArgsConstructor 
@AllArgsConstructor
@Entity
@Table(name="blood_requirement")
public class BloodRequirement {
	
	//A request id for the user will be generated
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="req_id")
	private Long id;
	//These are the details required for the users to fill
	@Column(name="blood_group")
	private String bloodGroup;
	@Column(name="state")
	private String state;
	@Column(name="area")
	private String area;
	@Column(name="pincode")
	private Long pincode;
	@Column(name="contact_number")
	private String contactNumber;
//	@Column(name="user_id")
//	private int requesterId;//user
	
	
	
	
	
}

