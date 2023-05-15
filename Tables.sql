CREATE TABLE users
(
    Id BIGSERIAL PRIMARY KEY,
    username varchar NOT NULL,
    password varchar NOT NULL
);
CREATE TABLE article
(
    Id BIGINT,
    title VARCHAR NOT NULL,
    content VARCHAR NOT NULl,
    user_id BIGINT, 
    PRIMARY KEY (Id, user_id),
    CONSTRAINT fk_users_Id  FOREIGN KEY (user_id) REFERENCES users(Id)
);