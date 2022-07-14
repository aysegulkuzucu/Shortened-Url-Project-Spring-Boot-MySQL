package com.example.shortenedurl.model;

import jdk.jfr.DataAmount;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shortenedurl")
@Data
public class Url {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@Column(name = "longurl")
	private String longUrl;

	@Column(name = "shortenedurl")
	private String shortenedUrl;

	@Column(name = "userid")
	private int userId;

	

}
