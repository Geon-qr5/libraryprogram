insert into tb_book (book_no, title, author, price, pub_no) values ('B' || LPAD (SEQ_TB_BOOK.NEXTVAL, 5, 0), 'test', 'testa', 20000 ,'P00001');
