// Java
// Call interator and print item in menu
public class IteratorPatternMenu {

    public static void main(String[] args) {
        ConcreteCollection menu = new ConcreteCollection();

        for (Iterator iter = menu.getIterator(); iter.hasNext();) {
            String menuItem = (String) iter.next();
            System.out.println("Menu item : " + menuItem);
        }
    }
}
