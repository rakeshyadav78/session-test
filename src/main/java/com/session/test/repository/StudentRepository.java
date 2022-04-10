package com.session.test.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.session.test.entity.Students;

@Repository
public interface StudentRepository extends JpaRepository<Students, Integer>{

	Optional<Students> findByuserName(String userName);
}
