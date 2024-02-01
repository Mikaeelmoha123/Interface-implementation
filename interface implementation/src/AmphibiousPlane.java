
public class AmphibiousPlane implements Amphibious, AirVehicle {


    @Override
    public void dock() {
        System.out.println("AmphibiousPlane is docking on water.");
    }

    @Override
    public void launch() {
        System.out.println("AmphibiousPlane is launching from water.");
    }


    @Override
    public void takeOff() {
        System.out.println("AmphibiousPlane is taking off in the air.");
    }

    @Override
    public void land() {
        System.out.println("AmphibiousPlane is landing on the ground.");
    }


    public void travelOnLand() {
        System.out.println("AmphibiousPlane is traveling on land.");
    }

    public static void main(String[] args) {
        AmphibiousPlane amphibiousPlane = new AmphibiousPlane();


        amphibiousPlane.dock();
        amphibiousPlane.launch();


        amphibiousPlane.takeOff();
        amphibiousPlane.land();


        amphibiousPlane.travelOnLand();
    }
}
