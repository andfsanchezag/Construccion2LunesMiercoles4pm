package app.service;

import app.dao.UserDaoImplementation;
import app.dao.interfaces.UserDao;
import app.dto.PersonDto;
import app.dto.PetDto;
import app.dto.UserDto;
import app.service.interfaces.AdminService;
import app.service.interfaces.LoginService;
import app.service.interfaces.VeterinarianService;

public class Service implements LoginService,AdminService,VeterinarianService {
	private UserDao userDao;
	public static UserDto user;
	
	public Service() {
		this.userDao= new UserDaoImplementation();
	}
	@Override
	public void createPet(PetDto petDto) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createOwner(PersonDto personDto) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createSeller(UserDto userDto) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createVeterinarian(UserDto userDto) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void login(UserDto userDto) throws Exception {
		UserDto validateDto = userDao.findByUserName(userDto);
		if(validateDto==null) {
			throw new Exception("no existe usuario registrado");
		}
		if(!userDto.getPassword().equals(validateDto.getPassword())) {
			throw new Exception("usuario o contraseña incorrecto");
		}
		userDto.setRole(validateDto.getRole());
		user=validateDto;	
	}
	/*public void login(UserDto userDto)throws Exception {
		if(!userDto.getPassword().equals(userDto.getUserName())) {
			throw new Exception ("usuario o contraseña incorrectos");
		}
		userDto.setRole(userDto.getUserName());
	}*/

	@Override
	public void logout() {
		user=null;
		System.out.println("se ha cerrado sesion");
	}
}
