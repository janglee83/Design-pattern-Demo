public class Product implements Component {

	private String name;

	private int price;

	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}


	@Override
	public void open() {
		System.out.println("Product " + name + " had opened");
	}

	@Override
    public long totalSize() {
        return price;
    }

}
