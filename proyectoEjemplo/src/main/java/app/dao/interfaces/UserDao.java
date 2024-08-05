package app.dao.interfaces;

import app.dto.UserDto;

public interface UserDao {
 public UserDto findByUserName(UserDto userDto) throws Exception;
}
