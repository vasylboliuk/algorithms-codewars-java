package org.tasks.kyu6.OopTasks.SortableShapes;

/**
 * Created by Dell on 5/6/2017.
 */
public abstract class Shape implements Comparable<Shape>{

    public abstract double area();

    @Override
    public int compareTo(Shape o) {
        if(o == null) {
            return 1;
        }
        return Double.compare(this.area(), o.area());
    }
}
