/* ConcreteBuilder */
public class CropDuster extends AirplaneBuilder{

    private Airplane airplane = new Airplane();
    public void buildWings(){
        airplane.wingspan=9;
    }

    public void buildPowerplant(){
        airplane.powerplant="single piston";
        airplane.planetype = "CropDuster";
    }

    public void buildSeats(){
        airplane.crewSeats=1;
        airplane.passengerSeats=1;
    }

    public Airplane GetAirplane(){
        return airplane;
    }
}