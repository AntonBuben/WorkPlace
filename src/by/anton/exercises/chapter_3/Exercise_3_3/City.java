package by.anton.exercises.chapter_3.Exercise_3_3;

/**
 * Created by Buben_AV on 11.05.2017.
 */
public class City extends BaseArea {
    /**
     * This is a constructor to intialize district object
     *
     * @param name of city
     */
    public City(String name) {
        this.setName(name);
    }

    /**
     * This is a constructor to intialize district object
     */
    public City() {
    }

    @Override
    public String toString() {
        return "City{" +
                "name=" + name + '\'' +
                "}";
    }
}

