import java.util.Scanner;

public class AreaCalculator {
    
   // Circle
    float calculateArea(float radius) {
        return (float)(Math.PI * radius * radius);
    }

    // Rectangle
    float calculateArea(float length, float breadth) {
        return length * breadth;
    }

    // Triangle
    double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       AreaCalculator obj = new AreaCalculator();

        float radius = sc.nextFloat();
        float length = sc.nextFloat();
        float breadth = sc.nextFloat();
        double base = sc.nextDouble();
        double height = sc.nextDouble();

        float circleArea = obj.calculateArea(radius);
        float rectangleArea = obj.calculateArea(length, breadth);
        double triangleArea = obj.calculateArea(base, height);

        System.out.printf("%.2f\n", circleArea);
        System.out.printf("%.2f\n", rectangleArea);
        System.out.printf("%.2f", triangleArea);
    }
}