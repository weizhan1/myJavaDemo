package org.arpit.javapostsforlearning;
02
 
03
import java.util.ArrayList;
04
import java.util.Collections;
05
import java.util.List;
06
 
07
public class ComparatorMain {
08
 
09
    /**
10
     * @author Arpit Mandliya
11
     */
12
    public static void main(String[] args) {
13
         Country indiaCountry=new Country(1, 'India');
14
         Country chinaCountry=new Country(4, 'China');
15
         Country nepalCountry=new Country(3, 'Nepal');
16
         Country bhutanCountry=new Country(2, 'Bhutan');
17
 
18
            List<Country> listOfCountries = new ArrayList<Country>();
19
            listOfCountries.add(indiaCountry);
20
            listOfCountries.add(chinaCountry);
21
            listOfCountries.add(nepalCountry);
22
            listOfCountries.add(bhutanCountry);
23
 
24
            System.out.println('Before Sort  : ');
25
            for (int i = 0; i < listOfCountries.size(); i++) {
26
                Country country=(Country) listOfCountries.get(i);
27
                System.out.println('Country Id: '+country.getCountryId()+'||'+'Country name: '+country.getCountryName());
28
            }
29
            Collections.sort(listOfCountries);
30
 
31
            System.out.println('After Sort  : ');
32
            for (int i = 0; i < listOfCountries.size(); i++) {
33
                Country country=(Country) listOfCountries.get(i);
34
                System.out.println('Country Id: '+country.getCountryId()+'|| '+'Country name: '+country.getCountryName());
35
            }
36
    }
37
 
38
}
