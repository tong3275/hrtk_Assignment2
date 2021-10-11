package com.csis3275.hrtk_Assignment2.model;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class GroupMember {
	private String id;
	private String name;
	private String description;
	private String selfieURL;
	private String interests;
    private String[] portfolioLinks;
}
