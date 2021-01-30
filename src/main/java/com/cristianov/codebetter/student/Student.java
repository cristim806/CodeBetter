package com.cristianov.codebetter.student;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Student {

    private final UUID studentId;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final Gender gender;

    public Student(@JsonProperty("studentId") UUID studentId,
                   @JsonProperty("firstName") String firstName,
                   @JsonProperty("lastName") String lastName,
                   @JsonProperty("email") String email,
                   @JsonProperty("gender") Gender gender) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
    }

    public UUID getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("studentId=").append(studentId);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", gender=").append(gender);
        sb.append('}');
        return sb.toString();
    }

    enum Gender{
        MALE, FEMALE
    }

}
