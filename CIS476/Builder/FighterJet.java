public class FighterJet extends AirplaneBuilder {
    private Airplane airplane = new Airplane();
    public void buildWings(){
        airplane.wingspan=35;
    }

    public void buildPowerplant(){
        airplane.powerplant="dual thrust vectoring";
        airplane.planetype = "Fighter Jet";
    }

    public void buildSeats(){
        airplane.crewSeats=1;
        airplane.passengerSeats=0;
    }

    public Airplane GetAirplane(){
        return airplane;
    }   
}
