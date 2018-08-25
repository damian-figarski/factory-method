package com.doddlecode;

public final class CountryFactory {

    public static Country getCountry(String name) throws WrongCountryException {
        switch (name) {
            case "France":
                return new France("France", 33.33, 45.0, 20.0);
            case "Croatia":
                return new Croatia("Croatia", 20.0, 40.0, 25.0);
            case "Belgium":
                return new Belgium("Belgium", 33.99, 50.0, 21.0);
            case "England":
                return new England("England", 20.0, 20.0, 20.0);
            default:
                throw new WrongCountryException();
        }
    }

}
