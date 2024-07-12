//package com.clone.backend.web.controller;
//
//import com.clone.backend.model.notice.Notice;
//import com.clone.backend.service.BlogService;
//import com.clone.backend.web.dto.AddNoticeRequest;
//import com.clone.backend.web.dto.NoticeResponse;
//import com.clone.backend.web.dto.UpdateNoticeRequest;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RequiredArgsConstructor
//@RestController
//public class BlogApiController {
//
//    private final BlogService blogService;
//
//    @PostMapping("/api/notices")
//    public ResponseEntity<Notice> addArticle(@RequestBody AddNoticeRequest request) {
//        Notice savedNotice = blogService.save(request);
//
//        return ResponseEntity.status(HttpStatus.CREATED)
//                .body(savedNotice);
//    }
//
//    @GetMapping("/api/notices")
//    public ResponseEntity<List<NoticeResponse>> findAllArticles() {
//        List<NoticeResponse> articles = blogService.findAll()
//                .stream()
//                .map(NoticeResponse::new)
//                .toList();
//
//        return ResponseEntity.ok()
//                .body(articles);
//    }
//    @GetMapping("/api/notices/{id}")
//    public ResponseEntity<NoticeResponse> findArticle(@PathVariable Integer notice_id) {
//        Notice notice = blogService.findById(notice_id);
//
//        return ResponseEntity.ok()
//                .body(new NoticeResponse(notice));
//    }
//
//    @DeleteMapping("/api/notices/{id}")
//    public ResponseEntity<Void> deleteArticle(@PathVariable Integer notice_id) {
//        blogService.delete(notice_id);
//
//        return ResponseEntity.ok()
//                .build();
//    }
//
//    @PutMapping("/api/notices/{id}")
//    public ResponseEntity<Notice> updateArticle(@PathVariable Integer notice_id,
//                                                @RequestBody UpdateNoticeRequest request) {
//        Notice updatedNotice = blogService.update(notice_id, request);
//
//        return ResponseEntity.ok()
//                .body(updatedNotice);
//    }
//
//}
//
