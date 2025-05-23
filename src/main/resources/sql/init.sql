create table if not exists company
(
    id   integer generated by default as identity
        primary key,
    name varchar(64) not null
        unique
);

alter table company
    owner to postgres;

create table if not exists company_locales
(
    company_id  INT REFERENCES company (id),
    lang        varchar(2),
    description varchar(255) NOT null,
    PRIMARY KEY (company_id, lang)
);

create table if not exists public.users
(
    id         bigserial PRIMARY KEY,
    username   varchar(64) not null unique,
    birth_date date,
    firstname  varchar(64),
    lastname   varchar(64),
    role       varchar(32),
    company_id int references public.company (id)
);

alter table public.users
    owner to postgres;

create table if not exists public.payment
(
    id          integer        not null
        constraint payments_pkey
            primary key,
    amount      numeric(10, 2) not null,
    receiver_id bigint         not null
        constraint payments_receiver_id_fkey
            references public.users
            on delete cascade,
    version     bigint
);

alter table public.payment
    owner to postgres;

create table if not exists public.chat
(
    id   bigint primary key,
    name varchar(64) not null
        unique
);

alter table public.chat
    owner to postgres;



create table if not exists public.users_chat
(
    id         bigserial primary key,
    user_id    bigint references public.users (id),
    chat_id    bigint references public.chat (id),
    unique (user_id, chat_id)
);

alter table public.users_chat
    owner to postgres;