/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachim.raphael.src.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author raphael.fachim
 */
@Path("/rest")
public class Resource {
    
    // http://localhost:8080/JavaWeb/api/rest/hello
    @GET
    @Path("/hello")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(){
        try{
            return Response.ok("Hello World").build();
        } catch(Exception ex){
            return null;
        }
    }
}
