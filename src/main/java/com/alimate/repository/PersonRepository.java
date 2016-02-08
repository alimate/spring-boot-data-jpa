package com.alimate.repository;

import com.alimate.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, String> {
    Person findByFirstName(String firstName);
}