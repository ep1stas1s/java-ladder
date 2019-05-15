package ladder.view;

import java.util.Scanner;

public class InputView {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static String inputNames(){
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
        try{
            return SCANNER.nextLine();
        }catch (Exception e){
            return inputNames();
        }
    }

    public static int inputHeight(){
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        try{
            return SCANNER.nextInt();
        }catch (Exception e){
            return inputHeight();
        }
    }
}
