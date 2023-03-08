
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import ListOfProduct.Display;
import ListOfProduct.ListOfProduct;

@WebServlet("/Servlt")
public class Servlt extends HttpServlet {
	private static final long serialVersionUID = 1L;
	List<ListOfProduct> names = new ArrayList<>();

	public Servlt() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("application/json");
		response.getWriter().println(names.toString());
	}

	int id = 1;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("nameOfProduct");
		double price = Integer.parseInt(request.getParameter("price"));
		ListOfProduct li = new ListOfProduct(id++, name, price);
		names.add(li);

	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		String nameOfProduct = request.getParameter("nameOfProduct");
		double price = Integer.parseInt(request.getParameter("price"));

		for (ListOfProduct product : names) {
			if (product.getId() == id) {
				product.setNameOfProduct(nameOfProduct);
				product.setprice(price);
			}
		}
	}

	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		for (ListOfProduct product : names) {
			if (product.getId() == id) {
				names.remove(product);
				break;
			}
		}

	}

}
