package com.clone.backend.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class UpdateNoticeRequest {
    private String notice_title;
    private String notice_content;
    private LocalDateTime create_date;
}
