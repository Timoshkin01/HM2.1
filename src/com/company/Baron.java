package com.company;

public class Baron {
    private int age;
    private String name;
    private EnumResponsibilities enumResponsibilities;

    public Baron(int age, String name, EnumResponsibilities enumResponsibilities) {
        this.age = age;
        this.name = name;
        this.enumResponsibilities = enumResponsibilities;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public EnumResponsibilities getEnumResponsibilities() {
        return enumResponsibilities;
    }
}
