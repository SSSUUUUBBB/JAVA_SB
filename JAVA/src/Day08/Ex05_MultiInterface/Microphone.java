package Day08.Ex05_MultiInterface;

public interface Microphone {

	int inputVoulmeMax = 50; // 음성 인식 최대 볼륨
	int inputVoulmeMin = 0; // 음석 인식 최소 볼륨
	
	// 음성 인식
	String receiveVoice(String voice);
	
}
