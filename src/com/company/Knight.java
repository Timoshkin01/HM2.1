package com.company;

public class Knight extends Baron{
    private int age;
    private String name;
    private EnumResponsibilities enumResponsibilities;

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }

    public Knight(int age, String name, EnumResponsibilities enumResponsibilities) {
        super(age, name, enumResponsibilities);
    }

    public void giveAnOrder(){
        System.out.println("Приказ: ");
    }

    public final void giveAnOrder(String order){
        System.out.println(order);
    }
}
