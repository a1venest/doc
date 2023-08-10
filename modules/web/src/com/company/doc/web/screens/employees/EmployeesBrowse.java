package com.company.doc.web.screens.employees;

import com.haulmont.cuba.gui.screen.*;
import com.company.doc.entity.Employees;

@UiController("doc_Employees.browse")
@UiDescriptor("employees-browse.xml")
@LookupComponent("employeesesTable")
@LoadDataBeforeShow
public class EmployeesBrowse extends StandardLookup<Employees> {
}