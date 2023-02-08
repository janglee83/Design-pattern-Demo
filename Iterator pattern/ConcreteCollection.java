// Java
// Class menu implement Container
public class ConcreteCollection implements Container {
    @Override
    public Iterator getIterator() {
        return new ConcreteIterator();
    }
}
