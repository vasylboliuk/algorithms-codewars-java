package kyu6.OopTasks.AreaCalculations;

/**
 * Created by Dell on 5/10/2017.
 */
public class Circle extends Shape {

    double radius;

    public Circle(double radius){this.radius = radius;}

    @Override
    public double area(){return Math.PI*radius*radius;}
}
