package com.haagahelia.friendlist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.haagahelia.friendlist.domain.Friend;
import com.haagahelia.friendlist.domain.FriendRepository;



@SpringBootApplication
public class FriendlistApplication {
	private static final Logger log = LoggerFactory.getLogger(FriendlistApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(FriendlistApplication.class, args);
			
	}
	
	@Bean 
	public CommandLineRunner friend(FriendRepository repository) {  
		return (args) ->  {
			
			log.info("Save friends");
			repository.save(new Friend( "John West"));
			repository.save(new Friend( "Kate Bower"));
			repository.save(new Friend( "Mary Smith"));
			
			log.info("Collect all friends");
			for (Friend friend : repository.findAll()) {
				log.info(friend.toString());
				
			}
		};
	}
	
}
