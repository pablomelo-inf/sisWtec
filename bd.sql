
/*==============================================================*/
/* Table: CLIENTE                                               */
/*==============================================================*/
create table CLIENTE 
(
   NOME                 varchar(30)                   not null,
   SNOME                varchar(30)                   not null,
   TELEFONE             varchar(30)                   not null,
   CPF                  varchar(11)                    not null,
   RG                   varchar(8)                    not  null,
   constraint PK_CLIENTE primary key clustered (CPF)
);

/*==============================================================*/
/* Table: ENDERECOCLI                                           */
/*==============================================================*/
create table ENDERECOCLI 
(
   CPF                  varchar(11)                  not  null,
   LOGRADOURO           varchar(60)                   not null,
   CIDADE               varchar(40)                   not null,
   ESTADO               varchar(20)                   not null
);

/*==============================================================*/
/* Table: ENDERECOFORNE                                         */
/*==============================================================*/
create table ENDERECOFORNE 
(
   CNPJ                 varchar(25)                   not null,
   LOGRADOURO           varchar(20)                   not null,
   CEP                  varchar(15)                   not null,
   CIDADE               varchar(40)                   not null,
   ESTADO               varchar(20)                  not null,
   PAIS                 varchar(30)                   not null
);

/*==============================================================*/
/* Table: FORNECEDOR                                            */
/*==============================================================*/
create table FORNECEDOR 
(
   NOME                 varchar(30)                   not null,
   CNPJ                 varchar(25)                    not null,
   SITE                 varchar(300)                   null,
   EMAIL                varchar(90)                    null,
   TELEFONE             varchar(30)                  not  null,
   constraint PK_FORNECEDOR primary key clustered (CNPJ)
);

/*==============================================================*/
/* Table: PRODUTO                                               */
/*==============================================================*/
create table PRODUTO 
(
   NOME                 varchar(30)                  not  null,
   MARCA                varchar(30)                    not null,
   QTESTOQUE            int                            not null,
   VALORVENDA           double                         not null,
   VALORCOMPRA          double                         not null,
   CODPRODUTO           varchar(100)                not null,
   CNPJ                 varchar(25)                  not  null,
   DESCPRODUTO          varchar(150)                   null,
   constraint PK_PRODUTO primary key clustered (CODPRODUTO)
);

/*==============================================================*/
/* Table: VENDA                                                 */
/*==============================================================*/
create table VENDA 
(
   DATAHORA             datetime                     not  null,
   CODVENDA             int                            not null,
   CODPRODUTO           varchar(100)                      not     null,
   CPF                  varchar(11)                  not  null,
   RG                   varchar(8)                   not   null,
   CLI_CPF              varchar(11)                    null,
   constraint PK_VENDA primary key clustered (CODVENDA)
);

/*==============================================================*/
/* Table: VENDEDOR                                              */
/*==============================================================*/
create table VENDEDOR 
(
   NOME                 varchar(30)                  not  null,
   CPF                  varchar(11)                   not null,
   RG                   varchar(8)                     not null,
   USUARIO              varchar(16)                   not null,
   SENHA                varchar(15)                   not null,
   TELEFONE             varchar(30)                   not null,
   constraint PK_VENDEDOR primary key clustered (CPF, RG)
);

alter table ENDERECOCLI
   add constraint FK_ENDERECO_REFERENCE_CLIENTE foreign key (CPF)
      references CLIENTE (CPF)
      on update restrict
      on delete restrict;

alter table ENDERECOFORNE
   add constraint FK_ENDERECO_REFERENCE_FORNECED foreign key (CNPJ)
      references FORNECEDOR (CNPJ)
      on update restrict
      on delete restrict;

alter table PRODUTO
   add constraint FK_PRODUTO_REFERENCE_FORNECED foreign key (CNPJ)
      references FORNECEDOR (CNPJ)
      on update restrict
      on delete restrict;

alter table VENDA
   add constraint FK_VENDA_REFERENCE_PRODUTO foreign key (CODPRODUTO)
      references PRODUTO (CODPRODUTO)
      on update restrict
      on delete restrict;

alter table VENDA
   add constraint FK_VENDA_REFERENCE_VENDEDOR foreign key (CPF, RG)
      references VENDEDOR (CPF, RG)
      on update restrict
      on delete restrict;

alter table VENDA
   add constraint FK_VENDA_REFERENCE_CLIENTE foreign key (CLI_CPF)
      references CLIENTE (CPF)
      on update restrict
      on delete restrict;
