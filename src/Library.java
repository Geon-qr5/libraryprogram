import java.util.ArrayList;

import Common.ScannerUtil;

public class Library {
    ScannerUtil scan = new ScannerUtil();

    ArrayList<Book> bookList = new ArrayList<Book>();

    public Library() {
        bookList.add(new Book(1, "제목1", "작가1"));
        bookList.add(new Book(2, "제목2", "작가2"));
        bookList.add(new Book(3, "제목3", "작가3"));
        bookList.add(new Book(4, "제목4", "작가4"));
        bookList.add(new Book(5, "제목5", "작가5"));
    }

    public void menu() {

        while (true) {
            System.out.println("===========================");
            System.out.println("OO도서관에 오신것을 환영합니다.");
            System.out.println("===========================");
            System.out.println("----------도서목록----------");
            System.out.println(toString());
            System.out.println("-----------MAIN-----------");
            System.out.println("1. 도서 대여");
            System.out.println("2. 도서 반납");
            System.out.println("3. 도서 등록");
            System.out.println("4. 도서 삭제");
            System.out.println("9. 프로그램 종료");
            System.out.println("--------------------------");
            int menuNum = scan.getInt("번호를 입력하세요.");

            switch (menuNum) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    System.out.println("이용해주셔서 감사합니다.");
                    System.exit(-1);
                    break;
                default:
                    System.out.println("잘못입력하였습니다.");
                    break;
            }

        }

    }

    @Override
    public String toString() {
        String str = "", rent = null;
        for(Book i : bookList){
            int bookNo = i.getNumber();
            String title = i.getTitle();
            String author = i.getAuthor();
            if (!i.isRent()) {
                rent = "가능";
            } else {
                rent = "불가능";
            }

            
            str += "No." + bookNo + " / 제목 : " + title + " / 작가 : " + author + " / 대여 :" + rent + "\n";
        }
        return str;
    }
    
}
