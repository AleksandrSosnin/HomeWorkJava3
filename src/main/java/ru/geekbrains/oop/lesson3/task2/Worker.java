package ru.geekbrains.oop.lesson3.task2;

/**
 * Рабочий (работает с 9 до 18,
 * получает фиксированную заработную плату)
 */
public class Worker extends Employee {

    private int age;

    public Worker(String name, String surName, double salary, int age) {
        super(name, surName, salary);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public double calculateSalary() {
        // Реализация расчета зарплаты для Worker
        // (можете использовать текущее поле salary или добавить свою логику)
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("; Возраст: %d", age);
    }
}

