package com.adobe.prj.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.adobe.prj.dao.DaoException;
import com.adobe.prj.dao.ProductDao;
import com.adobe.prj.dao.impl.ProductDaoJdbcImpl;
import com.adobe.prj.entity.Product;

@WebServlet("/products")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); // MIME
		PrintWriter out = response.getWriter(); // open character stream to browser
		out.print("<html><body>");
		out.print("<table border=\"1\">");
		out.print("<tr>");
		out.print("<th>Name</th><th>Price</th>");
		out.print("</tr>");
		ProductDao productDao = new ProductDaoJdbcImpl();
		try {
			List<Product> products = productDao.getProducts();
			for(Product p : products) {
				out.print("<tr>");
				out.println("<td>" + p.getName()  +"</td>");
				out.println("<td>" + p.getPrice()  +"</td>");
				out.print("</tr>");
			}
		} catch (DaoException e) {
			e.printStackTrace();
		}
		out.print("</table>");
		out.print("<a href=\"index.html\">Back</a>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		double price = Double.parseDouble(request.getParameter("price"));
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		
		ProductDao productDao = new ProductDaoJdbcImpl();
		try {
			 Product p = new Product(0, name, price, quantity);
			 productDao.addProduct(p);
			 response.sendRedirect("index.jsp?msg=Product added successfully");
		} catch (DaoException e) {
			e.printStackTrace();
			 response.sendRedirect("index.jsp?msg=" + e.getMessage());
		}
	}

}
