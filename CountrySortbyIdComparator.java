package org.arpit.javapostsforlearning;
02
 
03
import java.util.Comparator;
04
//If country1.getCountryId()<country2.getCountryId():then compare method will return -1
05
//If country1.getCountryId()>country2.getCountryId():then compare method will return 1
06
//If country1.getCountryId()==country2.getCountryId():then compare method will return 0
07
 public class CountrySortByIdComparator implements Comparator<Country>{
08
 
09
    @Override
10
    public int compare(Country country1, Country country2) {
11
 
12
        return (country1.getCountryId() < country2.getCountryId() ) ? -1: (country1.getCountryId() > country2.getCountryId() ) ? 1:0 ;
13
    }
14
 
15
}
