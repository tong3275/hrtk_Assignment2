package com.csis3275.hrtk_Assignment2.controller;

import com.csis3275.hrtk_Assignment2.model.GroupMember;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "/members")
public class MembersController {
    @GetMapping
    public String getAllMembers(Model model) {
        model.addAttribute("members", List.of(
                new GroupMember(
                        "123",
                        "Rodrigo",
                        "Currently working and studying, I love using tech to solve problems",
                        "/images/5301435.jpeg",
                        "F#, Swift, TypeScript",
                        new String[] {"www.github.com", "www.linkedin.com"}
                )
        ));

        return "members";
    }
}
