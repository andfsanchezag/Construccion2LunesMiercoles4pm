package app.helpers;

import app.dto.OrderDto;
import app.dto.PersonDto;
import app.dto.PetDto;
import app.dto.UserDto;
import app.model.Order;
import app.model.Person;
import app.model.Pet;
import app.model.User;

public abstract class Helper {

    public static PersonDto parse(Person person) {
        PersonDto personDto = new PersonDto();
        personDto.setId(person.getId());
        personDto.setDocument(person.getDocument());
        personDto.setAge(person.getAge());
        personDto.setName(person.getName());
        return personDto;
    }

    public static Person parse(PersonDto personDto) {
        Person person = new Person();
        person.setId(personDto.getId());
        person.setDocument(personDto.getDocument());
        person.setAge(personDto.getAge());
        person.setName(personDto.getName());
        return person;
    }

    public static UserDto parse(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setPassword(user.getPassword());
        userDto.setPersonid(parse(user.getPersonId()));
        userDto.setRole(user.getRole());
        userDto.setUserName(user.getUserName());
        return userDto;
    }

    public static User parse(UserDto userDto) {
        User user = new User();
        user.setId(userDto.getId());
        user.setPassword(userDto.getPassword());
        user.setPersonId(parse(userDto.getPersonid()));
        user.setRole(userDto.getRole());
        user.setUserName(userDto.getUserName());
        return user;
    }

    public static Order parse(OrderDto orderDto) {
        Order order = new Order();
        order.setDate(orderDto.getDate());
        order.setDose(orderDto.getDose());
        order.setId(orderDto.getId());
        order.setMedicine(orderDto.getMedicine());
        if (orderDto.getOwnerId() != null) {
            order.setOwnerId(parse(orderDto.getOwnerId()));
        }
        if (orderDto.getVeterinarian() != null) {
            order.setVeterinarian(parse(orderDto.getVeterinarian()));
        }
        if (orderDto.getPetId() != null) {
            order.setPetId(parse(orderDto.getPetId()));
        }
        return order;
    }

    private static Pet parse(PetDto petDto) {
        Pet pet = new Pet();
        pet.setAge(petDto.getAge());
        pet.setFeatures(petDto.getFeatures());
        pet.setId(petDto.getId());
        pet.setName(petDto.getName());
        if (petDto.getOwnerId() != null) {
            pet.setOwnerId(parse(petDto.getOwnerId()));
        }
        pet.setRace(petDto.getRace());
        pet.setWeigth(petDto.getWeigth());
        return pet;
    }
}
