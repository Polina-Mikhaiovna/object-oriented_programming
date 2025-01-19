//� Создать наследника класса Продукта - ГорячийНапиток с дополнительным полем int температура.
//� Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать
//перегруженный метод getProduct(int name, int volume, int temperature) выдающий продукт
//        соответствующий имени, объему и температуре
//� В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и
//воспроизвести логику заложенную в программе
//� Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре

public class HotDrinks extends Product{

    private final double temperature;
    private final double volume;

    public HotDrinks(String name, double prise, int count, double volume, double temperature) {
        super(name, prise, count);
        this.temperature = temperature;
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public double getTemperature() {
        return temperature;
    }



    @Override
    public String getDescription() {
        return "Hot drink/" + getName() + " has temperature - " + getTemperature();
    }

    @Override
    public String toString() {
        return "HotDrinks{name=" + getName() +
                ", volume=" + volume +
                ", temperature=" + temperature +
                '}';
    }
}
