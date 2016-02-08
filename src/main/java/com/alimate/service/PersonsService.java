package com.alimate.service;

import com.alimate.model.Person;
import com.alimate.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/persons")
public class PersonsService {
    @Autowired private PersonRepository personRepository;

    @RequestMapping(method = GET)
    public ResponseEntity<Page<Person>> listUsers(Pageable pageable) {
        return ResponseEntity.ok(personRepository.findAll(pageable));
    }
}