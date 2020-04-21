package com.hibernate.data;

import java.util.Arrays;
import java.util.List;
import com.hibernate.model.Country;

public class CountryData {

	
	
	public List<Country> getCountryData(){
		
		List<Country> countryList = Arrays.asList(
				
		new Country("China", 1382050000),
		new Country("India", 1313210000),
		new Country("USA", 324666000),
		new Country("Indonesia", 260581000),
		new Country("Brazil", 207221000),
		new Country("Pakistan", 196626000),
		new Country("Nigeria", 186988000),
		new Country("Bangladesh", 162099000),
		new Country("Russia", 146838000),
		new Country("Japan", 126830000),
		new Country("Mexico", 122273000),
		new Country("Philippines", 103738000),
		new Country("Ethiopia", 101853000),
		new Country("Vietnam", 92700000),
		new Country("Egypt", 92641000),
		new Country("Germany", 82800000),
		new Country("the Congo", 82243000),
		new Country("Iran", 82800000),
		new Country("Turkey", 79814000),
		new Country("Thailand", 68147000),
		new Country("France", 66984000),
		new Country("United Kingdom", 60589000),
		new Country("South Africa", 55908000),
		new Country("Myanmar", 51446000),
		new Country("South Korea", 68147000),
		new Country("Colombia", 49129000),
		new Country("Kenya", 47251000),
		new Country("Spain", 46812000),
		new Country("Argentina", 43850000),
		new Country("Ukraine", 42603000),
		new Country("Sudan", 41176000),
		new Country("Algeria", 40400000),
		new Country("Poland", 38439000),
		new Country("Canada", 37742154),
		new Country("Morocco", 36910560),
		new Country("Saudi Arabia", 34813871),
		new Country("Uzbekistan", 33469203),
		new Country("Peru", 32971854),
		new Country("Angola", 32866272),
		new Country("Malaysia", 32365999),
		new Country("Mozambique", 31255435),
		new Country("Ghana", 31072940),
		new Country("Yemen", 29825964),
		new Country("Nepal", 29136808),
		new Country("Venezuela", 28435940)
);
		
		return countryList;
	}
	
	
	
}
