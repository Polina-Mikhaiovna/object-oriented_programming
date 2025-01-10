public class Water extends Product{
    private double volume;

    public Water(String name, double prise, int count, double volume) {
        super(name, prise, count);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String getDescription() {
        return "Water: " + getName() + ", count: " + getCount();
    }

    @Override
    public String toString() {
        return "Water{" +
                "volume=" + getVolume() + ";prise=" + getPrise() + ";count=" + getCount() + '}';
    }
}
