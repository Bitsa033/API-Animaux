package com.service.security;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalR extends JpaRepository<Animal, BigInteger> {

}
