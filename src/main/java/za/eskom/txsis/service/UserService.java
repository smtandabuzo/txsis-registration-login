package za.eskom.txsis.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import za.eskom.txsis.model.User;
import za.eskom.txsis.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
