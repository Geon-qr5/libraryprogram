insert into tb_book (book_no, title, author, price, pub_no)
values ('B' || LPAD (SEQ_TB_BOOK.NEXTVAL, 5, 0), 'test', 'testa', 20000 ,'P00001');
insert into tb_book (book_no, title, author, price, pub_no)
values ('B' || lpad(seq_tb_book.nextval, 5, 0), ?, ?, ?, ?);