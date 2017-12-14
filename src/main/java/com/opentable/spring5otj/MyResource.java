package com.opentable.spring5otj;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("/my/resource")
public class MyResource {
    public static final Logger LOG = LoggerFactory.getLogger(MyResource.class);

    @GET
    public String getHello() {
        LOG.info("Stop poking me!");
        return "Hello, World!";
    }
}
