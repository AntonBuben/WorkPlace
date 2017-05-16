package by.anton.exercises.chapter_4.Exercise_4_1;

import java.util.Arrays;

/**
 * Created by Buben_AV on 11.05.2017.
 */

public class Country extends BaseArea {
    /**
     * capital of a country
     */
    private City capital;
    /**
     * regions of a country
     */
    private Region region[];

    /**
     * To set a capital of a country
     *
     * @param capital of a country
     */
    public void setCapital(String capital) {
        this.capital = new City(capital);
    }

    /**
     * To get a capital of a country
     *
     * @return name of a capital
     */
    public String getCapital() {
        return capital.getName();
    }

    /**
     * To set regions of a country
     *
     * @param region
     */
    public void setRegions(String... region) {
        if (region.length != 0) {
            this.region = new Region[region.length];
            for (int i = 0; i < region.length; i++) {
                this.region[i] = new Region();
                this.region[i].setName(region[i]);
            }
        } else {
            System.out.println("No regions!!!");
        }
    }

    /**
     * To get regions of a country
     *
     * @return region
     */
    public Region[] getRegion() {
        return region;
    }

    /**
     * To set districts for the region
     *
     * @param region   of a country
     * @param district of the region
     */
    public void setDistrictsForRegion(String region, District... district) {
        if (region != null && district.length != 0 && this.region.length != 0)
            for (int i = 0; i < this.region.length; i++) {
                if (this.region[i].getName() == region) {
                    this.region[i].setDistricts(district);
                    break;
                }
            }
    }

    @Override
    public String toString() {
        return "Country {" +
                " Name=" + name +
                ", Square=" + square +
                ", Capital=" + capital.getName() +
                "}\n" +
                Arrays.toString(region);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        if (capital != null ? !capital.equals(country.capital) : country.capital != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(region, country.region);
    }

    @Override
    public int hashCode() {
        int result = capital != null ? capital.hashCode() : 0;
        result = 31 * result + Arrays.hashCode(region);
        return result;
    }
}
