
public class Seller extends User {
	private Product[] ProductsListed;

	public Product[] getProductsListed() {
		return ProductsListed;
	}

	public void setProductsListed(Product[] productsListed) {
		ProductsListed = productsListed;
	}

	@Override
	public Boolean verifyUser() {
		return true;
	}

	public boolean verifypass() {
		// TODO Auto-generated method stub
		return false;
	}

}
