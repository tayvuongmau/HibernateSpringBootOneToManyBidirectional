-- CREATE TABLE IF NOT EXISTS author (
--     id INT AUTO_INCREMENT PRIMARY KEY,
--     name VARCHAR(150) NOT NULL,
--     genre VARCHAR(150) NOT NULL,
--     age INT
-- );
-- CREATE TABLE IF NOT EXISTS book (
--     id INT AUTO_INCREMENT PRIMARY KEY,
--     title VARCHAR(250) NOT NULL,
--     isbn VARCHAR(250) NOT NULL,
--     author_id INT
-- );

-- insert authors
INSERT INTO author (age, name, genre) VALUES (23, 'Mark Janel', 'Anthology');
INSERT INTO author (age, name, genre) VALUES (43, 'Olivia Goy', 'Horror');
INSERT INTO author (age, name, genre) VALUES (51, 'Quartis Young', 'Anthology');
INSERT INTO author (age, name, genre) VALUES (34, 'Joana Nimar', 'History');

-- insert books
INSERT INTO book (isbn, title, author_id) VALUES ('001-JN', 'A History of Ancient Prague', 4);
INSERT INTO book (isbn, title, author_id) VALUES ('002-JN', 'A Peoples History', 4);
INSERT INTO book (isbn, title, author_id) VALUES ('001-MJ', 'The Beatles Anthology', 1);
INSERT INTO book (isbn, title, author_id) VALUES ('001-OG', 'Carrie', 2);