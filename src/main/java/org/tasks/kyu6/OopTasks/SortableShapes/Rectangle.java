package org.tasks.kyu6.OopTasks.SortableShapes;

/**
 * Created by Dell on 5/6/2017.
 */
public class Rectangle extends Shape{

    double width, height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double area(){
        return width*height;
    }
}
