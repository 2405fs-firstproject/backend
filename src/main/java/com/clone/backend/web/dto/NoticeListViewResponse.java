package com.clone.backend.web.dto;

import com.clone.backend.model.notice.Notice;
import lombok.Getter;


@Getter
public class NoticeListViewResponse {

    private final Integer notice_id;
    private final String notice_title;
    private final String notice_content;

    public NoticeListViewResponse(Notice notice) {
        this.notice_id = notice.getNotice_id();
        this.notice_title = notice.getNotice_title();
        this.notice_content = notice.getNotice_content();
    }
}