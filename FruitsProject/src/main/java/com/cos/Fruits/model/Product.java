package com.cos.Fruits.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "product")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity

@SequenceGenerator(
		name = "PROD_SEQ_GENERATOR"
		, sequenceName = "PROD_SEQ"
		, initialValue = 1
		, allocationSize = 1
		)
public class Product extends BaseEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PROD_SEQ_GENERATOR")
	private int productId;
	
	@Column(nullable = false, length = 300)
	private String productName;
	
	@Column(length = 10)
	private int bprice; //할인 전 가격 
	
	@Column(nullable = false, length = 10)
	private int price;	
	
	@Column(nullable = false)
	private String origin;
	
	@Column(nullable = false)
	private String season;
	
	@Column(nullable = true)
	private String recommend;
		
	@Lob
	@Column(nullable = false)
	private String productDetail;
	
	@Column(nullable = false) 
	private String prodImgPath;	
	
	@Column(length = 100)
	private String prodStatus; // 0: 판매 / 1: 품절
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id")
	private User user;
	
}
