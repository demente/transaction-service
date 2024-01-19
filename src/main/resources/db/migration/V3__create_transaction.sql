CREATE TABLE transactions (
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    currency VARCHAR(3) NOT NULL,
    amount_in_cents INT NOT NULL,
    source_account_id INT NOT NULL,
    destination_account_id INT NOT NULL,
    FOREIGN KEY (source_account_id) REFERENCES accounts(id),
    FOREIGN KEY (destination_account_id) REFERENCES accounts(id)
);
