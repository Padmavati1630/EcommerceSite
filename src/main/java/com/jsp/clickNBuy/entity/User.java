package com.jsp.clickNBuy.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private String password;
	private Long mobile;
	@CreationTimestamp
	private LocalDateTime createdTime;
	@JsonIgnore
	private int otp;
	private LocalDateTime otpExpiryTime;
	@Enumerated(EnumType.STRING)
	private Role role;
	@JsonIgnore
	private boolean status;
	@JsonIgnore
	private int otpAttempts;
	@JsonIgnore
	private LocalDateTime lastOtpRequestTime;
}
