package com.company.doc.web.screens.employees;

import com.haulmont.cuba.gui.screen.*;
import com.company.doc.entity.Employees;

@UiController("doc_Employees.edit")
@UiDescriptor("employees-edit.xml")
@EditedEntityContainer("employeesDc")
@LoadDataBeforeShow
public class EmployeesEdit extends StandardEditor<Employees> {
}