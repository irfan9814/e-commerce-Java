import java.util.Scanner;

public class Store {
	public static void main(String[] args) {
		System.out.println("Welcome to the ecommerce store!");
		System.out.println("Which user are you? 1. Customer 2. Seller 3. Admin");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		String typeOfUser;
		if (choice == 1) {
			typeOfUser = "Customer";
			Customer current = new Customer();
			System.out.println("What is you userId? ");
			sc.nextLine();
			current.setUserId(sc.nextLine());
			System.out.println("What is you password? ");
			current.setPassword(sc.nextLine());
			if (current.verifyUser() == true) {
				System.out.println("User verified");

				while (true) {

					System.out.println("Do you want to: 1. view the products 2. View Cart 3. Contact Us 4. Exit");
					choice = sc.nextInt();
					if (choice == 1) {
						Catalogue catalogue = new Catalogue();
						Product[] allProducts = catalogue.getListofAllProducts();
						for (int i = 0; i < allProducts.length; i++) {
							System.out.println(allProducts[i].getProductId() + " " + allProducts[i].getProductName()
									+ " " + allProducts[i].getCost());
						}
						System.out.println("Do you want to add any product to the cart? Y/N");
						sc.nextLine();
						String addToCart = sc.nextLine();
						if (addToCart.equals("Y")) {
							System.out
									.println("Write the product id of the product which you want to add to the Cart.");
							String productId = sc.nextLine();
							Product[] cartProducts = new Product[1];
							for (int i = 0; i < allProducts.length; i++) {
								if (allProducts[i].getProductId().equals(productId))

									cartProducts[0] = allProducts[i];

							}

							Cart cart = new Cart();
							cart.setCartId("1");
							cart.setListOfProducts(cartProducts);
							System.out.println(cartProducts[0].getProductName());
							current.setCart(cart);
							System.out.println("The product is successfully added to the cart");
						}
					} else if (choice == 2) {
						Product[] cartProducts = current.getCart().getListOfProducts();
						System.out.println(current.getCart().getCartId());
						for (int i = 0; i < cartProducts.length; i++) {
							System.out.println(i);
							System.out.println(cartProducts[i].getProductId() + " " + cartProducts[i].getProductName()
									+ " " + cartProducts[i].getCost());
						}
						System.out.println("Do you want to Checkout? Y/N");
						sc.nextLine();
						String checkout = sc.nextLine();
						if (checkout.equals("Y")) {
							if (current.getCart().checkOut()) {
								System.out.println("Your Order is placed Successfully");
							}
						}
					}

					else if (choice == 3) {
						System.out.println(
								"To contact us, please email on contactus@ecommerce.com or call on +91 1234567890");
					} else if (choice == 4) {
						System.out.println("Thank You! Visit Again.");
						break;
					}

					else {
						System.out.println("Invalid Choice");
					}

				}
			}
		}

		else if (choice == 2) {
			typeOfUser = "Seller";
			Seller current1 = new Seller();
			System.out.println("What is you userId? ");
			sc.nextLine();
			current1.setUserId(sc.nextLine());
			System.out.println("What is you password? ");
			current1.setPassword(sc.nextLine());
			if (current1.verifyUser() == true) {
				System.out.println("User verified");

				while (true) {

					System.out.println("Do you want to: 1. view the products 2. View Cart 3. Contact Us 4. Exit");
					choice = sc.nextInt();
					if (choice == 1) {
						Catalogue catalogue = new Catalogue();
						Product[] allProducts = catalogue.getListofAllProducts();
						for (int i = 0; i < allProducts.length; i++) {
							System.out.println(allProducts[i].getProductId() + " " + allProducts[i].getProductName()
									+ " " + allProducts[i].getCost());
						}

					} else if (choice == 2) {

						Catalogue catalogue = new Catalogue();
						Product[] allcategory = catalogue.getListofAllProducts();
						for (int i = 0; i < allcategory.length; i++) {
							System.out.print(allcategory[i].getCategoryName() + " ");
						}
						System.out.println();
						System.out.println("In which category you want to add product");

						Product addpro = new Product();
						if (sc.nextInt() == 1) {
							addpro.setProductId(sc.nextLine());
							addpro.setProductName(sc.nextLine());
							addpro.setCost(sc.nextLine());

							String addedProduct = (addpro.getProductId() + " " + addpro.getProductName() + " "
									+ addpro.getCost());

							System.out.println(addedProduct);

						} else if (sc.nextInt() == 2) {
							addpro.setProductId(sc.nextLine());
							addpro.setProductName(sc.nextLine());
							addpro.setCost(sc.nextLine());

							String addedProduct = (addpro.getProductId() + " " + addpro.getProductName() + " "
									+ addpro.getCost());

							System.out.println(addedProduct);
						} else if (sc.nextInt() == 3) {
							addpro.setProductId(sc.nextLine());
							addpro.setProductName(sc.nextLine());
							addpro.setCost(sc.nextLine());

							String addedProduct = (addpro.getProductId() + " " + addpro.getProductName() + " "
									+ addpro.getCost());

							System.out.println(addedProduct);
						}

					}

					else if (choice == 3) {
						System.out.println(
								"To contact us, please email on seller@ecommerce.com or call on +91 1234567890");
					} else if (choice == 4) {
						System.out.println("Thank You! Visit Again.");
						break;
					}

					else {
						System.out.println("Invalid Choice! Try Again.");
					}

				}
			}
		} else if (choice == 3) {
			typeOfUser = "Admin";
			Admin admin = new Admin();
			System.out.println("What is your userId");
			sc.nextLine();
			admin.setUserid(sc.nextLine());
			System.out.println("What is your password?");
			admin.setPassword(sc.nextLine());
			if (admin.verifyUser() == true) {
				System.out.println("User Verified");
			} 
			
			else {
				System.out.println("Invalid Input. Try Again");

			}
		} 
		else {
			System.out.println("Invalid Input. Try Again");
		}

	}

}
