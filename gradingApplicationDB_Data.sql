use gradingApp;


insert into roles (id, name) values (1, 'TEACHER');
insert into roles (id, name) values (2,'STUDENT');

insert into user (user_name, password, role) values ('chamari12','$2a$10$lunXJpp3zaAKk8ugibXL7OqGxBszqVZrwBcc6S5RXCBtqXctwdtLC',1);
insert into user (user_name, password, role) values ('kamal12','$2a$10$qrqndnC.8cDNc/V5sIzSIeewiJjJy.avRtcUQEFkorkT7ZRYqjHiy', 2);
insert into user (user_name, password, role) values ('nimal12','$2a$10$KdjQQEpniBO4G3bC2v4mD.w2lkxFNuzylrzLNND9Hk.TvErA/mYJu', 1);
insert into user (user_name, password, role) values ('sumudu12', '$2a$10$rnHLRynFrZMoLFBOKlMgNezJMzxeDeByCWVd7iZHOvQ.9H2GJw/.e', 2);
insert into user (user_name, password, role) values ('gihan12', '$2a$10$4nkVRxE.6/bRsF2YNLq3ReQ.NNas5m7R8rOh55z8ynwbzJWrEiC3m', 2);
insert into user (user_name, password, role) values ('nimali12', '$2a$10$pvK6TOYQ92ByqO3QFch3ReYarIEhcYU4yfY0SpT3IAiROCbJYqUr2', 2);
insert into user (user_name, password, role) values ('kasun12', '$2a$10$fgoSETCy.PpleOvD4uO.2upGtb4vKp.26FFabsJOirgqxMLcAlY/q', 2);
insert into user (user_name, password, role) values ('danuka12', '$2a$10$LqL.OBeHHlwvxlWYwNoh8esoOLAYGpOp1Ll7sWQiCMSnBu7yTPDZq', 2);

insert into class (id, name) values ('C001','Class_A');
insert into class (id, name) values('C002','Class_B');

insert into teacher (id, name, class, user_name) values ('T001', 'Chamari','C001','Chamari12');
insert into teacher (id, name, class, user_name) values ('T002','Nimal','C002','nimal12');

insert into student (id, name, class, user_name) values ('S001','Kamal','C001',	'kamal12');
insert into student (id, name, class, user_name) values ('S002', 'Sumudu','C001','sumudu12');
insert into student (id, name, class, user_name) values ('S003', 'Gihan','C001','gihan12');
insert into student (id, name, class, user_name) values('S004', 'Nimali','C002','nimali12');
insert into student (id, name, class, user_name) values ('S005', 'Kasun','C002','kasun12');
insert into student (id, name, class, user_name) values('S006','Danuka','C001','danuka12');

insert into assingment (asmnt_id, asmnt_name, asmnt_type, teacher) values ('AS001','Java Assingment','online','T001');
insert into assingment (asmnt_id, asmnt_name, asmnt_type, teacher) values ('AS002','OOP Assingment','online','T001');
insert into assingment (asmnt_id, asmnt_name, asmnt_type, teacher) values ('AS003','Maths Assingment','paper','T001');
insert into assingment (asmnt_id, asmnt_name, asmnt_type, teacher) values ('AS004','Maths Assingment','paper','T002');
insert into assingment (asmnt_id, asmnt_name, asmnt_type, teacher) values ('AS005','Science Assingment','paper','T002');
insert into assingment (asmnt_id, asmnt_name, asmnt_type, teacher) values ('AS006','Programming Assingment','online','T002');

insert into question (asmnt_id, q_no, answer, question) values ('AS001', 1, 8, 'no of primitive data types in java?');
insert into question (asmnt_id, q_no, answer, question) values ('AS001', 2, 'public, protected, default, private', 'Access modifiers in java?');
insert into question (asmnt_id, q_no, answer, question) values ('AS002', 1, 'Abstraction, Encapsulation, Inheritance,Polymorphism', 'Main OOP concepts?');
insert into question (asmnt_id, q_no, answer, question) values ('AS002', 2, 'Encapsulation is one of the fundamental concepts in object-oriented programming (OOP). It describes the idea of bundling data and methods that work on that data within one unit', 'What is Encapsulation?');
insert into question (asmnt_id, q_no, answer, question) values ('AS002', 3, 'A constructor in Java is a special method that is used to initialize objects', 'What is constructor?');


insert into grade_details (asmnt_id, student_id, grade) values ('AS001', 'S001', 'A');
insert into grade_details (asmnt_id, student_id, grade) values('AS001', 'S002','B');
insert into grade_details (asmnt_id, student_id, grade) values('AS001', 'S003','A');
insert into grade_details (asmnt_id, student_id, grade) values('AS002', 'S001', 'C');
insert into grade_details (asmnt_id, student_id, grade) values('AS002', 'S002', 'A');
insert into grade_details (asmnt_id, student_id, grade) values('AS002', 'S003', 'B');

insert into student_marks (asmnt_id, q_no, student_id, answer, no_of_attempts, result, time_spent) values ('AS001', 1, 'S001', 7, 2, 'wrong', '00:10:10');
insert into student_marks (asmnt_id, q_no, student_id, answer, no_of_attempts, result, time_spent) values('AS001', 1, 'S002', 8, 1, 'right', '00:6:10');
insert into student_marks (asmnt_id, q_no, student_id, answer, no_of_attempts, result, time_spent) values('AS001', 1, 'S003', 8, 1, 'right', '00:5:10');
insert into student_marks (asmnt_id, q_no, student_id, answer, no_of_attempts, result, time_spent) values('AS001', 2, 'S001', 'public, protected, default', 1, 'partial', '00:05:10');
insert into student_marks (asmnt_id, q_no, student_id, answer, no_of_attempts, result, time_spent) values('AS001', 2, 'S003', 'public, protected, default, private', 2, 'right', '00:07:10');
insert into student_marks (asmnt_id, q_no, student_id, answer, no_of_attempts, result, time_spent) values('AS001', 2, 'S002', 'public, protected, default, private', 1, 'right', '00:06:10');
insert into student_marks (asmnt_id, q_no, student_id, answer, no_of_attempts, result, time_spent) values('AS002', 1, 'S002', 'Abstraction, Encapsulation, Inheritance, Polymorphism',2 , 'right', '00:7:20');
insert into student_marks (asmnt_id, q_no, student_id, answer, no_of_attempts, result, time_spent) values('AS002', 2, 'S003', 'Encapsulation is one of the fundamental concepts in object-oriented programming (OOP). It describes the idea of bundling data and methods that work on that data within one unit',1, 'right', '00:11:10');
insert into student_marks (asmnt_id, q_no, student_id, answer, no_of_attempts, result, time_spent) values('AS002', 3, 'S004', 'A constructor in Java is a special method that is used to initialize objects',2, 'right', '00:6:15');















