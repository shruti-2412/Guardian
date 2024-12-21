CREATE TABLE `user` (
                        id BIGINT AUTO_INCREMENT NOT NULL,
                            name VARCHAR(255) NOT NULL,
                        privateKey VARCHAR(1023) NOT NULL,
                        publicKey VARCHAR(1023) NOT NULL,
                        creditCardToken VARCHAR(1023) NOT NULL,
                        PRIMARY KEY (id)
);

CREATE TABLE `govt` (
                        id BIGINT AUTO_INCREMENT NOT NULL,
                        name VARCHAR(255) NOT NULL,
                        publicKey VARCHAR(1023) NOT NULL,
                        PRIMARY KEY (id)
);

