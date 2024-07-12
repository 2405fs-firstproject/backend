package com.clone.backend.model.notice;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@EntityListeners(AuditingEntityListener.class)
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
@Table(name="notice")
public class Notice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "notice_id", updatable = false)
    private Integer notice_id;

    @Column(name = "notice_title", nullable = false)
    private String notice_title;

    @Column(name = "notice_content", nullable = false)
    private String notice_content;

    @CreatedDate
    @Column(name = "create_date", nullable = false)
    private LocalDateTime create_date;


    @Builder
    public Notice(String notice_title, String notice_content, LocalDateTime create_date) {
        this.notice_title = notice_title;
        this.notice_content = notice_content;
        this.create_date = create_date;
    }

    public void update(String title, String content) {
        this.notice_title = title;
        this.notice_content = content;

    }
}