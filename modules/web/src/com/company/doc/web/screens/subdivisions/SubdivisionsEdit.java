package com.company.doc.web.screens.subdivisions;

import com.haulmont.cuba.gui.screen.*;
import com.company.doc.entity.Subdivisions;

@UiController("doc_Subdivisions.edit")
@UiDescriptor("subdivisions-edit.xml")
@EditedEntityContainer("subdivisionsDc")
@LoadDataBeforeShow
public class SubdivisionsEdit extends StandardEditor<Subdivisions> {
}