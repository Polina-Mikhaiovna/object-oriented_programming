public abstract class Actor implements ActorsBehaviour {

    protected boolean isMakeOrder;
    protected boolean isTakeOrder;
    protected final String name;

    protected Actor(String name) {
        this.name = name;
    }
    public abstract String getName();

}


