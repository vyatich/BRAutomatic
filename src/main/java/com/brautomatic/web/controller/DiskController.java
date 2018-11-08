package com.brautomatic.web.controller;

import com.brautomatic.model.Disk;
import com.brautomatic.model.TakenItem;
import com.brautomatic.model.User;
import com.brautomatic.service.DiskServiceImpl;
import com.brautomatic.service.TakenItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequestMapping("/disk")
public class DiskController {

    @Autowired
    private DiskServiceImpl diskService;
    @Autowired
    private TakenItemServiceImpl takenItemService;

    @GetMapping("/all")
    public String getAllDisks(Model model) {
        model.addAttribute("disks", diskService.getAllFreeDiskList());
        return "disks";
    }

    @GetMapping("/add")
    public String getAllMyDisks() {
        return "adddisk";
    }

    @PostMapping("/add")
    public String addDisk(@AuthenticationPrincipal User user,
                          @RequestParam String name) {
        diskService.addDisk(new Disk(name, user));
        return "adddisk";
    }

    @PostMapping("/take/{id}")
    public String takeDisk(
            @AuthenticationPrincipal User user,
            @PathVariable("id") final long id,
            Model model) {
        TakenItem takenItem = new TakenItem();
        takenItem.setDisk(diskService.getDiskById(id).get());
        takenItem.setUser(user);
        takenItemService.addTakenItem(takenItem);
        return "redirect:/disk/all";
    }


}
