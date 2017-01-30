package io.khasang.inspection.service;

import io.khasang.inspection.messaging.MessageSender;
import io.khasang.inspection.model.InspectionResponse;
import io.khasang.inspection.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("orderInventoryService")
public class UserInspectionServiceImpl implements UserInspectionService {
	static final Logger LOG = LoggerFactory.getLogger(UserInspectionServiceImpl.class);
	
	@Autowired
	MessageSender messageSender;
	
	@Override
	public void processUserInspection(User user) {
		
		//Perform any business logic.
		
		InspectionResponse response = prepareResponse(user);
		LOG.info("Inventory : sending order confirmation {}", response);
		messageSender.sendMessage(response);
	}
	
	private InspectionResponse prepareResponse(User user){
		InspectionResponse response = new InspectionResponse();
//		response.setOrderId(order.getOrderId());
		response.setUserId(user.getId());
		response.setReturnCode(200);
		response.setComment("Inspection Processed successfully");
		return response;
	}

	
	
}
