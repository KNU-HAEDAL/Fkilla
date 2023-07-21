package com.springboot.jpa.controller;

import com.springboot.jpa.data.dto.LicenseDto;
import com.springboot.jpa.data.dto.MemberDto;
import com.springboot.jpa.data.dto.MemberResponseDto;
import com.springboot.jpa.data.repository.LicenseRepository;
import com.springboot.jpa.service.LicenseService;
import com.springboot.jpa.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/search")
public class licenseController {
    LicenseService licenseService;

    @Autowired
    public licenseController(LicenseService licenseService) {
        this.licenseService = licenseService;
    }

    @GetMapping(value = "/{license}")
    public LicenseDto showLicenseInfo(@PathVariable String license){
        return licenseService.licenseInfo(license);
    }

}
