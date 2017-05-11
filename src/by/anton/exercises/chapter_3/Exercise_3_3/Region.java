package by.anton.exercises.chapter_3.Exercise_3_3;

import java.util.Arrays;

/**
 * Created by Buben_AV on 11.05.2017.
 */
public class Region extends BaseArea {
    /**
     * districts of a region
     */
    private District district[];

    /**
     * To set the districts of a region
     * @param district
     */

    public void setDistricts(District... district) {
        if (district.length != 0) {
            this.district = new District[district.length];
            for (int i = 0; i < district.length; i++) {
                this.district[i] = new District(district[i].getName(),district[i].getCity());
            }
        } else {
            System.out.println("No districts!!!");
        }
    }

    @Override
    public String toString() {
        return "\nRegion {" +
                " Name=" + name +
                ", District=" + Arrays.toString(district) +
                "}";
    }
}
