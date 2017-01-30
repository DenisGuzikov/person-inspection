package io.khasang.inspection.messaging;

import io.khasang.inspection.model.User;
import io.khasang.inspection.service.UserInspectionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
//import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
//import org.springframework.messaging.Message;

import javax.jms.*;
//import javax.jms.*;

@Service
public class MessageReceiver implements MessageListener {
	@Autowired
	Messages messages;

	static final Logger LOG = LoggerFactory.getLogger(MessageReceiver.class);

//	@Autowired
//	UserInspectionService userInspectionService;

	@Override
		public void onMessage(Message message) {
			TextMessage textMessage = (TextMessage) message;
//			ObjectMessage objectMessage = (ObjectMessage) message;
			try {
//				System.out.println(textMessage.getText());
//				messages.userList.add((User) objectMessage.getObject());

				messages.messageList.add(textMessage.getText());

			} catch (JMSException e) {
				e.printStackTrace();
			}
		}
	
}
