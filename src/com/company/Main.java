package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float salaryMaria = 67760;
        byte yearsMaria = 12;
        float percentage1 = (10/100F);
        float increaseMaria = salaryMaria * percentage1;
        System.out.println( increaseMaria );
        float newSalaryMaria =(salaryMaria + increaseMaria);
        System.out.println("Маша теперь получает " + newSalaryMaria + " рублей");
        float revenueMaria = salaryMaria * yearsMaria;
        System.out.println(revenueMaria);
        float newRevenueMaria = newSalaryMaria * yearsMaria;
        System.out.println(newRevenueMaria);
        float differenceMaria = newRevenueMaria - revenueMaria;
        System.out.println("Годовой доход Маши вырос на " + differenceMaria + " рублей");

        float salaryDenis = 83690;
        byte yearsDenis = 12;
        float procentage2 = (10/100F);
        float increaseDenis = salaryDenis * procentage2;
        System.out.println(increaseDenis);
        float newSalaryDenis = (salaryDenis + increaseDenis);
        System.out.println("Денис теперь получает " + newSalaryDenis + "рублей");
        float revenueDenis = salaryDenis * yearsDenis;
        System.out.println(revenueDenis);
        float newRevenueDenis = newSalaryDenis * yearsDenis;
        System.out.println(newRevenueDenis);
        float differenceDenis = newRevenueDenis - revenueDenis;
        System.out.println("Годовой доход Дениса вырос на " + differenceDenis + " рублей");

        float salaryKristina = 76230;
        byte yearsKristina = 12;
        float procentage3 = (10/100F);
        float increaseKristina = salaryKristina * procentage3;
        System.out.println(increaseKristina);
        float newSalaryKristina = (salaryKristina + increaseKristina);
        System.out.println("Кристина теперь получает " + newSalaryKristina + "рублей");
        float revenueKristina = salaryKristina * yearsKristina;
        System.out.println(revenueKristina);
        float newRevenueKristina = newSalaryKristina * yearsKristina;
        System.out.println(newRevenueKristina);
        float differenceKristina = newRevenueKristina - revenueKristina;
        System.out.println("Годовой доход Кристины вырос на " + differenceKristina + " рублей");
    }
}
