package co.istad.chhaya.elearning.features.auth.dto;

import lombok.Getter;

@Getter
public enum GenderOptions {
    FEMALE("Female"),
    MALE("Male"),
    OTHER("Other");
    
    private final String gender;

    GenderOptions(String gender) {
        this.gender = gender;
    }

}
