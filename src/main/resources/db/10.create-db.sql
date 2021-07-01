create table COR_COUNTRY (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    ISO_ALPHA3_CODE varchar(255) not null,
    ISO_CODE varchar(255) not null,
    COMMENTS varchar(1024),
    --
    primary key (ID)
);

create table COR_NEIGHBORHOOD (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    CODE varchar(255) not null,
    CITY_ID uuid not null,
    COMMENTS varchar(1024),
    --
    primary key (ID)
);

create table COR_CITY (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    CODE varchar(255) not null,
    COUNTRY_ID uuid not null,
    DEPARTMENT_ID uuid,
    COMMENTS varchar(1024),
    --
    primary key (ID)
);


create table COR_DEPARTMENT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    CODE varchar(255) not null,
    COUNTRY_ID uuid not null,
    --
    primary key (ID)
);

create table COR_DOCUMENT_TYPE (
    ID uuid,
    --
    REQUIRE_NUMBER boolean,
    REQUIRE_ISSUE_DATE boolean,
    REQUIRE_EXPIRE_DATE boolean,
    VALIDITY_PERIOD_DAYS integer,
    FOR_PRIVATE boolean,
    FOR_BUSINESS boolean,
    IS_DEFAULT_FOR_PRIVATE boolean,
    IS_DEFAULT_FOR_BUSINESS boolean,
    NUMBER_MASK varchar(255),
    IS_UNIQUE boolean,
    --
    primary key (ID)
);



create table COR_DOCUMENT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DOCUMENT_NUMBER varchar(255),
    ISSUE_DATE date,
    EXPIRATION_DATE date,
    IS_VALIDATED boolean,
    COMMENTS text,
    SOURCE varchar(255),
    DOCUMENT_TYPE_ID uuid not null,
    COUNTRY_ID uuid,
    PERSON_ID uuid not null,
    IS_TAX_DOCUMENT boolean,
    --
    primary key (ID)
);

create table COR_CURRENCY (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    CODE varchar(255) not null,
    CODE_ISO varchar(255) not null,
    SYMBOL varchar(255) not null,
    FORMAT varchar(20) not null,
    COUNTRY_ID uuid not null,
    DECIMALS integer not null,
    ENABLED boolean,
    --
    primary key (ID)
);


-- begin COR_PERSON_RELATION_TYPE
create table COR_PERSON_RELATION_TYPE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    APPLICABLE_TO_PHYSICAL_PERSON boolean not null,
    APPLICABLE_TO_JURIDICAL_PERSON boolean not null,
    REQUIRES_EXPIRATION_DATE boolean not null,
    --
    primary key (ID)
);
-- end COR_PERSON_RELATION_TYPE


-- begin COR_PERSON_RELATION
create table COR_PERSON_RELATION (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PERSON_ID uuid not null,
    RELATED_PERSON_ID uuid not null,
    RELATION_TYPE_ID uuid not null,
    EXPIRATION_DATE date,
    --
    primary key (ID)
);
-- end COR_PERSON_RELATION


-- begin COR_PERSON
create table COR_PERSON (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    DTYPE varchar(31),
    --
    CODE varchar(255),
    FULL_NAME varchar(255) not null,
    EMAIL varchar(255),
    PERSON_TYPE varchar(50) not null,
    NATIONALITY_ID uuid not null,
    --
    primary key (ID)
);
-- end COR_PERSON



-- begin COR_PHYSICAL_PERSON
create table COR_PHYSICAL_PERSON (
    ID uuid,
    --
    FIRST_NAME varchar(30) not null,
    SECOND_NAME varchar(30),
    FIRST_LAST_NAME varchar(40) not null,
    SECOND_LAST_NAME varchar(30),
    GENDER varchar(60) not null,
    MARITAL_STATUS varchar(60),
    BIRTH_DATE date not null,
    --
    primary key (ID)
);
-- end COR_PHYSICAL_PERSON


-- begin COR_JURIDICAL_PERSON
create table COR_JURIDICAL_PERSON (
    ID uuid,
    --
    LEGAL_NAME varchar(255) not null,
    BRAND_NAME varchar(255) not null,
    JURIDICAL_TYPE varchar(60) not null,
    OPENING_DATE date,
    RETENTION_AGENT boolean,
    SOCIETY_EXPIRATION_DATE date,
    
    --
    primary key (ID)
);
-- end COR_JURIDICAL_PERSON
