package org.tasks.kyu6.OopTasks.SortableShapes;

/**
 * Created by Dell on 5/6/2017.
 */
public class CustomShape extends Shape{

    double area;

    public CustomShape(double area){
        this.area = area;
    }
    
    @Override
    public double area(){
        return this.area;
    }
}
