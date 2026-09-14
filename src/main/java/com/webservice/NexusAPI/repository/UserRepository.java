package com.webservice.NexusAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.NexusAPI.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
