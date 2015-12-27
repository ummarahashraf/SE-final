package uni.ass;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SearchController extends HttpServlet {
	
	    public SearchController() {
	        super();
	    }
	    private String blood,city,action,forward,search;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("SearchController Here");
		RequestDispatcher dis;
		UserDAO uDao = new UserDAO();
		UserModel um = new UserModel();
		
		
		action = request.getParameter("action");
		
		
		forward = "";
		action = request.getParameter("type");
		System.out.println("Action = "+action);
		//contact donor
		//2 here the contacct button hits and contact and email is get set and forword to contactdonor.jsp//
		if (action.equalsIgnoreCase("contact")) {
			System.out.println("inside contact");
			String email = request.getParameter("email");
			String num = request.getParameter("num");
			request.setAttribute("email", email);
			request.setAttribute("num", num);
			forward = "contactdonor.jsp";
                        //insert contact info.
                        SearcherModel sm = new SearcherModel();
                        sm.setContactDate(new Date(System.currentTimeMillis()));
                        try {
                            sm.setIpAddress(InetAddress.getLocalHost().getHostAddress());
                        } catch(UnknownHostException uhe) {
                            System.err.println("ip address not found.");
                        }
                        uDao.addSearcherInfo(sm);
		}
		
		if(action.equalsIgnoreCase("city")){
			search = request.getParameter("search");
			request.setAttribute("searchResult", uDao.searchByCity(search));
			forward = "SearchResult.jsp";
		}
		
		if(action.equalsIgnoreCase("blood")){
			search = request.getParameter("search");
			request.setAttribute("searchResult", uDao.searchByBlood(search));
			forward = "SearchResult.jsp";
		}
		
		dis = request.getRequestDispatcher(forward);
		dis.forward(request, response);
		
		
	}

}
