package org.rohini.webservices;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.GET;
import javax.ws.rs.POST;


@Path("ConversionServices")
public class Conversion {
	
	@GET
	@Path("/InchToFeet/{i}")
	@Produces(MediaType.TEXT_XML)
	public String converInchtTofeet(@PathParam("i") int i)
	
	{
		
		System.out.println("we have converted "+i+"to feet");
		return "100";
		
	}
	
	@POST
	@Path("/FeetToInch/{i}")
	@Produces(MediaType.TEXT_XML)
	public String converFeetToInch(@PathParam("i") int i)
	
	{
		
		System.out.println("we have converted "+i+"to inch");
		return "300";
		
	}
	
	
	
	

}
