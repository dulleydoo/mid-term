public class IceCream extends Product implements Consumable, LickAble{
    public IceCream(String name, double price, Size size) {
        super(name, price, size);
    }

    @Override
    public void consume() {
        System.out.println("Now consuming Vanilla ice-cream");
    }

    @Override
    public boolean safeToLick() {
        return false;
    }
}
