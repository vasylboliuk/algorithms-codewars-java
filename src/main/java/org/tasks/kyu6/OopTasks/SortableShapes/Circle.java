package org.tasks.kyu6.OopTasks.SortableShapes;

/**
 * Created by Dell on 5/6/2017.
 */
public class Circle extends Shape{

    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double area(){
        return this.radius*this.radius*Math.PI;
    }
}
