import Duck.Duck;
import Duck.MallardDuck;
import Duck.ModelDuck;
import Duck.Fly.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) throws Exception {

        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
        
    }
}
