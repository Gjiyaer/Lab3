package object;

import abstractClass.RocketPart;
import interfaces.DisconnectInterface;

public class BodyStage extends RocketPart implements DisconnectInterface {

    public BodyStage(String name, double weight) {
        super(name, weight);
    }

    @Override
    public void disconnect(Double weight) {
        System.out.println("Вторая ступень отсоединена");
    }

    @Override
    public void assemble(String fasilityname) {
        System.out.println("Деталь собрана:"+fasilityname);
    }
}
