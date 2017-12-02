package com.siwind.bupt.impl;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_XML)
public interface ThresholdService {
    
    @GET
    @Path("/")
    public Threshold getThreshold();
    
    @PUT
    @Path("/")
    public void updateThreshold(Threshold threshold);
 
}
