CREATE TYPE role AS ENUM ('ADMIN' , 'CLIENT');

CREATE TABLE "user" (
   id_user SERIAL PRIMARY KEY,
   name VARCHAR(255),
   first_name VARCHAR(255),
   email_address VARCHAR(255) NOT NULL,
   password VARCHAR(255) NOT NULL,
   user_role role NOT NULL
)