package org.arpit.javapostsforlearning;
02
 
03
public class Country{
04
    int countryId;
05
    String countryName;
06
 
07
    public Country(int countryId, String countryName) {
08
        super();
09
        this.countryId = countryId;
10
        this.countryName = countryName;
11
    }
12
 
13
    public int getCountryId() {
14
        return countryId;
15
    }
16
 
17
    public void setCountryId(int countryId) {
18
        this.countryId = countryId;
19
    }
20
 
21
    public String getCountryName() {
22
        return countryName;
23
    }
24
 
25
    public void setCountryName(String countryName) {
26
        this.countryName = countryName;
27
    }
28
 
29
}
