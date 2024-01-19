CREATE TABLE accounts (
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    iban VARCHAR(255) NOT NULL,
    owner_id INT NOT NULL,
    FOREIGN KEY (owner_id) REFERENCES users(id)
);

INSERT INTO accounts (iban, owner_id) SELECT 'DE1234567890', id from users;
INSERT INTO accounts (iban, owner_id) SELECT 'DE2233444556', id from users;

