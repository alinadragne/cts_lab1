package ro.ase.cts.seminar6.builder;

public class TechProduct implements Product, Cloneable{

	int id;
	String productName;
	String manufacturer;
	String model;
	String displayType;
	float price;
	
	private TechProduct() {		
	}
	
	private TechProduct(int id) {
		super();
		this.id = id;
	}
	
	
	@Override
	public String getDescription() {
		return this.productName + " " +this.manufacturer +" "+ this.model;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getDisplayType() {
		return displayType;
	}

	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
	public static class TechProductBuilder{
		private TechProduct product;
		
		public TechProductBuilder(int id) {
			product = new TechProduct(id);
		}
		
		public TechProductBuilder setName(String name) {
			product.productName = name;
			return this;
		}
		
		public TechProductBuilder setManufacturer(String manufacturer) {
			product.manufacturer = manufacturer;
			return this;
		}
		
		public TechProductBuilder setModel(String model) {
			product.model = model;
			return this;
		}
		
		public TechProductBuilder setDisplayType(String displayType) {
			product.displayType = displayType;
			return this;
		}
		
		public TechProductBuilder setPrice(float price) {
			product.price = price;
			return this;
		}
		
		public TechProduct getProduct() {
			return product;
		}
		
		
	}


	@Override
	public Object clone() throws CloneNotSupportedException {
		TechProduct newProduct = new TechProductBuilder(this.id)
				.setDisplayType(this.displayType)
				.setManufacturer(this.manufacturer)
				.setModel(this.model)
				.setName(this.productName)
				.setPrice(this.price)
				.getProduct();
		
		return newProduct;
	}
		

}
