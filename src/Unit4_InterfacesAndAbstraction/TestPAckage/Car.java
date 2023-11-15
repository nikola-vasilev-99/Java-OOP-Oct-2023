package Unit4_InterfacesAndAbstraction.TestPAckage;

public class Car {
    public Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void pressTheStartButton() {
        engine.start();
    }

    public void turnOffTheEngine() {
        engine.stop();
    }

    public void runMaintenance() {
        engine.check();
    }
}
