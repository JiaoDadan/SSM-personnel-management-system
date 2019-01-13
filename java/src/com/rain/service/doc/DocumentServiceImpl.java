package com.rain.service.doc;

import com.rain.dao.DocumentDao;
import com.rain.domain.Document;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by zhengda on 2019/1/13.
 */
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Service("documentService")
public class DocumentServiceImpl implements IDocumentService {

    DocumentDao documentDao;

    /**
     * 文档管理
     */
    @Override
    public List<Document> get_DocumentList() {
        // TODO Auto-generated method stub
        return documentDao.get_List();
    }

    @Override
    public List<Document> get_DocumentLikeList(String content) {
        // TODO Auto-generated method stub
        return documentDao.get_LikeList(content);
    }

    @Override
    public Document get_DocumentInfo(Integer id) {
        // TODO Auto-generated method stub
        return documentDao.get_Info(id);
    }

    @Override
    public void update_DocumentInfo(Document notice) {
        // TODO Auto-generated method stub
        documentDao.update_Info(notice);
    }

    @Override
    public void insert_DocumentInfo(Document notice) {
        // TODO Auto-generated method stub
//		Date date = new Date();
//		String year = String.format("%tY", date);
//		String month = String.format("%tB", date);
//		String day = String.format("%te", date);
//		notice.setCreate_date(year+month+day);
        documentDao.insert_Info(notice);
    }

    @Override
    public void delete_DocumentInfo(Integer id) {
        // TODO Auto-generated method stub
        documentDao.delete_Info(id);
    }
}
