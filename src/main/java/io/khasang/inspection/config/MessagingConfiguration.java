package io.khasang.inspection.config;

import io.khasang.inspection.messaging.MessageReceiver;
import org.apache.activemq.spring.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.listener.DefaultMessageListenerContainer;

import java.util.Arrays;

@Configuration
public class MessagingConfiguration {

	private static final String DEFAULT_BROKER_URL = "tcp://localhost:61616";
	
	private static final String USER_RESPONSE_QUEUE = "user-response-queue";

	private static final String USER_INSPECTION_QUEUE = "inspection-queue";

	@Bean
	public ActiveMQConnectionFactory connectionFactory(){
		ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
		connectionFactory.setBrokerURL(DEFAULT_BROKER_URL);
		connectionFactory.setTrustedPackages(Arrays.asList("io.khasang.inspection"));
		return connectionFactory;
	}
	
	@Bean
	public JmsTemplate jmsTemplate(){
		JmsTemplate template = new JmsTemplate();
		template.setConnectionFactory(connectionFactory());
		template.setDefaultDestinationName(USER_RESPONSE_QUEUE);
		return template;
	}

	@Bean
	@Autowired
	public DefaultMessageListenerContainer listenerContainer(MessageReceiver messageListener){
		DefaultMessageListenerContainer container = new DefaultMessageListenerContainer();
		container.setConnectionFactory(connectionFactory());
		container.setDestinationName(USER_INSPECTION_QUEUE);
		container.setMessageListener(messageListener);
		return container;
	}
}