public class Glider extends AirplaneBuilder {
    private Airplane airplane = new Airplane();
    public void buildWings(){
        airplane.wingspan=57;
    }

    public void buildPowerplant(){
        airplane.powerplant="No Engine";
        airplane.planetype = "Glider";
    }

    public void buildSeats(){
        airplane.crewSeats=1;
        airplane.passengerSeats=0;
    }

    public Airplane GetAirplane(){
        return airplane;
    }
}
