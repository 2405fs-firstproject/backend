package com.clone.backend.model.notice;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
public class NoticeEntity {

    private Integer notice_id;
    private String notice_title;
    private String notice_content;
    private LocalDateTime create_date;

    public NoticeEntity(Integer notice_id, String notice_title, String notice_content, LocalDateTime create_date) {
        this.notice_id = notice_id;
        this.notice_title = notice_title;
        this.notice_content = notice_content;
        this.create_date = create_date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NoticeEntity that = (NoticeEntity) o;
        return Objects.equals(notice_id, that.notice_id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(notice_id);
    }
}
