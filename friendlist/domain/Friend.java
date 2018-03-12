package com.haagahelia.friendlist.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Friend {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	
	public Friend() {}
	
	public Friend(String name) { //loosing the Id
		super();
		//this.id = id;
		this.name = name;
		
		
		
	}

	public Long getid() {	//from Id id 
		return id;
	}

	public void setid(Long id) { //Id to id
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Friend [id=" + id + ", name=" + name +  "]";
	

	}
	

}
