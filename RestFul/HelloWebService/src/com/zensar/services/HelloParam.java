package com.zensar.services;


import java.time.LocalDate;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/zenparam")
public class HelloParam {
      
	@Path("/welcome/{nm}")
	@GET
	@Produces("text/html")
    public Response getMessage(@PathParam("nm") String name){
		
	
		return Response.status(200).entity("<p>Hello<b><i> " + name + " </i></b> Welcome to Zensar Hello Service</p>").build();
	}
	
	@Path("/birthday/{dd}/{mm}/{yy}")
	@GET
	@Produces("text/html")
	public Response getMessage(@PathParam("dd")int date, @PathParam("mm")int month, @PathParam("yy")int year){
		
		return Response.status(200).entity("<p>Today " + date + "/" + month + "/" + year+ " " + "Its ur birthsday!!!!</p>").build();
		
	}
	
	@Path("/birthdate/{dd}/{mm}/{yy}")
	@GET
	@Produces("text/html")
	public Response getDate(@PathParam("dd")int date, @PathParam("mm")int month, @PathParam("yy")int year){
		LocalDate datee = LocalDate.of(year, month, date);
		return Response.status(200).entity( "Its ur birthsday!!!!</p>" +datee.toString()).build();
		
	}
}
