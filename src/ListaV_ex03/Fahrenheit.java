package ListaV_ex03;

public class Fahrenheit extends Temperature{
    
    public Fahrenheit(double temperature) {
        super(temperature);
    }

    @Override
    public double absoluteZero() {
        return -459;
    }

    @Override
    public double bolingPointOfWater() {
         return 212;
    }

    @Override
    public double freezingPointOfWater() {
        return 32;
    }

    @Override
    public double toCelsius() {
        return (getTemperature() - 32) * (5/9);
    }

    @Override
    public double toFahrenheit() {
        return getTemperature();
    }

    @Override
    public double tokelvin() {
        return (getTemperature() - 32) * (5/9) + 273.15;
    }

    @Override
    public String unitString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
