package myservlet;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class BBSPostServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>�Խ��� �۾��� - ���ȭ��</title></head>");
		out.println("<body>");
		out.printf("�̸�: %s <br>",name);
		out.printf("����: %s <br>", title);
		out.println("-------------<br>");
		out.printf("<pre>%s</pre>", content);
		out.println("-------------<br>");
		out.println("����Ǿ����ϴ�.");
		out.println("</body>");
		out.println("</html>");
	}
}
