package ru.skillbox.diplom.group35.microservice.notification.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * NotificationUpdateDto
 *
 * @Author Tretyakov Alexandr
 */


@Getter
@Setter
public class NotificationUpdateDto {
    private boolean enable;
    private String notificationType;
}
