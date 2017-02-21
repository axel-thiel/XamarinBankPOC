package com.xamarinpocbanque.server.facade;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xamarinpocbanque.server.dto.LoginDTO;
import com.xamarinpocbanque.server.dto.UserDTO;
import com.xamarinpocbanque.server.entity.User;
import com.xamarinpocbanque.server.filter.UserService;

@RestController
@RequestMapping(value="/xambank/user")
public class UserFacade {

	@Resource
	private UserService userService; 
	
	
	 /**
    *
    * POST. log user.
    *
    * @param LoginDTO object
    *
    * @return text : "success" if create bus line
    *          text : "exist" if association BusLine and City exist
    *
    */
   @PostMapping(path = "/login", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.TEXT_PLAIN_VALUE})
   public ResponseEntity<UserDTO> login(@Valid @RequestBody LoginDTO loginDto) {
	   
	   User user = userService.findByLoginAndPassword(loginDto.getLogin(), loginDto.getPassword());
	   
	   if (user != null) {
		UserDTO userDTO = new UserDTO(user.getId(), user.getLastName(), user.getFirstName(), user.getEmail(), user.getPhone(), user.getBankId());
		return ResponseEntity.ok(userDTO);
		
	   }else {
		return null;
	   	}
	   
   }
	
}
