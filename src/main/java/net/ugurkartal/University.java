package net.ugurkartal;

import java.util.List;

public record University(long id, String name, List<Course> courses) {}
