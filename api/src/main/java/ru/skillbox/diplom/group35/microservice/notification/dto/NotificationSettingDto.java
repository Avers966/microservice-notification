package ru.skillbox.diplom.group35.microservice.notification.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import java.util.UUID;

/**
 * NotificationSettingDto
 *
 * @Author Tretyakov Alexandr
 */

@Getter
@Setter
@NoArgsConstructor
public class NotificationSettingDto {
    private UUID id;
    private boolean enablePost;
    private boolean enablePostComment;
    private boolean enableCommentComment;
    private boolean enableMessage;
    private boolean enableFriendRequest;
    private boolean enableFriendBirthday;
    private boolean enableSendEmailMessage;
}
