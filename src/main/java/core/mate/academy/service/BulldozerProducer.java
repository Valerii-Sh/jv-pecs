package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Machine> get() {
        Bulldozer bulldozerOne = new Bulldozer("bulldozerOne", "white", "standard");
        Bulldozer bulldozerTwo = new Bulldozer("bulldozerTwo", "yellow", "strong");
        Bulldozer bulldozerThree = new Bulldozer("bulldozerThree", "green", "heavy");
        return List.of(bulldozerOne, bulldozerTwo, bulldozerThree);
    }
}
