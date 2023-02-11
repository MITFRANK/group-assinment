package com.library.libralian.service;

import com.library.libralian.model.Notification;
import com.library.libralian.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService {
    @Autowired
    private NotificationRepository notificationRepository;

    public List<Notification> getNotifications(Long userId) {
        return notificationRepository.findByUserId(userId);
    }
}
