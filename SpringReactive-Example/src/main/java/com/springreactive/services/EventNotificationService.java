package com.springreactive.services;

import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springreactive.entity.EventNotificationEntity;
import com.springreactive.model.EventNotificationModel;
import com.springreactive.repositories.EventNotificationRepository;

import reactor.core.publisher.Mono;

@Service
public class EventNotificationService {
	@Autowired
	private EventNotificationRepository eventNotificationRepository;

	public EventNotificationModel getEventNotificationDtlsById(Integer id) {

		Optional<EventNotificationEntity> optionalEventNotificationEntity = eventNotificationRepository.findById(id);
		EventNotificationEntity eventNotificationEntity = new EventNotificationEntity();
		EventNotificationModel eventNotificationModel = new EventNotificationModel();
		if (optionalEventNotificationEntity.isPresent())
			eventNotificationEntity = optionalEventNotificationEntity.get();
		BeanUtils.copyProperties(eventNotificationEntity, eventNotificationModel);

		return eventNotificationModel;
	}

}
