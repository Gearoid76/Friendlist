package com.haagahelia.friendlist.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface FriendRepository extends CrudRepository<Friend, Long> {
	// went from Friend String to Long
	List <Friend> findByName(String name);

	// Going from <Friend String to Long
	

}
