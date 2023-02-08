import java.util.ArrayList;
import java.util.List;

public class Box implements Component {

	private List<Component> listProducts = new ArrayList<Component>();

	public Box() {

	}

	public Box(List<Component> listProducts) {
		this.listProducts = listProducts;
	}

	public void addComponent(Component product) {
		listProducts.add(product);
	}

	public void removeComponent(Component product) {
		listProducts.remove(product);
	}

	@Override
	public void open() {
		System.out.println("Box had opened");
	}

	@Override
    public long totalSize() {
        long total = 0;
        for (Component component : listProducts) {
            total += component.totalSize();
        }
        return total;
    }

}

