package br.com.queue.controller;

import br.com.queue.domain.Ticket;
import br.com.queue.service.TicketQueueService;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * Created by gabriel on 12/05/16.
 */
@Path("/queue")
public class QueueController {

    @Inject
    private TicketQueueService ticketQueueService;

    @POST
    @Path("/ticket")
    public Response postTicket(Ticket ticket) {
        ticketQueueService.toTicketQueue(ticket);
        return Response.accepted().build();
    }
}
