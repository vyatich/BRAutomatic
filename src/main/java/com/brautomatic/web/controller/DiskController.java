package com.brautomatic.web.controller;

import com.brautomatic.model.Disk;
import com.brautomatic.service.DiskServiceImpl;
import com.brautomatic.web.dto.DiskDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/disk")
public class DiskController {

    @Autowired
    private DiskServiceImpl diskService;

    @GetMapping("/all")
    public String getAllDisks() {
        return "disks";
    }

    @PostMapping("/take/{id}")
    public String takeDisk() {
        return "disks";
    }

    @PostMapping("/add")
    public String addDisk(@RequestBody DiskDto diskDto) {
        return "disks";
    }
}
