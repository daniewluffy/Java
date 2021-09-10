package ListaV_ex03;

public class Kelvin extends Temperature{
    
    public Kelvin(double temperature) {
        super(temperature);
    }

    @Override
    public double absoluteZero() {
       return 0;
    }

    @Override
    public double bolingPointOfWater() {
        return 373;
    }

    @Override
    public double freezingPointOfWater() {
        return 273;
    }

    @Override
    public double toCelsius() {
        return getTemperature() - 273.15;
    }

    @Override
    public double toFahrenheit() {
          return (getTemperature() - 273.15) * (9/5 + 32);
    }

    @Override
    public double tokelvin() {
       return getTemperature();
    }

    @Override
    public String unitString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
