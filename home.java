package iii;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 

@MultipartConfig
@WebServlet("/home")
public class home extends HttpServlet {
	private static final long serialVersionUID = 1L;

      
    public home() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   String url="jdbc:sqlserver://localhost:1433;databasename=Northwind";
	       String user="banana";
	       String password="manager";
		try (Connection conn = DriverManager.getConnection(url, user, password);
        	  PreparedStatement stmt = conn.prepareStatement("select * from username ")){        	
			    String username = request.getParameter("username");		     
			    String password1 = request.getParameter("password");
                
                 ResultSet rs = stmt.executeQuery();
             
                 HashMap<String, String> map = new HashMap<String, String>();
                 while(rs.next()) {               	      
                	 map.put(rs.getString(1)+rs.getString(2), rs.getString(3));
                 }
                  
                 if(map.containsKey(username+password1)) {               
                	 request.setAttribute("s1", "歡迎回來 "+map.get(username+password1));
               	  request.getRequestDispatcher("/homework.jsp").forward(request, response);              
                   System.out.println("有這筆資料");
                	   
                 }else {
            	  response.setContentType("text/html;charset=utf-8");	
                    request.setAttribute("s1", "查無此帳號! ");
                 	  request.getRequestDispatcher("/homework.jsp").forward(request, response);              
                     System.out.println("沒有這筆資料");
              }
           
             
              
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


}}
