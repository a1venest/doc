alter table DOC_SUBDIVISIONS add constraint FK_DOC_SUBDIVISIONS_ON_OUTGOING_DOCUMENTS foreign key (OUTGOING_DOCUMENTS_ID) references DOCS_OUTGOING_DOCUMENTS(ID);
create index IDX_DOC_SUBDIVISIONS_ON_OUTGOING_DOCUMENTS on DOC_SUBDIVISIONS (OUTGOING_DOCUMENTS_ID);