/*
 * 가위바위보 게임 : 이 클래스에서 시작을 하고, 3개 이상의 클래스를 정의해서 완성하기.
 * 
 * 게임 룰 : 게임 시작 출력후 Id(Email) 및 password 를 입력하라고 한 뒤, 본인의 email 과 password 가 아니라면 메세지와 함께 종료. // 클래스 하나 생성
 * 인증이 되었을 시, 기존 룰대로 입력을 받고(가위 ,바위 ,보) 컴퓨터의 랜덤한 입력값과 승부 후 결과를 출력.(ex > 컴 : 가위, 나 : 보 컴 승리)
 * 이후 계속 할건지에 대한 질문을 출력하고 y/n 으로 결정 
 * 게임이 끝나면 총 전적과 승률을 출력시키고 게임 종료
 */
//메인
import java.util.Scanner;

public class RockSicsissorsPaper {
	
	private static int userCount = 0;
	private static RSPAccount account[] = new RSPAccount[10];
	private static Scanner sc = new Scanner(System.in);
	private static String inputId; 
	private static String inputPw;
	
	
	public static void main(String[] args) {
		System.out.println("1.회원가입 | 2. 로그인 (숫자만)");
		String logCheck = sc.nextLine();
		if(logCheck == "1") { //회원가입
			if(userCount >10) {
				System.out.println("유저가 최대치");

			}else {
				System.out.println("Id(email) 입력하시오");
				inputId = sc.next(); account[userCount].setEmail(inputId);
				System.out.println("Password 입력하시오");
				inputPw = sc.next(); account[userCount].setEmail(inputPw);
				
				userCount++;
			}
				
		}else if(logCheck == "2") { //로그인
			int inCheck = 0;
			
			System.out.println("Id(email)을 입력하시오.");
			inputId = sc.nextLine();
			System.out.println("Password을 입력하시오.");
			inputPw = sc.nextLine();
			for(int i = 0; i<account.length; i++) {
				if(inputId.equals(account[i].getEmail())) {
					if(inputPw.equals(account[i].getPasswd())){
						System.out.println("로그인 성공");
						inCheck = 1;
						break;
					}else {
						System.out.println("비밀번호가 틀립니다.");
					}
				}else {
					System.out.println("아이디가 없습니다.");
				}
			}
			if(inCheck == 0) {
				System.out.println("로그인실패");
			}
		}
		
		System.out.println("가위바위보 게임을 시작합니다.");
		
		
		boolean gameRun = true; //반복문 변수 
		while(gameRun) {
			ComRSP cChoice = new ComRSP();
			
			
			System.out.println("가위(0), 바위(1), 보(2) 중 하나를 입력해 주세요");
			String userChoice = sc.nextLine();
			if(checkValue(userChoice)) {
				userChoice = convertUserChoice(userChoice);
				String comChoice1 = cChoice.getComRSP3(); // 0,1,2 문자열로 받아옴
				String comChoice2 = cChoice.getComRSP2(); // 가위 바위 보 문자열 받아옴
				RSPRule.result(userChoice, comChoice1); // 결과
				
				System.out.println("다시 하시겠습니까? (y/n)"); 
				while(true) {
					String replay = sc.nextLine();
					if(replay.equals("n")) {
						System.out.println("게임 종료");
						gameRun = false;
						break;
					}else if(replay.equals("y")) {
						System.out.println("게임을 다시 시작합니다.");
						break;
					}else {
						System.out.println("잘못된 값입니다 다시 입력하세요 (y/n)");
					}
				}
			}else {
				System.out.println("다시 입력하시오");
			}
			

			
		}
	}
	private static String convertUserChoice(String userChoice) {
		if(userChoice=="가위") {
			userChoice="0";
		}else if(userChoice=="바위") {
			userChoice="1";
		}else if(userChoice=="보") {
			userChoice="2";
		}
		return userChoice;
	}
	public static boolean checkValue(String userChoice) {
		switch(userChoice) {
		case "가위":
		case "0":
		case "바위":
		case "1":
		case "보":
		case "2":
			return true;
		default:
			return false;
		}
	}
}
