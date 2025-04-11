USE LikeLion;

CREATE TABLE customer(
	id INTEGER PRIMARY KEY, -- id를 기본키로 지정
    name VARCHAR(50) NOT NULL, -- 고객의 이름은 필수라서 공백 허용 x (무결성 제약)
    age INTEGER -- 나이를 정수형태로 
);

CREATE TABLE book(
	id INTEGER PRIMARY KEY, -- id를 기본키로
    name VARCHAR(100) NOT NULL, -- 책의 이름도 필수라서 공백 허용 x (무결성 제약)
    price INTEGER, -- 가격을 정수형으로
    customer_id INTEGER, -- 고객의 id 
    FOREIGN KEY (customer_id) REFERENCES customer(id) -- 외래키, customer의 id를 참조(무결성 제약)
);