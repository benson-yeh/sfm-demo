package com.benson.sfmdemo.dao.jpa;

import com.benson.sfmdemo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonJpaRepo extends JpaRepository<Person, String> {}
