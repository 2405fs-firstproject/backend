package com.clone.backend.web.dto;

import com.clone.backend.model.notice.Notice;
import lombok.Getter;


import java.time.LocalDateTime;

@Getter
public class NoticeResponse {

    private final String notice_title;
    private final String notice_content;
    private final LocalDateTime create_date;

    public NoticeResponse(Notice notice) {
        this.notice_title = notice.getNotice_title();
        this.notice_content = notice.getNotice_content();
        this.create_date = notice.getCreate_date();
    }
}
