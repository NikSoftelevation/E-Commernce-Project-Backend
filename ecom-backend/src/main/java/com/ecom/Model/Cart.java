package com.ecom.Model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cartId;
	
//Relationship with other table

 @OneToMany(mappedBy = "cart",cascade = CascadeType.ALL,orphanRemoval = true)
  private	Set<CartItem> items= new HashSet<>();
 	@OneToOne
 	private User user;
	}
