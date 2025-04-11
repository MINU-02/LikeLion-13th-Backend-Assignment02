USE LikeLion;

SELECT customer.name AS 고객명, book.name AS 책제목
FROM customer JOIN book 
ON customer.id = book.customer_id;
