package com.clone.backend.web.controller;

import com.clone.backend.model.notice.Notice;
import com.clone.backend.service.BlogService;
import com.clone.backend.web.dto.NoticeListViewResponse;
import com.clone.backend.web.dto.NoticeViewResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class BlogViewController {

    private final BlogService blogService;

    @GetMapping("/notices")
    public String getArticles(Model model) {
        List<NoticeListViewResponse> notices = blogService.findAll()
                .stream()
                .map(NoticeListViewResponse::new)
                .toList();
        model.addAttribute("notices", notices);

        return "noticeList";
    }

    @GetMapping("/notice/{id}")
    public String getNotice(@PathVariable Integer notice_id, Model model) {
        Notice notice = blogService.findById(notice_id);
        model.addAttribute("notice", new NoticeViewResponse(notice));

        return "notice";
    }

    @GetMapping("/new-notice") //새로쓰기
    public String newNotice(@RequestParam(required = false) Integer notice_id, Model model) {
        if (notice_id == null) {
            model.addAttribute("notice", new NoticeViewResponse());
        } else {
            Notice notice = blogService.findById(notice_id);
            model.addAttribute("notice", new NoticeViewResponse(notice));
        }
        return "newNotice";
    }
}
