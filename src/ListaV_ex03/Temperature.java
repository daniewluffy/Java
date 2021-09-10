package ListaV_ex03;

public abstract class Temperature {
    public final double CELSIUS_ABSOLUTE_ZERO = -273;
    public final double CELSIUS_FREEZING_POINT_OF_WATER = 0;
    public final double CELSIUS_BOLING_POINT_OF_WATER = 100;
    public double temperature;

    public Temperature(double temperature) {
        this.temperature = temperature;
    }
    
    public abstract double absoluteZero();
    public abstract double bolingPointOfWater();
    public abstract double freezingPointOfWater();
    public abstract double toCelsius();
    public abstract double toFahrenheit();
    public abstract double tokelvin();
    public abstract String unitString();

    @Override
    public String toString() {
        return super.toString();
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    
    Temperature temp[];
}
