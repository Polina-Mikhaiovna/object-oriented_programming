import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour{
    public List<Actor> queue;

    @Override
    public void takeInQueue(Actor actor) {
        queue.add(actor);
    }

    @Override
    public void takeOrder() {
        for (Actor actor : queue){
            if(actor.isMakeOrder()){
                actor.isTakeOrder = true;
            }
            else actor.isTakeOrder = false;
        }
    }

    @Override
    public void giveOrder() {
        for (Actor actor : queue){
            if (actor.isMakeOrder) {
                actor.isTakeOrder = true;
            }
        }
    }

    @Override
    public void releaseFromQueue() {

    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor + " came to market and accept to queue");
        takeInQueue(actor);

    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {

    }

    @Override
    public void update() {

    }
}
