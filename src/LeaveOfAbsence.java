import java.sql.Array;

public class LeaveOfAbsence {
    String[] absQuestions;
    public LeaveOfAbsence(){
        absQuestions = new String[10];
        absQuestions[0] = "입대하시나요?";
        absQuestions[1] = "4주 이상의 입원치료 등을 받아야 하나요?";
        absQuestions[2] ="등록금을 납부하셨나요?";
    }


    public String callQuestions(int i){
        this.i = i;
        return absQuestions[i];

    }


}
