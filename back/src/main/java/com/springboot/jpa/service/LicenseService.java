package com.springboot.jpa.service;

import com.springboot.jpa.data.dto.LicenseDto;
import com.springboot.jpa.data.dto.MemberDto;
import com.springboot.jpa.data.entity.Member;
import com.springboot.jpa.data.repository.LicenseRepository;
import com.springboot.jpa.data.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LicenseService {

    private final LicenseRepository licenseRepository;
    @Autowired
    public LicenseService(LicenseRepository licenseRepository) {
        this.licenseRepository = licenseRepository;
    }

    public List<String> findLicense(String name){
        return licenseRepository.findAllByNameContains(name);
    }
    public LicenseDto licenseInfo(String name){ return licenseRepository.findByName(name);}
}
