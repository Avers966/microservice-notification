package ru.skillbox.diplom.group35.microservice.notification.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

/**
 * NotificationCountDto
 *
 * @Author Tretyakov Alexandr
 */

@Getter
@Setter
public class NotificationCountDto {

    public NotificationCountDto() {
        timeStamp = ZonedDateTime.now();
    }

    public NotificationCountDto (Count data) {
        this();
        this.data = data;
    }
    private ZonedDateTime timeStamp; //$int64
    private Count data;
}
