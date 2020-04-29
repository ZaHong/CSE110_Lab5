package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        float fahrenheit_temp = ((this.getValue()*9)/5)+32;
        Temperature temp = new Fahrenheit(fahrenheit_temp);
        return temp;
    }

    public String toString()
    {
        // TODO: Complete this method
        return "" + this.getValue() + " C";
    }
}
