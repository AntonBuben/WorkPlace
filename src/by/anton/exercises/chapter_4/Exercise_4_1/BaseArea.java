package by.anton.exercises.chapter_4.Exercise_4_1;

/**
 * Created by Buben_AV on 11.05.2017.
 */
public class BaseArea {
    /**
     * name of area
     */
    protected String name;
    /**
     * square of area
     */
    protected Double square;

    /**
     * To set name of area
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * To get name of area
     *
     * @return name of area
     */
    public String getName() {
        return name;
    }

    /**
     * To set square of area
     *
     * @param square
     */
    public void setSquare(Double square) {
        this.square = square;
    }

    /**
     * To get square of area
     *
     * @return square of area
     */
    public Double getSquare() {
        return square;
    }
}
