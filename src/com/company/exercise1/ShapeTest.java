package com.company.exercise1;


public class ShapeTest {
    public static void main(String[] args) {

            class Square implements Shape {

                private double side;

                @Override
                public double area() {
                    System.out.print("The area of the square is: ");
                    return side * side;
                }

                @Override
                public double perimeter() {
                    System.out.print("The perimeter of the square is: ");
                    return 4 * side;
                }
            }

            class Rectangle implements Shape {

                private double side1;
                private double side2;

                @Override
                public double area() {
                    System.out.print("The area of the rectangle is: ");
                    return side1 * side2;
                }

                @Override
                public double perimeter() {
                    System.out.print("The perimeter of the rectangle is: ");
                    return 2 * (side1 + side2);
                }
            }


            class Triangle implements Shape {

                private double sideA;
                private double sideB;
                private double sideC;
                private double height;

                @Override
                public double area() {
                    System.out.print("The area of the triangle is: ");
                    return sideA * height;
                }

                @Override
                public double perimeter() {
                    System.out.print("The perimeter of the triangle is: ");
                    return sideA + sideB + sideC;
                }
            }

            class Circle implements Shape {

                private double radius;
                private final double PI = 3.14;

                @Override
                public double area() {
                    System.out.print("The area of the circle is: ");
                    return PI * radius * radius;
                }

                @Override
                public double perimeter() {
                    System.out.print("The perimeter of the circle is: ");
                    return 2 * PI * radius;
                }
            }



        Square square = new Square();
        System.out.println(square.area());
        System.out.println(square.perimeter());

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());

        Triangle triangle = new Triangle();
        System.out.println(triangle.area());
        System.out.println(triangle.perimeter());

        Circle circle = new Circle();
        System.out.println(circle.area());
        System.out.println(circle.perimeter());
    }
}
