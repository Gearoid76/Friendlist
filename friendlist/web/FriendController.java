package com.haagahelia.friendlist.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.haagahelia.friendlist.domain.Friend;
import com.haagahelia.friendlist.domain.FriendRepository;

@Controller
public class FriendController {
	@Autowired
	private FriendRepository repository;
	
	@RequestMapping(value="/friend")
	public String friend(Model model) {
		model.addAttribute("friends", repository.findAll());
		return "friend";
	}
	// Add friend	
	@RequestMapping(value="/addfriend") //  changed from /add to addfriend
	public String addFriend(Model model) {
		model.addAttribute("friend", new Friend());
		return "addfriend";
	
	}
	
	@RequestMapping(value= "/save", method = RequestMethod.POST)
	public String save(Friend friend) {
		repository.save(friend);
		return "redirect:friend";
	}
	 // Delete friend
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteStudent(@PathVariable("id") Long friendId, Model model) {
    	repository.delete(friendId); //tried deleteById
        return "redirect:../friend";
    }     
	 
 
	
    	
    } 




