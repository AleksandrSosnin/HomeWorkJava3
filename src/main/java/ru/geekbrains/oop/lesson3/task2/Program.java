package ru.geekbrains.oop.lesson3.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        EmployeeGenerator employeeGenerator = new EmployeeGenerator();
        Employee[] employees = employeeGenerator.generateEmployees(5);

        // Создаем временный список
        List<Worker> workerList = new ArrayList<>();

        // Проходим по массиву Employee[] и добавляем только объекты типа Worker в список
        for (Employee employee : employees) {
            if (employee instanceof Worker) {
                workerList.add((Worker) employee);
            }
        }

        // Преобразуем список в массив Worker[]
        Worker[] workers = workerList.toArray(new Worker[0]);

        for (Worker worker : workers) {
            System.out.println(worker);
        }

        System.out.println();
        System.out.println("***");
        System.out.println();

        // Сортировка сотрудников по возрасту
        Arrays.sort(workers, new AgeComparator());

        for (Worker worker : workers) {
            System.out.println(worker);
        }
    }
}