package com.bookstore.ms_book.dto;

import java.math.BigDecimal;

public record BookResponse(Long id, String title, String author, String description, BigDecimal price) {
}
