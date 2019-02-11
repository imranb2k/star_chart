drop schema IF EXISTS star_chart CASCADE;

CREATE SCHEMA IF NOT EXISTS star_chart;
SET search_path TO star_chart;


DROP TABLE IF EXISTS user_acc CASCADE;

CREATE TABLE user_acc (
	ID serial NOT NULL primary key,
	NAME varchar(100),
    AGE integer NOT NULL,
	DATE_CREATED timestamp(0));