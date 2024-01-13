package ru.geekbrains.oop.lesson3.task2;

import java.util.Comparator;

class AgeComparator implements Comparator<Worker> {
    @Override
    public int compare(Worker worker1, Worker worker2) {
        // Сравниваем сотрудников по возрасту
        return Integer.compare(worker1.getAge(), worker2.getAge());
    }
}
