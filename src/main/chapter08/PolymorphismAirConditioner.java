package chapter08;

/**
 * Created by jotaiwan on 19/03/2017.
 */

public class PolymorphismAirConditioner implements PolymorphismRemoteControl
{
    private String name;

    public PolymorphismAirConditioner(String cTemp) {
        this.name = cTemp;
    }

    public String getName() {
        return this.name;
    }

    public String turnOn()  {
        return "PolymorphismAirConditioner ON";
    }

    public String turnOff() {
        return "PolymorphismAirConditioner OFF";
    }
}
