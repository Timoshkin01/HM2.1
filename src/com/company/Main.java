package com.company;

import jdk.jshell.SourceCodeAnalysis;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Baron baron = new Baron(37, "Dean", EnumResponsibilities.OWNER);
        Squire squire = new Squire(23, "Nik",EnumResponsibilities.CARRY_A_WEAPON );
        Squire squire1 = new Squire(23, "Nik",EnumResponsibilities.CARRY_A_WEAPON );
        System.out.println("Age: " + baron.getAge() + "\nName: " + baron.getName() + "\nColor: " + baron.getEnumResponsibilities());
        System.out.println("Age: " + squire.getAge() + "\nName: " + squire.getName() + "\n Order " + squire.getEnumResponsibilities());
        System.out.println("Age: " + squire1.getAge() + "\nName: " + squire1.getName() + "\n Order " + squire1.getEnumResponsibilities());
    }
}
