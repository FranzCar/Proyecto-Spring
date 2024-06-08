DROP TABLE IF EXISTS public.university_test;

CREATE TABLE IF NOT EXISTS public.university_test
(
    id integer NOT NULL,
    created_date timestamp(6) without time zone,
    modified_date timestamp(6) without time zone,
    code character varying(255) COLLATE pg_catalog."default",
    name character varying(255) COLLATE pg_catalog."default",
    uuid character varying(255) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT university_test_pkey PRIMARY KEY (id)
    )

    TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.university_test
    OWNER to postgres;