package com.company.doc.web.screens.outgoingdocuments;

import com.haulmont.bpm.entity.ProcAttachment;
import com.haulmont.bpm.gui.procactionsfragment.ProcActionsFragment;
import com.haulmont.cuba.gui.app.core.file.FileDownloadHelper;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.model.InstanceLoader;
import com.haulmont.cuba.gui.screen.*;
import com.company.doc.entity.OutgoingDocuments;

import javax.inject.Inject;
@UiController("docs_OutgoingDocuments.edit")
@UiDescriptor("outgoing-documents-edit.xml")
@EditedEntityContainer("outgoingDocumentsDc")
@LoadDataBeforeShow
public class OutgoingDocumentsEdit extends StandardEditor<OutgoingDocuments> {
    private static final String PROCESS_CODE = "doc";

    @Inject
    private CollectionLoader<ProcAttachment> procAttachmentsDl;

    @Inject
    private InstanceContainer<OutgoingDocuments> outgoingDocumentsDc;

    @Inject
    protected ProcActionsFragment procActionsFragment;

    @Inject
    private Table<ProcAttachment> attachmentsTable;

    @Inject
    private InstanceLoader<OutgoingDocuments> outgoingDocumentsDl;

    @Subscribe
    private void onBeforeShow(BeforeShowEvent event) {
        outgoingDocumentsDl.load();
        procAttachmentsDl.setParameter("entityId",outgoingDocumentsDc.getItem().getId());
        procAttachmentsDl.load();
        procActionsFragment.initializer()
                .standard()
                .init(PROCESS_CODE, getEditedEntity());

        FileDownloadHelper.initGeneratedColumn(attachmentsTable, "file");
    }
}