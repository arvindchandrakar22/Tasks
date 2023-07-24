package net.relation.has_a.controller;

import net.relation.has_a.exception.ResourceNotFoundException;
import net.relation.has_a.model.Address;
import net.relation.has_a.model.Person;
import net.relation.has_a.service.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/persons")
public class PersonController {
    private PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public ResponseEntity<Person> createPerson(@RequestBody Person person) {
        Person createdPerson = personService.createPerson(person);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdPerson);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Person> getPersonById(@PathVariable Long id) {
        Person person = personService.getPersonById(id);
        return ResponseEntity.ok(person);
    }

    @GetMapping
    public ResponseEntity<List<Person>> getAllPersons() {
        List<Person> persons = personService.getAllPersons();
        return ResponseEntity.ok(persons);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Person> updatePerson(@PathVariable Long id, @RequestBody Person updatedPerson) {
        Person person = personService.updatePerson(id, updatedPerson);
        return ResponseEntity.ok(person);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePerson(@PathVariable Long id) {
        personService.deletePerson(id);
        return ResponseEntity.noContent().build();
    }

//    @GetMapping("/{personId}/address")
//    public ResponseEntity<Address> getAddressByPersonId(@PathVariable Long personId) {
//        Person person = personService.getPersonById(personId);
//        if (person == null) {
//            throw new ResourceNotFoundException("Person not found with id: " + personId);
//        }
//        Address address = personService.getAddressById(person.getAddress().getId());
//        return ResponseEntity.ok(address);
//    }
}
