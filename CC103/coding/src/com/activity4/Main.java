package com.activity4;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int comp = -1;
        Scanner input = new Scanner(System.in);

        while (comp < 0 || comp > 3) {
            System.out.println("AREA COMPUTATION");
            System.out.println("Input and Enter the number of the shape you are computing for");
            System.out.println("[1] for Circle");
            System.out.println("[2] for Rectangle");
            System.out.println("[3] for Triangle");
            System.out.println("[0] to Exit");
            System.out.print("~> ");
            try {
                comp = input.nextInt();
                if (comp < 0 || comp > 3) {
                    System.out.println("\nInvalid input. TRY AGAIN.\n");
                } 
                else {
                    if (comp == 1) {
                        float radius = 0;
                        double circle;
                        String ask = "";

                        while (radius <= 0) {
                            try {
                                System.out.print("What is your radius? (in whole integer or decimal form only)\n~> ");
                                radius = input.nextFloat();
                                input.nextLine();

                                if (radius <= 0) {
                                    System.out.println("\nNot a valid calculation for this Area. TRY AGAIN\n");
                                }
                                else {
                                    while (!ask.equals("y") && !ask.equals("n")) {
                                        System.out.print("Use this formula? (y/n)\nArea of circle = 3.14 * radius * radius\n~> ");
                                        ask = input.nextLine();
                                        try {
                                            if (ask.equals("y")) {
                                                circle = 3.14 * radius * radius;
                                                System.out.printf("Area of circle = 3.14 * %.2f * %.2f = %.2f\n", radius, radius, circle);
                                            }
                                            else if (ask.equals("n")) {
                                                System.out.println("\nGoing back to Menu\n");
                                                comp = -1;
                                                break;
                                            }
                                            else {
                                                System.out.println("\nNot a 'y' or 'n'. TRY AGAIN.\n");
                                            }
                                        } catch (Exception e) {
                                            System.out.println("\nNot a 'y' or 'n'. TRY AGAIN.\n");
                                            input.next();
                                        }
                                    }
                                }
                            } catch (Exception e) {
                                System.out.println("\nNot an whole integer or decimal. TRY AGAIN.\n");
                                input.next();
                            }
                        }
                    } 
                    else if (comp == 2) {
                        float length = 0, width = 0;
                        double rectangle;
                        String ask = "";

                        while (length <= 0 || width <= 0) {
                            try {
                                System.out.print("What is your length? (in whole integer or decimal form only)\n~> ");
                                length  = input.nextFloat();
                                System.out.print("What is your width? (in whole integer or decimal form only)\n~> ");
                                width = input.nextFloat();
                                input.nextLine();

                                if (length <= 0 || width <= 0) {
                                    System.out.println("\nNot a valid calculation for this Area\n");
                                } 
                                else {
                                    while (!ask.equals("y") && !ask.equals("n")) {
                                        System.out.print("Use this formula? (y/n)\nArea of rectangle = length * width\n~> ");
                                        ask = input.nextLine();
                                        try {
                                            if (ask.equals("y")) {
                                                rectangle = length * width;
                                                System.out.printf("Area of rectangle = %.2f * %.2f = %.2f\n", length, width, rectangle);
                                            }
                                            else if (ask.equals("n")){
                                                System.out.println("\nGoing back to Menu\n");
                                                comp = -1;
                                                break;
                                            }
                                            else {
                                                System.out.println("\nNot a 'y' or 'n'. TRY AGAIN.\n");
                                            }
                                        } catch (Exception e) {
                                            System.out.println("\nNot a 'y' or 'n'. TRY AGAIN.\n");
                                            input.next();
                                        }
                                    }
                                }
                            } catch (Exception e) {
                                System.out.println("\nNot an whole integer or decimal. TRY AGAIN.\n");
                                input.next();
                            }
                        }

                    } 
                    else if (comp == 3) {
                        float base = 0, height = 0;
                        double triangle;
                        String ask = "";

                        while (base <= 0 || height <= 0) {
                            try {
                                System.out.print("What is your base? (in whole integer or decimal form only)\n~> ");
                                base = input.nextFloat();
                                System.out.print("What is your height? (in whole integer or decimal form only)\n~> ");
                                height = input.nextFloat();
                                input.nextLine();

                                if (base <= 0 || height <= 0) {
                                    System.out.println("\nNot a valid calculation for this Area\n");
                                }
                                else {
                                    System.out.print("Use this formula? (y/n)\nArea of triangle = 0.5 * base * height\n~> ");
                                    ask = input.nextLine();
                                    try {
                                        if (ask.equals("y")) {
                                            triangle = 0.5 * base * height;
                                            System.out.printf("Area of triangle = 0.5 * %.2f * %.2f = %.2f\n", base, height, triangle);
                                        }
                                        else if (ask.equals("n")){
                                            System.out.println("\nGoing back to Menu\n");
                                            comp = -1;
                                            break;
                                        }
                                        else {
                                            System.out.println("\nNot a 'y' or 'n'. TRY AGAIN.\n");
                                        }
                                    } catch (Exception e) {
                                        System.out.println("\nNot a 'y' or 'n'. TRY AGAIN.\n");
                                        input.next();
                                    }
                                }
                            } catch (Exception e) {
                                System.out.println("\nNot an whole integer or decimal. TRY AGAIN.\n");
                                input.next();
                            }
                        }
                    }
                    else if (comp == 0) {
                        System.out.println("Exiting program...");
                        System.exit(0);
                    } 
                    else {
                        System.out.println("Not a valid option");
                    }
                }
            } catch (Exception e) {
                System.out.println("\nNot a number. TRY AGAIN.\n");
                input.next();
            }
        }
        input.close();
    }
}