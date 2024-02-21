INSERT INTO items (item_name) VALUES ('Book 1');
INSERT INTO items (item_name) VALUES ('Book 2');

INSERT INTO items (item_name) VALUES ('Movie 1');
INSERT INTO items (item_name) VALUES ('Movie 2');
INSERT INTO items (item_name) VALUES ('Some item');

-- Assuming the "id" values match with the ones in the "items" table
INSERT INTO book (id, author, isbn) VALUES (1, 'Author 1', 'ISBN-123456789');
INSERT INTO book (id, author, isbn) VALUES (2, 'Author 2', 'ISBN-987654321');

-- Assuming the "id" values match with the ones in the "items" table
INSERT INTO movie (id, duration, director) VALUES (3, 120, 'Director 1');
INSERT INTO movie (id, duration, director) VALUES (4, 150, 'Director 2');

