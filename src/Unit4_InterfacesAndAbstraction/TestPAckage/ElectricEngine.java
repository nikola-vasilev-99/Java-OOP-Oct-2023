package Unit4_InterfacesAndAbstraction.TestPAckage;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("You have just pressed the start button! The ELECTRIC engine has started!");
    }

    @Override
    public void stop() {
        System.out.println("Turning off the ELECTRIC engine. Please do not exit the car!");
    }

    @Override
    public void check() {
        System.out.println("Maintenance is being started.");
        System.out.println("No problems were found! You are good to go!");
    }
}
