package com.likelion.springprac.customer.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Customer {

    private long id; // 고객 id
    private String name; // 고객 이름
    private Long age; // 고객 나이

    @Builder
    public Customer(long id, String name, Long age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void update(String name, Long age) {
        this.name = name;
        this.age = age;
    }
}
