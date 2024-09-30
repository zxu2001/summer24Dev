/* AbstractBuilder */
public abstract class AirplaneBuilder{
    public abstract void buildWings();
    public abstract void buildPowerplant();
    public abstract void buildSeats();
    protected abstract Airplane GetAirplane();
}