package com.springboot.jpa.data.repository;

import com.springboot.jpa.data.dto.LicenseDto;
import com.springboot.jpa.data.entity.License;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LicenseRepository extends JpaRepository<License, String> {
    LicenseDto findByName(String name);
    List<String> findAllByNameContains(String name);

}
