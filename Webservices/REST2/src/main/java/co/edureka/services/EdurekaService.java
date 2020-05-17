package co.edureka.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/edureka")
public class EdurekaService {
	@GET
	@Produces("text/html")
	public String localService() {
		return "<h2>Local Customer Service @ edureka</h2>";
	}

	@GET
	@Produces("text/html")
	@Path("/nri")
	public String NRIService() {
		return "<h2>NRI Customer Service @ edureka</h2>";
	}

	@GET
	@Produces("text/html")
	@Path("{name}/{course_name}")
	public String enquiry(@PathParam("name") String name, @PathParam("course_name") String course) {
		return "<h2>Customer Name: " + name + "<br><br>Course Name: " + course + "</h2>";
	}

	@GET
	@Produces("text/html")
	@Path("{eno}")
	public String empDetails(@PathParam("eno") String eno) {
		String result = "";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edureka", "root", "");
			PreparedStatement pst = con.prepareStatement("select ename,sal from emp where empno=" + eno);

			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				result += "<table width=40% border=1><tr><th>EMP NO</th><th>NAME</th><th>SALARY</th></tr>";
				result += "<tr><td>" + eno + "</td><td>" + rs.getString(1) + "</td><td>" + rs.getString(2)
						+ "</td></tr></table";
			} else {
				result = "<h2>No Matching Employee found!!";
			}
		} catch (Exception ex) {
			System.out.println(ex);
			result = "<h2>" + ex.getMessage() + "</h2>";
		}
		return result;
	}
	
	
	@GET
	@Produces("text/html")
	@Path("/enquiry")
	public String enquiry(@QueryParam("course") String course) {
		return "<h2>Details of Course : "+course+"</h2>";				
	}
	
	@POST
	@Produces("text/html")
	@Path("/ac_create")
	public String createAccount(@FormParam("acno") String acno, @FormParam("name") String name, @FormParam("bal") String balance) {
       String response = "<h2>A/C No: "+acno+"<br><br>Name: "+name+"<br><br>Balance: "+balance+"</h2>";
       return response;
	}
}
