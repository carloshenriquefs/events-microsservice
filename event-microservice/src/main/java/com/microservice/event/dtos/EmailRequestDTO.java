package com.microservice.event.dtos;

public record EmailRequestDTO(String to, String subject, String body) {
}
