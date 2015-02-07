package org.arpit.javapostsforlearning;
02
//If this.cuntryId < country.countryId:then compare method will return -1
03
//If this.countryId > country.countryId:then compare method will return 1
04
//If this.countryId==country.countryId:then compare method will return 0
05
public class Country implements Comparable{
06
    int countryId;
07
    String countryName;
08
 
09
    public Country(int countryId, String countryName) {
10
        super();
11
        this.countryId = countryId;
12
        this.countryName = countryName;
13
    }
14
 
15
    @Override
16
    public int compareTo(Object arg0) {
17
        Country country=(Country) arg0;
18
        return (this.countryId < country.countryId ) ? -1: (this.countryId > country.countryId ) ? 1:0 ;
19
    }
20
 
21
    public int getCountryId() {
22
        return countryId;
23
    }
24
 
25
    public void setCountryId(int countryId) {
26
        this.countryId = countryId;
27
    }
28
 
29
    public String getCountryName() {
30
        return countryName;
31
    }
32
 
33
    public void setCountryName(String countryName) {
34
        this.countryName = countryName;
35
    }
36
 
37
}
