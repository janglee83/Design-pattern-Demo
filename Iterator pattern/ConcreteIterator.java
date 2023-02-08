public class ConcreteIterator implements Iterator {
    public String menu[] = { "Cà phê", "Nước cam", "Bò Húc", "Sting" };

    int index;

    private ConcreteCollection collection;

    public ConcreteIterator() {
    }

    @Override
    public boolean hasNext() {

        if (index < menu.length) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {

        if (this.hasNext()) {
            return menu[index++];
        }
        return null;
    }
}
