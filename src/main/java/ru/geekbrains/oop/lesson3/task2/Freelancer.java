package ru.geekbrains.oop.lesson3.task2;

/**
 * Фрилансер (работник с почасовой оплатой)
 * TODO: Доработать в рамках домашней работы
 */
public class Freelancer extends Employee {
    private double hourlyRate;

    public Freelancer(String name, String surName, double hourlyRate) {
        super(name, surName, 0); // Фрилансер не имеет фиксированной зарплаты
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return 20.8 * 8 * hourlyRate;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Freelancer; Monthly Salary: %.2f rubles.",
                surName, name, calculateSalary());
    }
}
