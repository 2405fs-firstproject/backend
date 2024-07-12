package com.clone.backend.web.dto;

import com.clone.backend.model.notice.Notice;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddNoticeRequest {
    private String notice_title;

    private String notice_content;

    public Notice toEntity() {
        return Notice.builder()
                .notice_title(notice_title)
                .notice_content(notice_content)
                .create_date(LocalDateTime.now())
                .build();
    }
}
