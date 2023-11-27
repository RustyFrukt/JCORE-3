package ru.geekbrains.lesson3;

public class Main {
    public static void main(String[] args) {
        Worker[] workers = new Worker[5];
        workers[0] = new HourlyWorker("Денисов", 100);
        workers[1] = new HourlyWorker("Сергеев", 120);
        workers[2] = new FixedWorker("Петров", 5000);
        workers[3] = new FixedWorker("Бабков", 7000);
        workers[4] = new FixedWorker("Аверин", 6500);

        // Создание объекта класса WorkersArray
        WorkersArray workersArray = new WorkersArray(workers);

        // Сортировка массива работников по имени
        workersArray.sortByName();

        // Вывод информации о работниках
        System.out.println("Сортировка по имени:");
        workersArray.printWorkersInfo();

        // Сортировка массива работников по заработной плате
        workersArray.sortByAverageSalary();

        // Вывод информации о работниках
        System.out.println("Сортировка по зарплате:");
        workersArray.printWorkersInfo();
    }
}
