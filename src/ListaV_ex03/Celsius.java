package ListaV_ex03;

public class Celsius extends Temperature{
    
    public Celsius(double temperature) {
        super(temperature);
    }

    @Override
    public double absoluteZero() {
        return CELSIUS_ABSOLUTE_ZERO;
    }

    @Override
    public double bolingPointOfWater() {
        return CELSIUS_BOLING_POINT_OF_WATER;
    }

    @Override
    public double freezingPointOfWater() {
       return CELSIUS_FREEZING_POINT_OF_WATER;
    }

    @Override
    public double toCelsius() {
        return getTemperature();
    }

    @Override
    public double toFahrenheit() {
        return (getTemperature() * 9/5) + 32;
    }

    @Override
    public double tokelvin() {
        return getTemperature() + 273.15;
    }

    @Override
    public String unitString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
