package com.activity4;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int comp;
        Scanner input = new Scanner(System.in);

        while (true) {
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
                        circle(input);
                    } 
                    else if (comp == 2) {
                        rectangle(input);
                    } 
                    else if (comp == 3) {
                        triangle(input);
                    }
                    else {
                        System.out.println("Exiting program...");
                        break;
                    } 
                }
            } catch (Exception e) {
                System.out.println("\nNot a number. TRY AGAIN.\n");
                input.next();
            }
        }
        input.close();
    }

    private static void circle(Scanner input) {
        float radius = 0;
        double circle;
        int choice = 1;

        while (radius <= 0) {
            while (choice == 1) {
                String ask = "";
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
                                    System.out.println("\nRedo calculation or go to Menu");
                                    System.out.println("[1] Redo");
                                    System.out.println("[2] Menu ");
                                    System.out.print("~> ");
                                    choice = input.nextInt();
                                    if (choice == 1) {
                                        radius = 0;
                                    } 
                                    else if (choice == 2) {
                                    }
                                }
                                else if (ask.equals("n")) {
                                    System.out.println("\nGoing back to Menu\n");
                                    return;
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
    }

    private static void rectangle(Scanner input) {
        float length = 0, width = 0;
        double rectangle;
        int choice = 1;

        while (length <= 0 || width <= 0) {
            while (choice == 1) {
                String ask = "";
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
                                    System.out.println("\nRedo calculation or go to Menu");
                                    System.out.println("[1] Redo");
                                    System.out.println("[2] Menu ");
                                    System.out.print("~> ");
                                    choice = input.nextInt();
                                    if (choice == 1) {
                                        length = 0;
                                        width = 0;
                                    } 
                                    else if (choice == 2) {
                                    }
                                }
                                else if (ask.equals("n")){
                                    System.out.println("\nGoing back to Menu\n");
                                    return;
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

    }

    private static void triangle(Scanner input) {
        float base = 0, height = 0;
        double triangle;
        int choice = 1;

        while (base <= 0 || height <= 0) {
            while (choice == 1) {
                String ask = "";
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
                                        System.out.println("\nRedo calculation or go to Menu");
                                        System.out.println("[1] Redo");
                                        System.out.println("[2] Menu ");
                                        System.out.print("~> ");
                                        choice = input.nextInt();
                                        if (choice == 1) {
                                            base = 0;
                                            height = 0;
                                        } 
                                        else if (choice == 2) {
                                        }
                            }
                            else if (ask.equals("n")){
                                System.out.println("\nGoing back to Menu\n");
                                return;
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
    }
}