alter table DOCS_OUTGOING_DOCUMENTS rename column divisionhead_id to divisionhead_id__u72375 ;
alter table DOCS_OUTGOING_DOCUMENTS drop constraint FK_DOCS_OUTGOING_DOCUMENTS_ON_DIVISIONHEAD ;
drop index IDX_DOCS_OUTGOING_DOCUMENTS_ON_DIVISIONHEAD ;
alter table DOCS_OUTGOING_DOCUMENTS add column DIVISIONHEAD_ID uuid ;
