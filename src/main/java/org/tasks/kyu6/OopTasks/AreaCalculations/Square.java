package org.tasks.kyu6.OopTasks.AreaCalculations;

/**
 * Created by Dell on 5/10/2017.
 */
public class Square extends Shape {

    double base;

    public Square(double base){
        this.base = base;
    }

    @Override
    public double area(){
        return base*base;
    }
}
