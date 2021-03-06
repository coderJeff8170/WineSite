package com.luis.tts.ECommerce.model;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Customer {
	
	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	@Entity

	public class User {
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "customer_id")
		private Long id;

		private int active;

		@CreationTimestamp 
		private Date createdAt;
		
		
		@Email(message = "Please provide a valid email")
		@NotEmpty(message = "Please provide an email")
		private String email;
		    
		@Length(min = 3, message = "Your username must have at least 3 characters")
		@Length(max = 15, message = "Your username cannot have more than 15 characters")
		@Pattern(regexp="[^\\s]+", message="Your username cannot contain spaces")
		private String username;
		    
		@Length(min = 5, message = "Your password must have at least 5 characters")
		private String password;
		    
		@NotEmpty(message = "Please provide your first name")
		private String firstName;
		    
		@NotEmpty(message = "Please provide your last name")
		private String lastName;
		
		
	}
}
