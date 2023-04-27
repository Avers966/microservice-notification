package ru.skillbox.diplom.group35.microservice.notification.resource;

/**
 * NotificationController
 *
 * @Author Tretyakov Alexandr
 */

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.skillbox.diplom.group35.library.core.dto.streaming.EventNotificationDto;
import ru.skillbox.diplom.group35.microservice.notification.dto.*;


import java.util.UUID;

@RequestMapping("/api/v1/notifications")
public interface NotificationController {

    @GetMapping("/settings")
    ResponseEntity<NotificationSettingDto> getSetting();

    @PutMapping("/settings")
    void updateSetting(@RequestBody NotificationUpdateDto dto);

    @PostMapping("/settings{id}")
    ResponseEntity<Boolean> createSetting(@PathVariable(name = "id") UUID id);

    @PostMapping("/add")
    void addEvent(@RequestBody EventNotificationDto event);

    @GetMapping
    ResponseEntity<Page<NotificationsDto>> getNotifications(Pageable page);

    @PutMapping("/readed")
    void setIsRead();

    @GetMapping("/count")
    ResponseEntity<NotificationCountDto> getCount();




}
