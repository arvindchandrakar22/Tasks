package net.relation.has_a.service;

import net.relation.has_a.model.Address;
import net.relation.has_a.model.Person;
import net.relation.has_a.repository.AddressRepository;
import net.relation.has_a.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonService {
    private PersonRepository personRepository;
    private AddressRepository addressRepository;
    public PersonService(PersonRepository personRepository, AddressRepository addressRepository) {
        this.personRepository = personRepository;
        this.addressRepository = addressRepository;
    }

    public Person createPerson(Person person) {
        Address newAdd = person.getAddress();
        Person newPerson = personRepository.save(person);
        newAdd.setId(newPerson.getId());
        newPerson.setAddress(addressRepository.save(newAdd));
        return newPerson;
    }

    public Person getPersonById(Long id) {
       Person person = personRepository.findPersonById(id);
       person.setAddress(addressRepository.findAddressById(id));
       return person;
    }

    public List<Person> getAllPersons() {
        List<Person> personList = personRepository.findAll();
        personList.forEach(p->p.setAddress(addressRepository.findAddressById(p.getId())));
//        for(Person p: personList)
//            p.setAddress(addressRepository.findAddressById(p.getId()));
        return personList;

    }

    public Person updatePerson(Long id, Person updatedPerson) {
        updatedPerson.setId(id);
        updatedPerson.getAddress().setId(id);
        Address updatedAdd = updatedPerson.getAddress();
        addressRepository.save(updatedAdd);
        personRepository.save(updatedPerson);
        return updatedPerson;
    }

    public void deletePerson(Long id) {
        personRepository.deleteById(id);
        addressRepository.deleteById(id);
    }
}
