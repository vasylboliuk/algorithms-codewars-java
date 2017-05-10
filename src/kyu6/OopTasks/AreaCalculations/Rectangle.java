package kyu6.OopTasks.AreaCalculations;

/**
 * Created by Dell on 5/10/2017.
 */
public class Rectangle extends Shape{

    double height, width;

    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    @Override
    public double area(){
        return width*height;
    }
}
