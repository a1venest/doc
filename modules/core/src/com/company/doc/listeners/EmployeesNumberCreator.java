package com.company.doc.listeners;

import com.company.doc.entity.Employees;

import org.springframework.stereotype.Component;
import com.haulmont.cuba.core.listener.BeforeInsertEntityListener;
import com.haulmont.cuba.core.EntityManager;

@Component("doc_EmployeesNumberCreator")
public class EmployeesNumberCreator implements BeforeInsertEntityListener< Employees> {


    private static int count;
    @Override
    public void onBeforeInsert(Employees entity, EntityManager entityManager) {

        count++;
        if (count< 10)
            entity.setNumber("000" + count);
        else if (count<100)
            entity.setNumber("00" + count);
        else if (count<1000)
            entity.setNumber("0" + count);
        else if (count<10000)
            entity.setNumber("" + count);
    }


}
