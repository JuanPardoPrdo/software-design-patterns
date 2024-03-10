package abstractfactory.examples.kingdom.factories;

import abstractfactory.examples.kingdom.parts.*;


public class MenKingdomFactory extends KingdomFactory {
    @Override
    public Castle makeCastle() {
        return new MenCastle();
    }

    @Override
    public King makeKing() {
        return new MenKing();
    }

    @Override
    public Army makeArmy() {
        return new MenArmy();
    }
}
