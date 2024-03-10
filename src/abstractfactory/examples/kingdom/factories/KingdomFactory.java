package abstractfactory.examples.kingdom.factories;

import abstractfactory.examples.kingdom.parts.Army;
import abstractfactory.examples.kingdom.parts.Castle;
import abstractfactory.examples.kingdom.parts.King;


public abstract class KingdomFactory {

    public abstract Castle makeCastle();
    public abstract King makeKing();
    public abstract Army makeArmy();

}
