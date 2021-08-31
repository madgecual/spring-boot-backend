package com.assessment.springboot_repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assessment.springboot_model.Transport;

@Repository
public interface TransportRepo extends JpaRepository<Transport, String>{

}
