package app.service.interfaces;

import app.dto.PersonDto;
import app.dto.PetDto;

public interface VeterinarianService {
	public void createPet(PetDto petDto) throws Exception;

	public void createOwner(PersonDto personDto) throws Exception;
}
