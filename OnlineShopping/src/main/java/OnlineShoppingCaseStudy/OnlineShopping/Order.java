package OnlineShoppingCaseStudy.OnlineShopping;

import java.util.*;

public class Order {
	List<Cart> cartList;
	
	public Order() {
		super();
			}
	
	public List<Cart> getCartList() {
		return cartList;
	}

	public void setCartList(List<Cart> cartList) {
		this.cartList = cartList;
	}
}
