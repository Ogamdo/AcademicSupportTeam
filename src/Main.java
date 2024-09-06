import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("무엇을 도와드릴까요? 숫자로 입력해주세요. \n1. 휴학 2. 복학 3. 제적 4. 자퇴 5. 장학금과 생활비 대출\n");

        Scanner sc = new Scanner(System.in);
        int category;

        // 사용자 입력을 반복적으로 받기
        while (true) {
            try {
                category = sc.nextInt();
                if (category < 1 || category > 5) {
                    throw new IllegalArgumentException(); // 범위 체크
                }
                break; // 유효한 입력이면 반복 종료
            } catch (Exception e) {
                System.out.print("보기에 있는 '숫자'들만 입력해주세요 (1-5): ");
                sc.next(); // 잘못된 입력을 무시
            }
        }

        switch (category) {
            case 1:
                LeaveOfAbsence(); // 휴학 관련 안내
                break;
            case 2:
                ReturningToSchool(); // 복학 관련 안내
                break;
            case 3:
                Expulsion(); // 제적 관련 안내
                break;
            case 4:
                DropOut(); // 자퇴 관련 안내
                break;
            case 5:
                StudentWelfareTeam(); // 학생복지팀 관련 안내
                break;
            default:
                System.out.print("1이상 5이하의 정수만 입력해주세요");
        }

        sc.close(); // Scanner 자원 해제
    }

    // 휴학 관련 안내
    public static void LeaveOfAbsence() {
        System.out.println("휴학 관련 안내입니다.");
    }

    // 복학 관련 안내
    public static void ReturningToSchool() {
        System.out.println("복학 관련 안내입니다.");
    }

    // 제적 관련 안내
    public static void Expulsion() {
        System.out.println("등록금을 납부하지 않으면 제적 대상자가 됩니다. 제적대상 고지 기간에 연락을 받은 후 과사무실을 통해 휴학신청 등을 하시면 됩니다.");
    }

    // 자퇴 관련 안내
    public static void DropOut() {
        System.out.println("자퇴 관련 안내입니다.");
    }

    // 학생복지팀 관련 안내
    public static void StudentWelfareTeam() {
        System.out.println("장학금과 생활비 대출 관련 문의는 학생복지팀으로 연락해 주세요.");
    }
}
