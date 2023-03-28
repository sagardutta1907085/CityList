package com.example.citylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if that city does not exist
     * @param city
     *      This is the city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     *
     * @param city
     * It checks if the given city can be deleted or not.
     * If it exist,then delete the city,
     * Else Throw an exception
     */

    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /**
     *
     * @return
     * This method counts the total number of cities and return its size.
     */
    public int count(){
        return cities.size();
    }

    /**
     * This returns a sorted list of cities
     * @return
     *      Return the sorted list of cities
     *      If srt==1,the list is sorted on cities name,
     *      else the list is sorted on Province name.
     */
    public List<City> getCities(int srt) {
        List<City> cityList = cities;
        if(srt==1) Collections.sort(cityList);
        else {
            Collections.sort(cityList, new Comparator<City>() {
                @Override
                public int compare(City o1, City o2) {
                    return o1.getProvinceName().compareTo(o2.getProvinceName());
                }
            });
        }
        return cityList;
    }
}
