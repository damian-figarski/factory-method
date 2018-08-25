package com.doddlecode;

public abstract class Country {

    private String countryName;
    private double corporateTax;
    private double individualTax;
    private double vatTax;

    public Country(String countryName, double corporateTax, double individualTax, double vatTax) {
        this.countryName = countryName;
        this.corporateTax = corporateTax;
        this.individualTax = individualTax;
        this.vatTax = vatTax;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public double getCorporateTax() {
        return corporateTax;
    }

    public void setCorporateTax(double corporateTax) {
        this.corporateTax = corporateTax;
    }

    public double getIndividualTax() {
        return individualTax;
    }

    public void setIndividualTax(double individualTax) {
        this.individualTax = individualTax;
    }

    public double getVatTax() {
        return vatTax;
    }

    public void setVatTax(double vatTax) {
        this.vatTax = vatTax;
    }

}
