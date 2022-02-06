package demo.ftmk.order;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import demo.ftmk.product.Product;

/**
 * Servlet implementation class OrderRedirectServlet
 */
@WebServlet("/OrderRedirectServlet")
public class OrderRedirectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderRedirectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Get orderedProducts from session 
		HttpSession session = request.getSession();
		
		//cast list of OrderProduct
		Order order = new Order();
		List<OrderedProduct> orderedProducts = new ArrayList<OrderedProduct>();
		
		OrderedProduct ordering = new OrderedProduct();
		Product product = new Product();
		
		
		//Validate list - instantiate new list if it is null
		boolean flag = orderedProducts.isEmpty();
		
		// Get data from web form
		String selectedProduct = request.getParameter("product");
		int code = Integer.parseInt(selectedProduct);
		
		String specifiedQuantity = request.getParameter("quantity");
		int quantity = Integer.parseInt(specifiedQuantity);
		
		
		 
		//Wrap data into object of OrderedProduct
		switch (code) 
		{
				case 101:
					product.setName("McChicken Value Meal");
					product.setPrice(13.20);				
					ordering.setOrderedProduct(product);
					ordering.setQuantity(quantity);
					break;
				
				case 102:
					product.setName("Smoky Grilled Beef Meal");
					product.setPrice(17.90);
					ordering.setOrderedProduct(product);
					ordering.setQuantity(quantity);
					break;
			
				case 103:
					product.setName("Ayam Goreng McD Spicy Meal 2pcs");
					product.setPrice(16.95);				
					ordering.setOrderedProduct(product);
					ordering.setQuantity(quantity);
					break;
					
				case 104:
					product.setName("Spicy McChicken Deluxe Meal");
					product.setPrice(16.65);
					ordering.setOrderedProduct(product);
					ordering.setQuantity(quantity);	
					break;
				
				case 105:
					product.setName("Chicken McNuggets 6pcs Meal");
					product.setPrice(13.20);					
					ordering.setOrderedProduct(product);
					ordering.setQuantity(quantity);
					break;
			
			}
			
		OrderDataManager orderDataMgr = new OrderDataManager();
		 
	
		
		//Add object of OrderProduct into list
		orderedProducts.add(ordering);
		
		//Add list to session
		session.setAttribute("listOrder", orderedProducts);
		
		
		//Redirect to the same page
		response.sendRedirect("demo/orderRedirectForm.html");
}
}
