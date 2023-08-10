package com.company.doc.listeners;

import com.company.doc.entity.DocumentType;

import org.springframework.stereotype.Component;
import com.haulmont.cuba.core.listener.BeforeInsertEntityListener;
import com.haulmont.cuba.core.EntityManager;

@Component("doc_DocumentTypeCodeCreator")
public class DocumentTypeCodeCreator implements BeforeInsertEntityListener<DocumentType> {


    private static int count;
    @Override
    public void onBeforeInsert(DocumentType entity, EntityManager entityManager) {

        count++;
        if (count< 10)
            entity.setCode("ВД00000" + count);
        else if (count<100)
            entity.setCode("ВД0000" + count);
        else if (count<1000)
            entity.setCode("ВД000" + count);
        else if (count<10000)
            entity.setCode("ВД00" + count);
        else if (count<100000)
            entity.setCode("ВД0" + count);
        else if (count<1000000)
            entity.setCode("ВД" + count);
    }


}
