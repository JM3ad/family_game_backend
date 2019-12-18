CREATE TABLE PERSON (
	id serial not null primary key,
	first_name varchar(255) not null,
	last_name varchar(255) not null
);

CREATE TABLE IF NOT EXISTS ticks (tick timestamp);

insert into PERSON (first_name, last_name) values ('Jack', 'Mead');