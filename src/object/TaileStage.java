package object;

import abstractClass.RocketPart;
import interfaces.DisconnectInterface;

public class TaileStage extends RocketPart implements DisconnectInterface {

    public TaileStage(String name, double weight) {
        super(name, weight);
    }

    @Override
    public void disconnect(Double weight) {
        System.out.println("Первая ступень отсоединена");
    }

    @Override
    public void assemble(String fasilityname) {
        System.out.println("Деталь собрана:"+fasilityname);
    }
}
