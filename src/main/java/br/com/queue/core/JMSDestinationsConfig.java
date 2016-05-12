package br.com.queue.core;

import javax.jms.JMSDestinationDefinition;

/**
 * Created by gabriel on 12/05/16.
 */
@JMSDestinationDefinition(name = "java:/jms/queue/ticketsQueue", interfaceName = "javax.jms.Queue")
public class JMSDestinationsConfig {
}
