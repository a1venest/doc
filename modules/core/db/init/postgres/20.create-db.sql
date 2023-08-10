-- begin DOC_EMPLOYEES
alter table DOC_EMPLOYEES add constraint FK_DOC_EMPLOYEES_ON_USER foreign key (USER_ID) references SEC_USER(ID)^
alter table DOC_EMPLOYEES add constraint FK_DOC_EMPLOYEES_ON_SUBDIVISION foreign key (SUBDIVISION_ID) references DOC_SUBDIVISIONS(ID)^
alter table DOC_EMPLOYEES add constraint FK_DOC_EMPLOYEES_ON_PHOTO foreign key (PHOTO_ID) references SYS_FILE(ID)^
create index IDX_DOC_EMPLOYEES_ON_USER on DOC_EMPLOYEES (USER_ID)^
create index IDX_DOC_EMPLOYEES_ON_SUBDIVISION on DOC_EMPLOYEES (SUBDIVISION_ID)^
create index IDX_DOC_EMPLOYEES_ON_PHOTO on DOC_EMPLOYEES (PHOTO_ID)^
-- end DOC_EMPLOYEES
-- begin DOC_SUBDIVISIONS
alter table DOC_SUBDIVISIONS add constraint FK_DOC_SUBDIVISIONS_ON_DIVISION_HEAD foreign key (DIVISION_HEAD_ID) references DOC_EMPLOYEES(ID)^
alter table DOC_SUBDIVISIONS add constraint FK_DOC_SUBDIVISIONS_ON_LEAD_DIVISION foreign key (LEAD_DIVISION_ID) references DOC_SUBDIVISIONS(ID)^
alter table DOC_SUBDIVISIONS add constraint FK_DOC_SUBDIVISIONS_ON_OUTGOING_DOCUMENTS foreign key (OUTGOING_DOCUMENTS_ID) references DOCS_OUTGOING_DOCUMENTS(ID)^
create index IDX_DOC_SUBDIVISIONS_ON_DIVISION_HEAD on DOC_SUBDIVISIONS (DIVISION_HEAD_ID)^
create index IDX_DOC_SUBDIVISIONS_ON_LEAD_DIVISION on DOC_SUBDIVISIONS (LEAD_DIVISION_ID)^
create index IDX_DOC_SUBDIVISIONS_ON_OUTGOING_DOCUMENTS on DOC_SUBDIVISIONS (OUTGOING_DOCUMENTS_ID)^
-- end DOC_SUBDIVISIONS
-- begin DOCS_OUTGOING_DOCUMENTS
alter table DOCS_OUTGOING_DOCUMENTS add constraint FK_DOCS_OUTGOING_DOCUMENTS_ON_DOC_TYPE foreign key (DOC_TYPE_ID) references DOC_DOCUMENT_TYPE(ID)^
create index IDX_DOCS_OUTGOING_DOCUMENTS_ON_DOC_TYPE on DOCS_OUTGOING_DOCUMENTS (DOC_TYPE_ID)^
-- end DOCS_OUTGOING_DOCUMENTS
