CREATE TABLE users (
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    username VARCHAR(255),
    password VARCHAR(255)
);

INSERT INTO users (username, password) VALUES ('admin', '$2a$10$5ovqkMCNWaLfrR7x4r8KNeRv2WSZ3wR6K9fYxV2LHD3BJ4jNPG2JO');

