package com.springboot.jpa.controller;

import com.springboot.jpa.service.LicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping()
public class SearchContoller {
    private final LicenseService licenseService;

    @Autowired
    public SearchContoller(LicenseService licenseService) {
        this.licenseService = licenseService;
    }

    @GetMapping()
    public List<String> getLicense(@RequestBody String name) {
        return licenseService.findLicense(name);
    }

    @GetMapping("/search")
    public List<String> getLicense2(@RequestBody String name) {
        return licenseService.findLicense(name);
    }


}
