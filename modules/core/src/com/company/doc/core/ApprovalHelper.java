package com.company.doc.core;

import org.springframework.stereotype.Component;
import com.company.doc.entity.OutgoingDocuments;
import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.Transaction;

import javax.inject.Inject;
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
    public void updateAutor(UUID entityId, String autor) {
        try (Transaction tx = persistence.getTransaction()) {
            OutgoingDocuments outgoingDocuments = persistence.getEntityManager().find(OutgoingDocuments.class, entityId);
            if (outgoingDocuments != null) {
                outgoingDocuments.setAutor(autor);
            }
            tx.commit();
        }
    }
}