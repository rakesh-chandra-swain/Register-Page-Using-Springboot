package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.domain.Register;

public interface RegisterRepository extends JpaRepository<Register, Long> {

}
