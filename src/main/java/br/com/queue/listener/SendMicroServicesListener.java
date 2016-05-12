package br.com.queue.listener;

import java.lang.reflect.Type;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import com.google.gson.Gson;

import br.com.queue.domain.Ticket;

/**
 * Created by gabriel on 12/05/16.
 */
@MessageDriven(activationConfig = {
                @ActivationConfigProperty(
                        propertyName = "destinationLookup",
                        propertyValue = "java:/jms/queue/ticketsQueue"
                )
        })
public class SendMicroServicesListener implements MessageListener {

    private static Gson gson = new Gson();

    @Override
    public void onMessage(Message message) {

        try {
            TextMessage textMessage = (TextMessage) message;
            Ticket ticket = gson.fromJson(textMessage.getText(), (Type) Ticket.class);
            sendToMicroServices(ticket);

        } catch (JMSException e) {
            e.printStackTrace();
        }
    }

    private void sendToMicroServices(Ticket ticket) {
        System.out.println(ticket.toJson());
        //TODO: SEND TICKET TO PROCESS IN MICRO SERVICES
    }
}
