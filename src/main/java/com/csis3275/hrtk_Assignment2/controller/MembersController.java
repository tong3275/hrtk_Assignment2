package com.csis3275.hrtk_Assignment2.controller;

import com.csis3275.hrtk_Assignment2.constant.Constants;
import com.csis3275.hrtk_Assignment2.model.GroupMember;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping
public class MembersController {
    static Map<Integer, GroupMember> members = new HashMap<>();

    static {
        members.put(123, new GroupMember(
                "123",
                "Rodrigo",
                "Currently working and studying, I love using tech to solve problems",
                "/images/5301435.jpeg",
                "F#, Swift, TypeScript",
                new String[]{"https://www.github.com/rodsfreitas", "www.linkedin.com"}
        ));
        members.put(124, new GroupMember(
                "124",
                "Kenny",
                "Currently working as a graphic designer and studying computer systems",
                "/images/kenny.png",
                "JavaScript, Vue, React, UX/UI",
                new String[]{"www.github.com", "www.linkedin.com"}
        ));
        members.put(125, new GroupMember(
                "125",
                "Tong",
                "Currently learning coding. It makes me happy when I can work something out.",
                "/images/tong.png",
                "C#",
                new String[]{"www.github.com", "www.linkedin.com"}
        ));
        members.put(126, new GroupMember(
                "126",
                "Henrique",
                "Making a switch from Legal to CSIS, trying to learn as much as I can!!",
                "/images/241416082.jpg",
                "C#, Java",
                new String[]{"https://github.com/HRBarros", "https://www.linkedin.com/in/henrique-barros1/"}
        ));
    }

    @GetMapping
    public String getAllMembers(Model model) {
        model.addAttribute("members", members.values());
        return "members";
    }

    @GetMapping("/members/{id}")
    public String getMember(@PathVariable("id") int id, Model model) {
        model.addAttribute("member", members.get(id));
        return "member";
    }
}
