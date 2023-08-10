package com.company.doc.web.screens.outgoingdocuments;

import com.haulmont.cuba.gui.screen.*;
import com.company.doc.entity.OutgoingDocuments;

@UiController("docs_OutgoingDocuments.edit")
@UiDescriptor("outgoing-documents-edit.xml")
@EditedEntityContainer("outgoingDocumentsDc")
@LoadDataBeforeShow
public class OutgoingDocumentsEdit extends StandardEditor<OutgoingDocuments> {
}