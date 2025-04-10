package org.example;

public class mathProject {
    public static void main(String[] args) {
        // ---------------------------------------------------------
        // Question 1: variables
        // ---------------------------------------------------------
        double bobSalary = 55000.0;
        double garySalary = 62000.0;
        double highestSalary = Math.max(bobSalary, garySalary);
        System.out.println(" Question 1: Salary Comparison");
        System.out.println("Bob's Salary: $" + bobSalary);
        System.out.println("Gary's Salary: $" + garySalary);
        System.out.println("The highest salary is: $" + highestSalary);
        System.out.println();
        // Question 2: Compare car and truck prices
        double carPrice = 18500.0;
        double truckPrice = 24500.0;
        double lowestPrice = Math.min(carPrice, truckPrice);

        System.out.println("Question 2: Vehicle Price Comparison");
        System.out.println("Car Price: $" + carPrice);
        System.out.println("Truck Price: $" + truckPrice);
        System.out.println("The lower price is: $" + lowestPrice);

        // Question 3
        double random = Math.random();
        System.out.println(random);






    }
}
