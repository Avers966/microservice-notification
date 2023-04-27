package ru.skillbox.diplom.group35.microservice.notification.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Count
 *
 * @Author Tretyakov Alexandr
 */

@Getter
@Setter
public class Count {
    public Count(Long count) {
        this.count = count;
    }
    private Long count; // $int64
}
