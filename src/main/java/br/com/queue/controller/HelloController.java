package br.com.queue.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author Gabriel Amaral 20/05/2016
 *
 */
@Path("/")
public class HelloController {
 
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String ping(){
        return "Hello World!";
    }
}
