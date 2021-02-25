insert into roles values
(1, 'TEACHER'),
(2,	'STUDENT');

insert into user values
('chamari12',	'{bcrypt}$2a$10$lunXJpp3zaAKk8ugibXL7OqGxBszqVZrwBcc6S5RXCBtqXctwdtLC'	1),
('kamal12','{bcrypt}$2a$10$qrqndnC.8cDNc/V5sIzSIeewiJjJy.avRtcUQEFkorkT7ZRYqjHiy', 2),
('nimal12','{bcrypt}$2a$10$KdjQQEpniBO4G3bC2v4mD.w2lkxFNuzylrzLNND9Hk.TvErA/mYJu', 1);
('sumudu12', '{bcrypt}$2a$10$rnHLRynFrZMoLFBOKlMgNezJMzxeDeByCWVd7iZHOvQ.9H2GJw/.e', 2),
('gihan12', '{bcrypt}$2a$10$4nkVRxE.6/bRsF2YNLq3ReQ.NNas5m7R8rOh55z8ynwbzJWrEiC3m', 2),
('nimali12', '{bcrypt}$2a$10$pvK6TOYQ92ByqO3QFch3ReYarIEhcYU4yfY0SpT3IAiROCbJYqUr2', 2),
('kasun12', '{bcrypt}$2a$10$fgoSETCy.PpleOvD4uO.2upGtb4vKp.26FFabsJOirgqxMLcAlY/q', 2),
('danuka12', 'bcrypt}$2a$10$LqL.OBeHHlwvxlWYwNoh8esoOLAYGpOp1Ll7sWQiCMSnBu7yTPDZq', 2);

insert into class values
('C001','Class_A'),
('C002','Class_B');

insert into teacher values
('T001', 'Chamari','C001','Chamari12'),
('T002','Nimal','C002','nimal12');

insert into student values
('S001',	'Kamal',	'C001',	'kamal12'),
('S002', 'Sumudu',	'C001',	'sumudu12'),
('S003', 'Gihan',	'C001',	'gihan12'),
('S004', 'Nimali',	'C002',	'nimali12'),
('S005', 'Kasun',	'C002',	'kasun12'),
('S006','Danuka','C001','danuka12');

insert into assingment values
('AS001',	'Java Assingment',	'online',	'T001')
('AS002',	'OOP Assingment',	'online',	'T001'),
('AS003', 'Maths Assingment','paper',	'T001'),
('AS004', 'Maths Assingment',	'paper',	'T002'),
('AS005', 'Science Assingment',	'paper',	'T002'),
('AS006', 'Programming Assingment',	'online',	'T002');

insert into question values
('AS001', 1, 8, 'no of primitive data types in java?'),
('AS001', 2, 'public, protected, default, private', 'Access modifiers in java?'),
('AS002', 1, 'Abstraction, Encapsulation, Inheritance, Polymorphism', 'Main OOP concepts?'),
('AS002', 2, 'Encapsulation is one of the fundamental concepts in object-oriented programming (OOP). It describes the idea of bundling data and methods that work on that data within one unit', 'What is Encapsulation?'),
('AS002', 3, 'A constructor in Java is a special method that is used to initialize objects', 'What is constructor');


insert into grade_details values
('AS001', 'S001', 'A')
('AS001', 'S002','B')
('AS001', 'S003','A')
('AS002', 'S001', 'C')
('AS002', 'S002', 'A')
('AS002', 'S003', 'B')

insert into student_marks values
('AS001', 1, 'S001', 7, 2, 'wrong', 00:10:10),
('AS001', 1, 'S002', 8, 1, 'right', 00:6:10),
('AS001', 1, 'S003', 8, 1, 'right', 00:5:10),
('AS001', 2, 'S001', 'public, protected, default', 1, 'partial', 00:05:10),
('AS001', 2, 'S003', 'public, protected, default, private', 2, 'right', 00:07:10),
('AS001', 2, 'S002', 'public, protected, default, private', 1, 'right', 00:06:10),
('AS002', 1, 'S002', 'Abstraction, Encapsulation, Inheritance, Polymorphism',2 , 'right', 00:7:20),
('AS002', 2, 'S003', 'Encapsulation is one of the fundamental concepts in object-oriented programming (OOP). It describes the idea of bundling data and methods that work on that data within one unit',1, 'right', 00:11:10),
('AS002', 3, 'S004', 'A constructor in Java is a special method that is used to initialize objects',2, 'right', 00:6:15);















