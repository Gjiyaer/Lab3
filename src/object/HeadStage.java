package object;

import abstractClass.RocketPart;
import interfaces.GravityInterface;
import interfaces.ZeroGravityInterface;

public class HeadStage extends RocketPart implements GravityInterface, ZeroGravityInterface {

    public HeadStage(String name, double weight) {
        super(name, weight);
    }

    @Override
    public void assemble(String fasilityname) {
        System.out.println("Деталь собрана:"+fasilityname);
    }

    @Override
    public void landing(String planet) {
        System.out.println("Происходит приземление на планету "+planet);
    }

    @Override
    public void navigate(String planet) {
        System.out.println("Происходит навигация на планету "+ planet);
    }
}
