
public class Category {
	private String categoryName;
	private Category[] subCategories;

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Category[] getSubcategories() {
		return subCategories;
	}

	public void setSubcategories(Category[] subcategories) {
		this.subCategories = subcategories;
	}
	
	
}
