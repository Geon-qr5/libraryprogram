package old02;

import java.util.ArrayList;
import java.util.List;

import old02.common.ScannerUtil;

public class Library {
    ScannerUtil scan = new ScannerUtil();
    List<Book> book = new ArrayList<Book>();

    /**
     * 메인 메뉴
     */
    public void mainMenu() {
        while (true) {
            System.out.println("===========================");
            System.out.println("OO도서관에 오신것을 환영합니다.");
            System.out.println("===========================");
            System.out.println("-----------MAIN-----------");
            System.out.println("1. 도서 관리");
            System.out.println("2. 사용자 관리");
            System.out.println("9. 프로그램 종료");
            System.out.println("--------------------------");
            int menuNum = scan.getInt("번호를 입력하세요.");

            switch (menuNum) {
                case 1:
                    bookMenu();
                    break;
                case 2: // 미완성 - 멤버메뉴 구성
                    memberMenu();
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

    /**
     * 도서 관리 메뉴
     */
    public void bookMenu() {
        while (true) {
            System.out.println("----------도서목록----------");
            System.out.println(toString());
            System.out.println("-----------BOOK-----------");
            System.out.println("1. 도서 대여");
            System.out.println("2. 도서 반납");
            System.out.println("3. 도서 등록");
            System.out.println("4. 도서 삭제");
            System.out.println("5. 도서 조회");
            System.out.println("6. 메인 메뉴");
            System.out.println("9. 프로그램 종료");
            System.out.println("--------------------------");
            int menuNum = scan.getInt("번호를 입력하세요.");

            switch (menuNum) {
                case 1: // 미완성 - 도서대여
                    bookRent();
                    break;
                case 2: // 미완성 - 도서반납
                    bookReturn();
                    break;
                case 3: // 미완성 - 도서추가
                    bookAdd();
                    break;
                case 4: // 미완성 - 도서삭제
                    bookDelete();
                    break;
                case 5: // 미완성 - 도서조회
                    bookCheck();
                    break;
                case 6:
                    mainMenu();
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
    
    /**
     * 사용자 관리 메뉴
     */
    public void memberMenu() {
        
    }
    
    /**
     * 도서대여
     */
    private void bookRent() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'bookRent'");
    }
    
    /**
     * 도서반납
     */
    private void bookReturn() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'bookReturn'");
    }
    
    /**
     * 도서추가
     */
    private void bookAdd() {

    }
    
    /**
     * 도서삭제
     */
    private void bookDelete() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'bookDelete'");
    }
    
    /**
     * 도서조회
     */
        private void bookCheck() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'bookCheck'");
        }
}
