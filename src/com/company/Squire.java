package com.company;

public final class Squire extends Knight {
    private int age;
    private String name;

    @Override
    public void giveAnOrder() {
        super.giveAnOrder();
        System.out.println("Принести оружие");
    }

    public EnumResponsibilities getEnumColor() {
        return enumColor;
    }

    private EnumResponsibilities enumColor;

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }

    public Squire(int age, String name, EnumResponsibilities enumResponsibilities) {
        super(age, name, enumResponsibilities);
        this.age = age;
        this.name = name;
        this.enumColor = enumColor;
    }
}
