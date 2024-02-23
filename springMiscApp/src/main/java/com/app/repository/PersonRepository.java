package com.app.repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {
    // You can add custom queries here if needed
    @Query(value = "select * from person p where p.id=?1", nativeQuery = true)
    public Person findPersonById(Integer id);
}

