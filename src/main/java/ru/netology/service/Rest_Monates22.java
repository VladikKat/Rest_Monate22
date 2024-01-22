package ru.netology.service;

public class Rest_Monates22 {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = money - expenses;
                money /= 3;
                System.out.println(count);
            } else {
                money = money + income;
                money -= expenses;
            }
        }
        return count;
    }
}
