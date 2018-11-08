package com.brautomatic.web.controller;

import com.brautomatic.model.User;
import com.brautomatic.service.TakenItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/disk/taken")
public class TakenItemController {

    @Autowired
    private TakenItemServiceImpl takenItemService;

    @GetMapping
    public String getAllMyTakenDisks(
            @AuthenticationPrincipal User user,
            Map<String, Object> model) {
        model.put("taken", takenItemService.getAllTakenItem());
        return "takendisk";
    }

    @GetMapping("/given")
    public String getAllMyGivenDisks(
            @AuthenticationPrincipal User user,
            Model model) {
        model.addAttribute("disks", takenItemService.getMyTakenItem(user));
        return "kbkbjkj";
    }
}
