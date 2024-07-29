import Common.ScannerUtil;

public class Library {
    ScannerUtil scan = new ScannerUtil();

    public void menu() {

        while (true) {
            System.out.println("===========================");
            System.out.println("OO도서관에 오신것을 환영합니다.");
            System.out.println("===========================");
            System.out.println("----------도서목록----------");
            // 도서목록!
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
}
