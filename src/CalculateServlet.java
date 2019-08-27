import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculateServlet", urlPatterns = "/display")
public class CalculateServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String ProductDescription = request.getParameter("ProductDescription");
        float ListPrice = Float.parseFloat(request.getParameter("ListPrice"));
        float DiscountPercent = Float.parseFloat(request.getParameter("DiscountPercent"));

        float DiscountAmount = (float) (ListPrice * DiscountPercent * 0.01);
        float DiscountPrice = ListPrice - DiscountAmount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Product Description : " + ProductDescription + "</h1>");
        writer.println("<h1>List Price : "+ListPrice+"</h1>");
        writer.println("<h1>Discount Percent : "+DiscountPercent+" %"+"</h1>");
        writer.println("<h1>Discount Amount : " + DiscountAmount + "</h1>");
        writer.println("<h1>Discount Price : " + DiscountPrice + "</h1>");
        writer.println("</html>");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
