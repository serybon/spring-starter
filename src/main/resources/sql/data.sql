INSERT INTO company(name)
values ('Google'),
       ('Meta'),
       ('Amazon');

INSERT INTO company_locales (company_id, lang, description)
VALUES ((Select id from company where name = 'Google'), 'en', 'Google description'),
       ((Select id from company where name = 'Google'), 'ru', 'Google описание'),
       ((Select id from company where name = 'Meta'), 'en', 'Google description'),
       ((Select id from company where name = 'Meta'), 'ru', 'Google описание'),
       ((Select id from company where name = 'Amazon'), 'en', 'Google description'),
       ((Select id from company where name = 'Amazon'), 'ru', 'Google описание');

INSERT INTO public.users (birth_date, company_id, role, firstname, lastname, username)
VALUES ('1984-02-08', (Select id from company where name ='Google'), 'USER', 'Pavel', 'Bobrov', 'pavel@gmail.com'),
       ('2000-03-10', (Select id from company where name ='Google'), 'USER', 'Semen', 'Dragva', 'semen@gmail.com'),
       ('1996-10-04', (Select id from company where name = 'Meta'), 'USER', 'Bob', 'Johnson', 'bob@gmail.com'),
       ('1970-05-12', (Select id from company where name = 'Meta'), 'ADMIN', 'John', 'Doe', 'johndoe@gmail.com'),
       ('1990-07-30', (Select id from company where name = 'Amazon'), 'USER', 'Alice', 'Smith', 'alice@gmail.com'),
       ('2002-01-06', (Select id from company where name ='Google'), 'USER', 'Charlie', 'Brown', 'charlie@gmail.com'),
       ('1988-04-22', (Select id from company where name = 'Amazon'), 'USER', 'Jane', 'Doe', 'jane@gmail.com'),
       ('2025-04-03', (Select id from company where name = 'Meta'), 'USER', 'Viktoria', 'Vlasova', 'vikavlas'),
       ('2025-04-22', (Select id from company where name = 'Amazon'), 'USER', 'Svetlana', 'Svetova', 'svetsvet@gmail.com');

INSERT INTO public.chat (id, name) VALUES (1, 'minsk');
INSERT INTO public.chat (id, name) VALUES (2, 'java');
INSERT INTO public.chat (id, name) VALUES (3, 'database');
