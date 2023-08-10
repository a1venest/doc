package com.company.doc.listeners;

import com.company.doc.entity.Subdivisions;
import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.listener.BeforeInsertEntityListener;
import org.springframework.stereotype.Component;

@Component("docs_SubdivisionCodeCreator")
public class SubdivisionsCodeCreator implements BeforeInsertEntityListener<Subdivisions> {
    private static int count;
    @Override
    public void onBeforeInsert(Subdivisions entity, EntityManager entityManager) {

        count++;
        if (count< 10)
            entity.setCode("000" + count);
        else if (count<100)
            entity.setCode("00" + count);
        else if (count<1000)
            entity.setCode("0" + count);
        else if (count<10000)
            entity.setCode (""+count);
    }
}