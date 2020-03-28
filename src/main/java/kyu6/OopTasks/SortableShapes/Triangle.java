package kyu6.OopTasks.SortableShapes;

/**
 * Created by Dell on 5/6/2017.
 */
public class Triangle extends Shape{

    double base, height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    @Override
    public double area(){
        return this.base*this.height/2;
    }
}
