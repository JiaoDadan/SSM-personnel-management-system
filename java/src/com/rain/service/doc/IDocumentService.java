package com.rain.service.doc;

import com.rain.domain.Document;

import java.util.List;

/**
 * Created by zhengda on 2019/1/13.
 */
public interface IDocumentService {

    List<Document> get_DocumentList();

    List<Document> get_DocumentLikeList(String content);

    Document get_DocumentInfo(Integer id);

    void update_DocumentInfo(Document notice);

    void insert_DocumentInfo(Document notice);

    void delete_DocumentInfo(Integer id);
}
