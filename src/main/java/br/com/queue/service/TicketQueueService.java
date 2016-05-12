package br.com.queue.service;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.jms.JMSProducer;

import br.com.queue.domain.Ticket;

/**
 * Created by gabriel on 12/05/16.
 */
public class TicketQueueService {

    @Inject
    private JMSContext jmsContext;

    @Resource(lookup = "java:/jms/queue/ticketsQueue")
    private Destination ticketQueue;

    public void toTicketQueue(Ticket ticket) {
        JMSProducer producer = jmsContext.createProducer();
        String jsonTicket = ticket.toJson();
        producer.send(ticketQueue, jsonTicket);
    }
}
