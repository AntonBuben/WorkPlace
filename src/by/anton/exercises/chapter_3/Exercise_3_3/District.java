package by.anton.exercises.chapter_3.Exercise_3_3;

/**
 * Created by Buben_AV on 11.05.2017.
 */
public class District extends BaseArea{
    /**
     *  city
     */
    private City city;

    /**
     * This is a constructor to intialize district object
     * @param nameDistrict name of a district
     * @param nameCity name of a city
     */
    public District(String nameDistrict, String nameCity) {
        this.setName(nameDistrict);
        this.city = new City(nameCity);
    }

    /**
     * This is a constructor to intialize district object
     */
    public District() {
        this.city = new City();
    }

    /**
     * To set name of a city
     * @param nameCity
     */
    public void setCity(String nameCity) {
        this.city.setName(nameCity);
    }

    /**
     * To get name of a city
     * @return name of a city
     */
    public String getCity() {
        return city.getName();
    }

    @Override
    public String toString() {
        return "District{" +
                " Name=" + name  +
                ", City=" + city.toString() +
                "}";
    }
}
