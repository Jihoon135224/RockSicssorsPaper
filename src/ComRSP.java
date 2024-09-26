//컴퓨터 랜덤값
public class ComRSP {
	//가위 : 0 바위 : 1 보 : 2
	private int comRSP;
	private String comRSP2;
	private String comRSP3;
	
	public ComRSP() {
		comRSP = (int)(Math.random()*3);
		switch(comRSP) {
		case 0:
			comRSP2 = "가위";
			comRSP3 = "0";
		case 1:
			comRSP2 = "바위";
			comRSP3 = "1";
		case 2:
			comRSP2 = "보";
			comRSP3 = "2";
		}
	}

	public int getComRSP() {
		return comRSP;
	}

	public String getComRSP2() {
		return comRSP2;
	}
	public String getComRSP3() {
		return comRSP3;
	}
}
