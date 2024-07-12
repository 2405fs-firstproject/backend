package com.clone.backend.web.controller;

import com.clone.backend.model.notice.Notice;
import com.clone.backend.service.BlogService;
import com.clone.backend.web.dto.AddNoticeRequest;
import com.clone.backend.web.dto.UpdateNoticeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notices")
public class NoticeController {

    @Autowired
    private BlogService blogService;

    @PostMapping
    public ResponseEntity<Notice> addNotice(@RequestBody AddNoticeRequest request) {
        Notice savedNotice = blogService.save(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedNotice);
    }

    @GetMapping
    public ResponseEntity<List<Notice>> getAllNotices() {
        List<Notice> notices = blogService.findAll();
        return ResponseEntity.ok(notices);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Notice> getNoticeById(@PathVariable Integer id) {
        Notice notice = blogService.findById(id);
        return ResponseEntity.ok(notice);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Notice> updateNotice(@PathVariable Integer id, @RequestBody UpdateNoticeRequest request) {
        Notice updatedNotice = blogService.update(id, request);
        return ResponseEntity.ok(updatedNotice);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteNotice(@PathVariable Integer id) {
        blogService.delete(id);
        return ResponseEntity.ok().build();
    }
}
