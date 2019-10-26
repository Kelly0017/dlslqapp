package com.dlsl.queue;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = { "/api/v1" }, produces = { "application/json" })
public class QueueController {

	@Autowired
	private QueueService queueService;
	
	@RequestMapping(value = "/current_queue", method = RequestMethod.GET, produces = {
			MimeTypeUtils.APPLICATION_JSON_VALUE })
	public ResponseEntity<List<UsersDto>> search(
			@RequestParam("currently_queueing") String currently_queueing) {
		
		List<UsersDto> users = new ArrayList();
		
		try {
		
		List<Users> usersList = queueService.search(currently_queueing);
		for (Users user: usersList) {
			UsersDto usersDto = new UsersDto();
			usersDto.setId(user.getId());
			usersDto.setCurrently_queueing(user.getCurrently_queueing());
			usersDto.setName(user.getName());
			usersDto.setCashier_number(user.getCashier_number());
			usersDto.setStudent_number(user.getStudent_number());
			usersDto.setIs_priority(user.getIs_priority());
			users.add(usersDto);
		}
		return new ResponseEntity<List<UsersDto>>(users,
				HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<List<UsersDto>>(
					HttpStatus.BAD_REQUEST);
		}
		
	}
}
