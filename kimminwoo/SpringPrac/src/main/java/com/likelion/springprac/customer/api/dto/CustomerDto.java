package com.likelion.springprac.customer.api.dto;

import lombok.Builder;

@Builder
public record CustomerDto(
        Long id,
        String name,
        Long age
) {}
