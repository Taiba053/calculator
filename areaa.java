import java.util.Scanner;

public class areaa {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose shape: ");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        
        int choice = scanner.nextInt();
        
        if(choice == 1) {
            System.out.println("Enter the side length of the square: ");
            double side = scanner.nextDouble();
            double area = calculateSquareArea(side);
            System.out.println("Area of the square: " + area);
        } else if(choice == 2) {
            System.out.println("Enter the length of the rectangle: ");
            double length = scanner.nextDouble();
            System.out.println("Enter the width of the rectangle: ");
            double width = scanner.nextDouble();
            double area = calculateRectangleArea(length, width);
            System.out.println("Area of the rectangle: " + area);
        } else {
            System.out.println("Invalid choice!");
        }
        
        scanner.close();
    }
    
    public static double calculateSquareArea(double side) {
        return side * side;
    }
    
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }
}
