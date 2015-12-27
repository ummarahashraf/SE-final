package uni.ass;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Controller extends HttpServlet {
    public Controller() {
        super();
    }
    private String user,fname,email,pass,blood,city,contact,action,forward,type,bloodBank;
    private int userID;
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Controller Here");
		RequestDispatcher dis;
		UserDAO uDao = new UserDAO();
		UserModel um = new UserModel();
		
		forward = "";
		action = request.getParameter("action");
		System.out.println("Action = "+action);
		
		//LOGIN
		if(action.equalsIgnoreCase("login")){
			user = request.getParameter("user");
			pass = request.getParameter("pass");
			um.setUser(user);
			um.setPass(pass);
			System.out.println(um.getUser());
			UserModel um2 = new UserModel();
			um2 = uDao.checkUser(um);  //make a call to check user user dao
			System.out.println(um.getUser());
			if(um2.isFlag()){
				System.out.println("Login Servlet:"+um2.getFname());
				System.out.println("Logged In");
				HttpSession session = request.getSession();
				session.setAttribute("userInfo", um2);
				request.setAttribute("userInfo", um2);
				session.setAttribute("user", user);
				forward = "welcome .jsp";
			}
			else{
				System.out.println("Error");
				forward = "error.html";
			}
		}
		
		//REGISTER
		if(action.equalsIgnoreCase("register")){
			user = request.getParameter("user");
			pass = request.getParameter("pass");
			city = request.getParameter("city");
			blood = request.getParameter("blood");
			contact = request.getParameter("contact");
			fname = request.getParameter("fname");
			email = request.getParameter("email");
			um.setUser(user);
			um.setPass(pass);
			um.setBlood(blood);
			um.setCity(city);
			um.setContact(contact);
			um.setEmail(email);
			um.setFname(fname);
			
			
			if(uDao.addUser(um)){
				System.out.println("Registering");
				forward = "login.html";
			}
			else{
				System.out.println("Error");
				forward = "error.html";
			}
		}
		
		//UPDATE PROFILE
				
		
		// EDIT INFO
		
		//GET PRO
		
		
		dis = request.getRequestDispatcher(forward);
		dis.forward(request, response);
		
	}

}
