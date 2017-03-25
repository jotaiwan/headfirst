package chapter08;

/**
 * Created by jotaiwan on 19/03/2017.
 */
public class PolymorphismElectronicDoor implements PolymorphismRemoteControl
{
    private String name;

    public PolymorphismElectronicDoor(String cTemp) {
        this.name = cTemp;
    }

    public String getName() {
        return this.name;
    }

    public String turnOn()  {
        return "PolymorphismElectronicDoor ON";
    }

    public String turnOff() {
        return "PolymorphismElectronicDoor OFF";
    }
}