package com.example.entities;

import java.sql.Date;
import java.util.Locale.IsoCountryCode;
import java.util.jar.Attributes.Name;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "student")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	@Column(name = "first_name", nullable = false)
	private String firstName;
	
	
	@Column(name="last_name", nullable = false)
	private String lastName;
	
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name ="birth_of_date", nullable = true)
	private Date birthOfDate;

}
