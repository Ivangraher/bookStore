package com.bookstore.ms_book.dto;

import lombok.Builder;

import java.math.BigDecimal;

@Builder
public record BookRequest(Long id, String title, String author, String description, BigDecimal price) {
}
