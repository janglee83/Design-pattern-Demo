import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// khởi tạo product
		Component product1 = new Product("Sản phẩm 1", 10000);
		Component product2 = new Product("Sản phẩm 2", 20000);
		Component producct3 = new Product("Sản phẩm 3", 30000);

		// lisst cas component
		List<Component> listProduct = Arrays.asList(product1, product2, producct3);

		// box chua cac conponents
		Box firstBox = new Box(listProduct);

		// khoi tao sub modun
		Component product4 = new Product("Sản phẩm 4", 40000);
		Component product5 = new Product("Sản phẩm 6", 60000);

		Box secondBox = new Box();
		secondBox.addComponent(product5);

		Box bigestBox = new Box();
		bigestBox.addComponent(secondBox);
		bigestBox.addComponent(firstBox);

		bigestBox.addComponent(product4);

		// get box size
		System.out.println("Total Size: " + bigestBox.totalSize());
	}
}
