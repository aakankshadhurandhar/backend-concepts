-- V1__Create_Student_Table.sql

CREATE TABLE student (
    id BINARY(16) PRIMARY KEY,
    name VARCHAR(100),
    age INT,
    email VARCHAR(200),
    division INT
);