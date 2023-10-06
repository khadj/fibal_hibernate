package org.example.javarush.redis;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.example.javarush.domain.Continent;

import java.math.BigDecimal;
import java.util.Set;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CityCountry {
    Integer id;

    String name;

    String district;

    Integer population;

    String countryCode;

    String alternativeCountryCode;

    String countryName;

    Continent continent;

    String countryRegion;

    BigDecimal countrySurfaceArea;

    Integer countryPopulation;

    Set<Language> languages;

}