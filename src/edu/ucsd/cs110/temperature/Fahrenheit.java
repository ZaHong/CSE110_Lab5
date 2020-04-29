package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float fahrenheit_temp = ((this.getValue()-32)*5)/9;
        Temperature temp = new Celsius(fahrenheit_temp);
        return temp;
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString()
    {
        // TODO: Complete this method
        return "" + this.getValue() + " F";
    }
}
