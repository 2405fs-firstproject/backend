package com.clone.backend.web.dto;

import com.clone.backend.model.notice.Notice;
import lombok.Getter;
import lombok.NoArgsConstructor;


import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class NoticeViewResponse {

  private Integer notice_id;
  private String notice_title;
  private String notice_content;
  private LocalDateTime create_date;

  public NoticeViewResponse(Notice notice) {
    this.notice_id = notice.getNotice_id();
    this.notice_title = notice.getNotice_title();
    this.notice_content = notice.getNotice_content();
    this.create_date = notice.getCreate_date();
  }
}
