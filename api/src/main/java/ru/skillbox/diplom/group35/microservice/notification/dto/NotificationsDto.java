package ru.skillbox.diplom.group35.microservice.notification.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

/**
 * NotificationsDto
 *
 * @Author Tretyakov Alexandr
 */


@Getter
@Setter
public class NotificationsDto {

    public NotificationsDto() {
        timeStamp = ZonedDateTime.now();
    }

    public NotificationsDto(NotificationDto data) {
        this();
        this.data = data;
    }

    private ZonedDateTime timeStamp; // $date-time
    private NotificationDto data;

}
