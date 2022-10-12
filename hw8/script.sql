CREATE TABLE questions
(
    question_id   	INTEGER         PRIMARY KEY,
    name            VARCHAR(255)    NOT NULL
);

CREATE TABLE answers
(
    answer_id   INTEGER         PRIMARY KEY,
    name        VARCHAR(255)    NOT NULL
);

CREATE TABLE test_blocks
(
	question_id   			INTEGER         REFERENCES questions (question_id),
    answer_id   			INTEGER         REFERENCES answers (answer_id),
    is_answer_correct       BOOLEAN    		NOT NULL
);

INSERT INTO questions(name)
VALUES
    (1, 'What is a correct syntax to output "Hello World" in Java');
	
INSERT INTO questions(name)
VALUES
    (2, 'Which data type is used to create a variable that should store text?');
	
INSERT INTO answers(name)
VALUES
    (1, 'System.out.println("Hello World")');
INSERT INTO answers(name)
VALUES
    (2, 'print("Hello World")');
INSERT INTO answers(name)
VALUES
    (3, 'string');
INSERT INTO answers(name)
VALUES
    (4, 'String');
INSERT INTO answers(name)
VALUES
    (5, 'text');
INSERT INTO answers(name)
VALUES
    (6, 'Text');


INSERT INTO test_blocks
VALUES
    (1, 1, true);
INSERT INTO test_blocks
VALUES
    (1, 2, false);

INSERT INTO test_blocks
VALUES
    (2, 3, false);
INSERT INTO test_blocks
VALUES
    (2, 4, true);
INSERT INTO test_blocks
VALUES
    (2, 5, false);
INSERT INTO test_blocks
VALUES
    (2, 6, false);
	
SELECT q.name, a.name, t.is_answer_correct FROM test_blocks AS t
JOIN questions AS q ON t.question_id = q.question_id
JOIN answers AS a ON a.answer_id = t.answer_id;
    