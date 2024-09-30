public class BuildExample {

    public static void main(String[] args){
        AerospaceEngineer mydirector = new AerospaceEngineer();

        AirplaneBuilder crop=new CropDuster();
        mydirector.constructAirplane(crop);
        Airplane completedCropDuster = crop.GetAirplane();
        completedCropDuster.show();
    }
}