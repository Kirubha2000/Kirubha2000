package com.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "stutab")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sid")
	public Integer studentId;
	
	@Column(name = "sname")
	public String studentName;
	
	@Column(name = "sadd")
	public String studentAddresss;
	
	@Column(name = "avg")
	public Double studentAvg;

	public Integer getStudentId() {
		
		return studentId;
	}
}