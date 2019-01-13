package com.rain.service.notice;

import com.rain.domain.Notice;

import java.util.List;

/**
 * Created by zhengda on 2019/1/13.
 */
public interface INoticeService {

    List<Notice> get_NoticeList();

    List<Notice> get_NoticeLikeList(String content);

    Notice get_NoticeInfo(Integer id);

    void update_NoticeInfo(Notice notice);

    void insert_NoticeInfo(Notice notice);

    void delete_NoticeInfo(Integer id);
}
