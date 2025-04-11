USE LikeLion;

INSERT INTO customer (id, name, age) VALUES
(1, '김멋사', 25),
(2, '이멋사', 31),
(3, '박멋사', 29),
(4, '하멋사', 19);


INSERT INTO book (id, name, price, customer_id) VALUES
(101, '부의 추월차선', 18000, 1),
(102, '역행자', 23000, 2),
(103, '럭키', 27000, 1),
(104, '미움받을 용기', 22000, 3),
(105, '법은 얼마나 정의로운가', 19000, 4); 