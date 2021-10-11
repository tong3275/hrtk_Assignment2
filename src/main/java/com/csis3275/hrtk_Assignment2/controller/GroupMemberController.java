package com.csis3275.hrtk_Assignment2.controller;

import com.csis3275.hrtk_Assignment2.model.GroupMember;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/groupmembers")
public class GroupMemberController {

    @GetMapping
    public List<GroupMember> index() {
        return List.of(
                new GroupMember(
                        "123",
                        "Rodrigo",
                        "Currently working and studying, I love using tech to solve problems",
                        "http://selfie.com",
                        "interests",
                        new String[] { "F#", "Swift", "TypeScript" }
                )
        );
    }
}
