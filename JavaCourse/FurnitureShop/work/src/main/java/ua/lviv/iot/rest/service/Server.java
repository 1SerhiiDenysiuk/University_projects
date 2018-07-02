package ua.lviv.iot.rest.service;

import ua.lviv.iot.model.Instrument;
import ua.lviv.iot.persistence.dao.InstrumentDao;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.Serializable;

@Path("/server")
@SessionScoped
public class Server implements Serializable {
    private static final long serialVersionUID = 1L;

    @Inject
    private InstrumentDao dao;
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Instrument getInstrument(@PathParam("id") Integer id) {
        return dao.findById(id);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public  Response createBird(Instrument instrument) {
        dao.persist(instrument);
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    public  Response deleteInstrument(@PathParam("id") Integer id) {
        dao.delete(id);
        return Response.status(200).entity("Good").build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public  Response updateInstrument(Instrument instrument) {
        dao.updateObject(instrument);
        return Response.status(200).entity("Good").build();
    }

    @GET
    @Path("/size")
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,MediaType.TEXT_XML})
    public  String getSize() {
        return "Yes";
    }

}
