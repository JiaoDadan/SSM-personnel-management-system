package com.rain.service.notice;

import com.rain.dao.NoticeDao;
import com.rain.domain.Notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by zhengda on 2019/1/13.
 */
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Service("noticeService")
public class NoticeServiceImpl implements INoticeService {

    @Autowired
    private NoticeDao noticeDao;

    /**
     * 公告管理
     */
    @Override
    public List<Notice> get_NoticeList() {
        // TODO Auto-generated method stub
        return noticeDao.get_List();
    }

    @Override
    public List<Notice> get_NoticeLikeList(String content) {
        // TODO Auto-generated method stub
        return noticeDao.get_LikeList(content);
    }

    @Override
    public Notice get_NoticeInfo(Integer id) {
        // TODO Auto-generated method stub
        return noticeDao.get_Info(id);
    }

    @Override
    public void update_NoticeInfo(Notice notice) {
        // TODO Auto-generated method stub
        noticeDao.update_Info(notice);
    }

    @Override
    public void insert_NoticeInfo(Notice notice) {
        // TODO Auto-generated method stub
//		Date date = new Date();
//		String year = String.format("%tY", date);
//		String month = String.format("%tB", date);
//		String day = String.format("%te", date);
//		notice.setCreate_date(year+month+day);
        noticeDao.insert_Info(notice);
    }

    @Override
    public void delete_NoticeInfo(Integer id) {
        // TODO Auto-generated method stub
        noticeDao.delete_Info(id);
    }
}
