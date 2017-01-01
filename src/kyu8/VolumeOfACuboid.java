package kyu8;

/**
 * Created by vboliuk on 29.12.2016.
 */
public class VolumeOfACuboid {

    /*
    Description:
    Bob needs a fast way to calculate the volume of a cuboid with three values: length, width and the height of the cuboid. Write a function to help Bob with this calculation.
    Ruby: def get_volume_of_cuboid(length, width, height)
     */
    public static double getVolumeOfCuboid(final double length, final double width, final double height) {
        return length * width * height;
    }
}
