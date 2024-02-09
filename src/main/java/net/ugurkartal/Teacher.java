package net.ugurkartal;

import lombok.Builder;

@Builder
public record Teacher(long id, String name, String subject) {
}
