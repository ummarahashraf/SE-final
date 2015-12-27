package uni.ass;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


public class UserDAO {
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	
	public UserDAO(){
		con = DbUtil.getConnection();
	}
	
	//CHECK USER / LOGIN
	public UserModel checkUser(UserModel um){
		boolean flag = false;
		UserModel um2 = new UserModel();
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(" select * from user where user= '"+um.getUser()+"' and pass= '"+um.getPass()+"' ");
			if(rs.next()){
				flag = true;
				um2.setUser(rs.getString("user"));
				System.out.println("DAO : "+rs.getString("user"));
				
				um2.setFlag(true);
			}
			else{
            	System.out.println("Failed");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return um2;
	}
	
	//ADD USER  / REGISTER
	public boolean addUser(UserModel um){
		boolean flag = false;
		String user,pass,email,fname,contact,blood,city;
		user = um.getUser();
		pass = um.getPass();
		email = um.getEmail();
		fname = um.getFname();
		contact = um.getContact();
		blood = um.getBlood();
		city = um.getCity();
		String query = "INSERT INTO `user`.`user` (`user`, `pass`, `email`, `fname`, `blood`, `city`, `contact`) VALUES ('"+user+"', '"+pass+"', '"+email+"', '"+fname+"', '"+blood+"', '"+city+"', '"+contact+"')";
		try {
			stmt = con.createStatement();
			stmt.executeUpdate(query);
			System.out.println("User Registered in DB");
			flag = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	//ADD INFO
        
        public void addSearcherInfo(SearcherModel sm) {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String query = "INSERT INTO `user`.`searcher` (`contactDate`, `ipaddress`) "
                    + "VALUES ('" + formatter.format(sm.getContactDate()) + "', '" 
                    + sm.getIpAddress() + "')";
            System.out.println("query for searcher info: " + query);
            try {
                stmt = con.createStatement();
                stmt.executeUpdate(query);
                System.out.println("Record inserted in DB");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

	
	//EDIT USER
	
	//get pro
	
	//SEARCH BY CITY
	public List<UserModel> searchByCity(String cit) {
        List<UserModel> searchResult = new ArrayList<UserModel>();
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from user where city = '"+cit+"'");
            while (rs.next()) {
                UserModel user = new UserModel();
                user.setUserID(rs.getInt("userId"));
                user.setUser(rs.getString("user"));
                user.setFname(rs.getString("fname"));
                user.setBlood(rs.getString("blood"));
                user.setCity(rs.getString("city"));
                user.setContact(rs.getString("contact"));
                user.setEmail(rs.getString("email"));
                searchResult.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return searchResult;
    }
		
		//SEARCH BY BLOOD
		public List<UserModel> searchByBlood(String blod) {
	        List<UserModel> searchResult = new ArrayList<UserModel>();
	        try {
	            stmt = con.createStatement();
	            ResultSet rs = stmt.executeQuery("select * from user where blood = '"+blod+"'");
	            while (rs.next()) {
	                UserModel user = new UserModel();
	                user.setUserID(rs.getInt("userId"));
	                user.setUser(rs.getString("user"));
	                user.setFname(rs.getString("fname"));
	                user.setBlood(rs.getString("blood"));
	                user.setCity(rs.getString("city"));
	               user.setContact(rs.getString("contact"));
	                user.setEmail(rs.getString("email"));
	                searchResult.add(user);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return searchResult;
	    }
		//contact donor
		public List<UserModel> getContact(String blod) {
	        List<UserModel> getcontact = new ArrayList<UserModel>();
	        try {
	            stmt = con.createStatement();
	            ResultSet rs = stmt.executeQuery("select * from user where blood = '"+blod+"'");
	            while (rs.next()) {
	                UserModel user = new UserModel();
	                
	                user.setEmail(rs.getString("email"));
	               user.setContact(rs.getString("contact"));
	               
	                getcontact.add(user);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return getcontact;
	    }
	
}
