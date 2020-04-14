package com.springreactive.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springreactive.entity.EventNotificationEntity;

@Repository
public interface EventNotificationRepository extends JpaRepository<EventNotificationEntity, Integer> {


}
