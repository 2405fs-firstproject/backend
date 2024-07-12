package com.clone.backend.service;

import com.clone.backend.model.notice.Notice;
import com.clone.backend.repository.NoticeRepository;
import com.clone.backend.web.dto.AddNoticeRequest;
import com.clone.backend.web.dto.UpdateNoticeRequest;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BlogService {

    private final NoticeRepository noticeRepository;

    public Notice save(AddNoticeRequest request) {
        return noticeRepository.save(request.toEntity());
    }

    public List<Notice> findAll() {
        return noticeRepository.findAll();
    }

    public Notice findById(Integer notice_id) {
        return noticeRepository.findById(notice_id)
                .orElseThrow(() -> new IllegalArgumentException("not found : " + notice_id));
    }

    public void delete(Integer notice_id) {
        noticeRepository.deleteById(notice_id);
    }

    @Transactional
    public Notice update(Integer notice_id, UpdateNoticeRequest request) {
        Notice notice = noticeRepository.findById(notice_id)
                .orElseThrow(() -> new IllegalArgumentException("not found : " + notice_id));

        notice.update(request.getNotice_title(), request.getNotice_content());

        return notice;
    }
}
