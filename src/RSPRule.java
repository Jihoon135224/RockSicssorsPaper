//가위바위보 룰
public class RSPRule {
	//가위 : 0 바위 : 1 보 : 2
	private String comChoice;
	private String userChoice;
	
	public RSPRule(String comChoice, String userChoice) {
		this.comChoice = comChoice;
		this.userChoice = userChoice;
	}
	

	
	
	public static void result(String comChoice, String userChoice) {
		
		if(comChoice == userChoice) {
			System.out.println("무승부");
		}else if(userChoice == "0") { // 유저 가위
			if(comChoice == "1"){
				System.out.println("컴: 바위 유저: 가위, 패배");
			}else if(comChoice=="2"|| comChoice == "보"){
				System.out.println("컴: 보 유저: 가위, 승리");
			}
		}else if(userChoice == "1") { // 유저 바위
			if(comChoice == "2"){
				System.out.println("컴: 보 유저: 바위, 패배");
			}else if(comChoice=="0"|| comChoice == "가위"){
				System.out.println("컴: 가위 유저: 바위, 승리");
			}
		}else if(userChoice == "2") { // 유저 보
			if(comChoice == "0"){
				System.out.println("컴: 가위 유저: 보, 패배");
			}else if(comChoice=="1"|| comChoice == "바위"){
				System.out.println("컴: 바위 유저: 보, 승리");
			}
		}
	}
}
