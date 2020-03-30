package org.tasks.kyu6.OopTasks.AreaCalculations;

/**
 * Created by Dell on 5/10/2017.
 */
public class Triangle extends Shape{

    double triangleBase, triangleHeight;

    public Triangle(double triangleBase, double triangleHeight){
        this.triangleBase = triangleBase;
        this.triangleHeight = triangleHeight;
    }

    @Override
    public double area(){return triangleBase*triangleHeight/2;}
}
