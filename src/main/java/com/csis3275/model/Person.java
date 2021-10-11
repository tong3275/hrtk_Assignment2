package com.csis3275.model;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String id;
    private String name;
    private String description;
    private String selfieURL;
    private String interests;
    private String[] portfolioLinks;
}
