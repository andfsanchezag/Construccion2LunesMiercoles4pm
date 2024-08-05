package app.dao;

import app.dao.interfaces.UserDao;
import app.dto.UserDto;

public class UserDaoImplementation implements UserDao {

	@Override
	public UserDto findByUserName(UserDto userDto) throws Exception {
		UserDto validateDto = new UserDto();
		if(userDto.getUserName().equals("admin")) {
			validateDto.setUserName(userDto.getUserName());
			validateDto.setRole(userDto.getUserName());
			validateDto.setPassword("admin");
			return validateDto;
		}
		if (userDto.getUserName().equals(userDto.getPassword())) {
			validateDto.setUserName(userDto.getUserName());
			validateDto.setRole(userDto.getUserName());
			validateDto.setPassword(userDto.getUserName());
			return validateDto;
		}
		return null;
	}

}
