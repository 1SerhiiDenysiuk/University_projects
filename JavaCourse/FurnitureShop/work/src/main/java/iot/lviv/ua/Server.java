package iot.lviv.ua;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/server")
public class Server {

    public static FurnitureShop shop = new FurnitureShop();

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public final Instrument getInstrument(@PathParam("id") Integer id) {
        return shop.getInstrumentList().get(id);
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response createInstrument(@PathParam("id") Integer id,
                                        Instrument instrument) {
        shop.getInstrumentList().add(instrument.getId(),instrument);
        return Response.status(200).entity("Good").build();
    }

    @DELETE
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response deleteInstrument(@PathParam("id") Integer id) {
        shop.getInstrumentList().remove(id);
        return Response.status(200).entity("Good").build();
    }

    @POST
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response updateInstrument(@PathParam("id") Integer id,
                                        Instrument instrument) {
        shop.getInstrumentList().set(instrument.getId(), instrument);
        return Response.status(200).entity("Good").build();
    }

    @GET
    @Path("/size")
    @Produces(MediaType.APPLICATION_JSON)
    public final Integer getSize() {
        return shop.getInstrumentList().size();
    }

}
