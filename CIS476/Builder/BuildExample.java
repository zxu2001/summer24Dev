public class BuildExample {

    public static void main(String[] args){
        AerospaceEngineer mydirector = new AerospaceEngineer();

        AirplaneBuilder crop=new CropDuster();
        AirplaneBuilder fighter = new FighterJet();
        AirplaneBuilder glider = new Glider();
        
        mydirector.constructAirplane(crop);
        Airplane completedCropDuster = crop.GetAirplane();
        completedCropDuster.show();

        mydirector.constructAirplane(fighter);
        Airplane completedFighterJet = fighter.GetAirplane();
        completedFighterJet.show();

        mydirector.constructAirplane(glider);
        Airplane completedGlider = glider.GetAirplane();
        completedGlider.show();
    }
}