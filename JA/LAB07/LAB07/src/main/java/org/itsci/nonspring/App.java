package org.itsci.nonspring;

import org.itsci.simduck.Duck;

public class App
{
    public static void main( String[] args )
    {
        new App().start();

    }

    private void start() {
        System.out.println("Mini duck simulator");
//        MallardDuck mallardDuck = new MallardDuck();
//        ModelDuck modelDuck = new ModelDuck();
//        mallardDuck.performQuack();
//        mallardDuck.performFly();
//        modelDuck.performQuack();
//        modelDuck.performFly();
        Duck[] ducks = { new MallardDuck(), new ModelDuck() };
        for (Duck duck : ducks) {
            duck.performQuack();duck.performFly();
        }
    }

}
