CREATE TABLE `user` (
                        id BIGINT NOT NULL,
                            name VARCHAR(255) NOT NULL,
                        privateKey VARCHAR(1023) NOT NULL,
                        publicKey VARCHAR(1023) NOT NULL,
                        creditCardToken VARCHAR(1023) NOT NULL,
                        PRIMARY KEY (id)
);
