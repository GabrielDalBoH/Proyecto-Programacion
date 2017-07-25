/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacionii;

import java.text.Collator;
import java.util.*;

public class CountryList2 {

    public static void main(String[] args) {
        // A collection to store our country object
        List<Country> countries = new ArrayList<Country>();

        // Get ISO countries, create Country object and
        // store in the collection.
        String[] isoCountries = Locale.getISOCountries();
        for (String country : isoCountries) {
            Locale locale = new Locale("en", country);
            String iso = locale.getISO3Country();
            String code = locale.getCountry();
            String name = locale.getDisplayCountry();

            if (!"".equals(iso) && !"".equals(code)
                    && !"".equals(name)) {
                countries.add(new Country(name));
            }
        }

        // Sort the country by their name and then display the content
        // of countries collection object.
        Collections.sort(countries, new CountryComparator());

        for (Country country : countries) {
            System.out.println(country);
        }
    }

    /**
     * Country pojo class.
     */
    static class Country {

        private String name;

        Country(String name) {
            this.name = name;
        }

        public String toString() {
            return " " + name.toUpperCase();
        }
    }

    /**
     * CountryComparator class.
     */
    private static class CountryComparator implements Comparator<Country> {

        private Comparator<Object> comparator;

        CountryComparator() {
            comparator = Collator.getInstance();
        }

        public int compare(Country c1, Country c2) {
            return comparator.compare(c1.name, c2.name);
        }
    }
}
