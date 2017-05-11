package by.anton.exercises.chapter_3.Exercise_3_3;

/**
 * Created by Buben_AV on 11.05.2017.
 */
public class CountryReport {
    /**
     * This method creates the country
     *
     * @return country
     */
    public Country createCountry() {
        Country country = new Country();
        country.setName("Belarus");
        country.setCapital("Minsk");
        country.setSquare(207595.0);
        //Used Ctrl+Alt+Shift+mouse
        country.setRegions("Brestsky", "Vitebsky", "Grodnensky", "Gomelsky", "Minsky", "Mogilevsky");
        country.setDistrictsForRegion("Brestsky", new District("Pinsky", "Pinsk"),
                new District("Kobrinsky","Kobrin"));
        country.setDistrictsForRegion("Vitebsky", new District("Gluboksky", "Glubok"),
                new District("Orshansky","Orshan"));
        country.setDistrictsForRegion("Grodnensky", new District("Lidsky", "Lid"),
                new District("Slonimsky","Slonim"));
        country.setDistrictsForRegion("Gomelsky", new District("Globinsky", "Globin"),
                new District("Mozirsky","Mozir"));
        country.setDistrictsForRegion("Minsky", new District("Borisovsky", "Borisov"),
                new District("Molodechensky","Molodechen"));
        country.setDistrictsForRegion("Mogilevsky", new District("Chausky", "Chau"),
                new District("Bobrujsky","Bobruj"));
        return country;
    }

    /**
     * This method prints the country
     *
     * @param country
     */
    public void printCountry(Country country) {
        System.out.println(country);
    }

    @Override
    public String toString() {
        return "CountryReport{}";
    }
}
