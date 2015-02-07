package org.arpit.javapostsforlearning;
02
 
03
import java.util.ArrayList;
04
import java.util.Collections;
05
import java.util.Comparator;
06
import java.util.List;
07
 
08
public class ComparatorMain {
09
 
10
    /**
11
     * @author Arpit Mandliya
12
     */
13
    public static void main(String[] args) {
14
         Country indiaCountry=new Country(1, 'India');
15
         Country chinaCountry=new Country(4, 'China');
16
         Country nepalCountry=new Country(3, 'Nepal');
17
         Country bhutanCountry=new Country(2, 'Bhutan');
18
 
19
            List<Country> listOfCountries = new ArrayList<Country>();
20
            listOfCountries.add(indiaCountry);
21
            listOfCountries.add(chinaCountry);
22
            listOfCountries.add(nepalCountry);
23
            listOfCountries.add(bhutanCountry);
24
 
25
            System.out.println('Before Sort by id : ');
26
            for (int i = 0; i < listOfCountries.size(); i++) {
27
                Country country=(Country) listOfCountries.get(i);
28
                System.out.println('Country Id: '+country.getCountryId()+'||'+'Country name: '+country.getCountryName());
29
            }
30
            Collections.sort(listOfCountries,new CountrySortByIdComparator());
31
 
32
            System.out.println('After Sort by id: ');
33
            for (int i = 0; i < listOfCountries.size(); i++) {
34
                Country country=(Country) listOfCountries.get(i);
35
                System.out.println('Country Id: '+country.getCountryId()+'|| '+'Country name: '+country.getCountryName());
36
            }
37
 
38
            //Sort by countryName
39
            Collections.sort(listOfCountries,new Comparator<Country>() {
40
 
41
                @Override
42
                public int compare(Country o1, Country o2) {
43
                    return o1.getCountryName().compareTo(o2.getCountryName());
44
                }
45
            });
46
 
47
            System.out.println('After Sort by name: ');
48
            for (int i = 0; i < listOfCountries.size(); i++) {
49
                Country country=(Country) listOfCountries.get(i);
50
                System.out.println('Country Id: '+country.getCountryId()+'|| '+'Country name: '+country.getCountryName());
51
            }
52
    }
53
 
54
}
