package org.tasks.kyu6.OopTasks.SortableShapes;

/**
 * Created by Dell on 5/6/2017.
 */
public class Square extends Shape{

    double side;

    public Square(double side){
        this.side = side;
    }

    @Override
    public double area(){
        return side*side;
    }
}
