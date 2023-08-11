package com.company.doc.core;

import org.springframework.stereotype.Component;
import com.company.doc.entity.OutgoingDocuments;
import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.Transaction;

import javax.inject.Inject;
import java.util.Date;
import java.util.UUID;

@Component(ApprovalHelper.NAME)
public class ApprovalHelper {
    public static final String NAME = "doc_ApprovalHelper";

    @Inject
    private Persistence persistence;

    public void updateState(UUID entityId, String state) {
        try (Transaction tx = persistence.getTransaction()) {
            OutgoingDocuments outgoingDocuments = persistence.getEntityManager().find(OutgoingDocuments.class, entityId);
            if (outgoingDocuments != null) {
                outgoingDocuments.setState(state);
            }
            tx.commit();
        }
    }
    public void updateAuthor(UUID entityId, String author) {
        try (Transaction tx = persistence.getTransaction()) {
            OutgoingDocuments outgoingDocuments = persistence.getEntityManager().find(OutgoingDocuments.class, entityId);
            if (outgoingDocuments != null) {
                outgoingDocuments.setAuthor(author);
            }
            tx.commit();
        }
    }
    public void updateExecutor(UUID entityId,String author)
    {
        try (Transaction tx = persistence.getTransaction()) {
            OutgoingDocuments outgoingDocuments = persistence.getEntityManager().find(OutgoingDocuments.class, entityId);
            if (outgoingDocuments != null) {
                outgoingDocuments.setExecutor(author);
            }
            tx.commit();
        }
    }
    public void updateRegData(UUID entityId, Date regData)
    {
        try (Transaction tx = persistence.getTransaction()) {
            OutgoingDocuments outgoingDocuments = persistence.getEntityManager().find(OutgoingDocuments.class, entityId);
            if (outgoingDocuments != null) {
                outgoingDocuments.setRegData(regData);
            }
            tx.commit();
        }
    }
    public void updateDateOfCreation(UUID entityId, Date dateOfCreation)
    {
        try (Transaction tx = persistence.getTransaction()) {
            OutgoingDocuments outgoingDocuments = persistence.getEntityManager().find(OutgoingDocuments.class, entityId);
            if (outgoingDocuments != null) {
                outgoingDocuments.setDateOfCreation(dateOfCreation);
            }
            tx.commit();
        }
    }
    public void updateDateOfChange(UUID entityId, Date dateOfChange)
    {
        try (Transaction tx = persistence.getTransaction()) {
            OutgoingDocuments outgoingDocuments = persistence.getEntityManager().find(OutgoingDocuments.class, entityId);
            if (outgoingDocuments != null) {
                outgoingDocuments.setDateOfChange(dateOfChange);
            }
            tx.commit();
        }
    }
}
