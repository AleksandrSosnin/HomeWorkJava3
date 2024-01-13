package ru.geekbrains.oop.lesson3.task2;

import java.util.Random;

public class EmployeeFabric {

    public static Employee[] generateEmployees(int count) {
        Employee[] employees = new Employee[count];
        for (int i = 0; i < count; i++) {
            employees[i] = generateRandomEmployee();
        }
        return employees;
    }

    private static Employee generateRandomEmployee() {
        Random random = new Random();
        int employeeType = random.nextInt(3);

        if (employeeType == 0) {
            return generateRandomWorker();
        } else if (employeeType == 1) {
            return generateRandomFreelancer();
        } else {
            return generateRandomOtherEmployee();
        }
    }

    private static Employee generateRandomWorker() {
        String name = "Worker" + new Random().nextInt(100);
        String surName = "Surname" + new Random().nextInt(100);
        double salary = 1000 + new Random().nextDouble() * 4000;
        int age = 20 + new Random().nextInt(40); // Пример генерации случайного возраста от 20 до 60
        return new Worker(name, surName, salary, age);
    }

    private static Employee generateRandomFreelancer() {
        String name = "Freelancer" + new Random().nextInt(100);
        String surName = "Surname" + new Random().nextInt(100);
        double hourlyRate = 5 + new Random().nextDouble() * 15;
        return new Freelancer(name, surName, hourlyRate);
    }

    private static Employee generateRandomOtherEmployee() {
        String name = "OtherEmployee" + new Random().nextInt(100);
        String surName = "Surname" + new Random().nextInt(100);
        double salary = 1500 + new Random().nextDouble() * 3500;
        int age = 20 + new Random().nextInt(40); // Пример генерации случайного возраста от 20 до 60
        return new Worker(name, surName, salary, age);
    }

    public static void main(String[] args) {
        Employee[] employees = generateEmployees(5);
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
}