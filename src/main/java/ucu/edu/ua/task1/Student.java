package ucu.edu.ua.task1;

import java.util.List;

import lombok.Builder;
import lombok.Singular;
import lombok.ToString;

@ToString @Builder
public class Student {
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private int age;
    @Singular private List<String> courses;


}

