-- Create sequences --

CREATE SEQUENCE public.xambanque_uid
    INCREMENT 1
    START 100
    MINVALUE 1
    MAXVALUE 9999999999999999
    CACHE 1;
    

-- create tables --
    
CREATE TABLE public.bank
(
    id bigint NOT NULL,
    name text COLLATE pg_catalog."default" NOT NULL,
    adress text COLLATE pg_catalog."default" NOT NULL,
    email text COLLATE pg_catalog."default" NOT NULL,
    phone text COLLATE pg_catalog."default",
    CONSTRAINT user_pkey PRIMARY KEY (id)
);

CREATE TABLE public.bank_account
(
    id bigint NOT NULL,
    name text COLLATE pg_catalog."default" NOT NULL,
    "number" text COLLATE pg_catalog."default" NOT NULL,
    solde bigint NOT NULL,
    user_id bigint,
    iban text COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT bank_account_pkey PRIMARY KEY (id)
);

CREATE TABLE public.bank_operation
(
    id bigint NOT NULL,
    name text COLLATE pg_catalog."default" NOT NULL,
    operation_date bigint NOT NULL,
    value bigint NOT NULL,
    account_id bigint,
    details text COLLATE pg_catalog."default",
    CONSTRAINT bank_operation_pkey PRIMARY KEY (id)
);

CREATE TABLE public.beneficiary_account
(
    id bigint NOT NULL,
    user_id bigint NOT NULL,
    target_account_id bigint NOT NULL,
    CONSTRAINT beneficiary_account_pkey PRIMARY KEY (id)
);

CREATE TABLE public.publicity
(
    id bigint NOT NULL,
    title text COLLATE pg_catalog."default" NOT NULL,
    description text COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT publicity_pkey PRIMARY KEY (id)
);

CREATE TABLE public."user"
(
    id bigint NOT NULL,
    last_name text COLLATE pg_catalog."default" NOT NULL,
    first_name text COLLATE pg_catalog."default" NOT NULL,
    login bigint NOT NULL,
    password bigint NOT NULL,
    email text COLLATE pg_catalog."default" NOT NULL,
    bank_id bigint NOT NULL,
    phone text COLLATE pg_catalog."default",
    CONSTRAINT user_pkey1 PRIMARY KEY (id)
);

CREATE TABLE public.user_publicity_link
(
    id bigint NOT NULL,
    user_id bigint NOT NULL,
    publicity_id bigint NOT NULL,
    viewing_number integer,
    CONSTRAINT user_publicity_link_pkey PRIMARY KEY (id)
);

