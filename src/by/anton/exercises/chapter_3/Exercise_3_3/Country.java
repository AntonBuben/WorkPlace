package by.anton.exercises.chapter_3.Exercise_3_3;

import sun.plugin.javascript.navig.Array;

import java.util.Arrays;

/**
 * Created by Buben_AV on 11.05.2017.
 */
public class Country extends BaseArea {
    private City capital;
    private Region region[];

    public void setCapital(String capital) {
        this.capital = new City(capital);
    }

    public String getCapital() {
        return capital.getName();
    }

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

    public Region[] getRegion() {
        return region;
    }

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
                "}\n"+
                Arrays.toString(region);
    }
}
