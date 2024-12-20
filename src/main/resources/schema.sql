CREATE TABLE `user` (
                        id BIGINT NOT NULL,
                            name VARCHAR(255) NOT NULL,
                        privateKey VARCHAR(255) NOT NULL,
                        publicKey VARCHAR(255) NOT NULL,
                        creditCardToken VARCHAR(255) NOT NULL,
                        PRIMARY KEY (id)
);
