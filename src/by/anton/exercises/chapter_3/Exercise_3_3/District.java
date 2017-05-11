package by.anton.exercises.chapter_3.Exercise_3_3;

/**
 * Created by Buben_AV on 11.05.2017.
 */
public class District extends BaseArea{
    private City city;

    public District(String nameDistrict, String nameCity) {
        this.setName(nameDistrict);
        this.city = new City(nameCity);
    }

    public District() {
        this.city = new City();
    }

    public void setCity(String nameCity) {
        this.city.setName(nameCity);
    }

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
