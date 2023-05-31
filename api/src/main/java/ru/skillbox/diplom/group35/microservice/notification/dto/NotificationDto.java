package ru.skillbox.diplom.group35.microservice.notification.dto;

import lombok.Data;

import java.time.ZonedDateTime;
import java.util.UUID;

/**
 * NotificationDto
 *
 * @Author Tretyakov Alexandr
 */

@Data
public class NotificationDto {
    private UUID id;
    private UUID authorId;
    private String content;
    private String notificationType;
    private ZonedDateTime sentTime; // $date-time
}
