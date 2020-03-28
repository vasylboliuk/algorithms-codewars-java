package kyu6.OopTasks.AreaCalculations;

import java.text.DecimalFormat;

/**
 * Created by Dell on 5/10/2017.
 */
public class Calculator {

    private double roundDouble(double value){
        DecimalFormat df = new DecimalFormat("####0.00");
        value = Double.valueOf(df.format(value));
        return value;
    }

    public double getTotalArea(){
        return 0;
    }

    public double getTotalArea(Shape... shape){
        double area = 0;
        for (Shape sh : shape)
        {
            area = area + sh.area();
        }
        area = roundDouble(area);
        return area;
    }
}
