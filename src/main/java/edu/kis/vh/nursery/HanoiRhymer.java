package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}
// w tym pliku były 4 źle sformatowane linie kodu
// alt + -> oraz alt + <- na urządzeniu z systemem OSX, w IDE Visual Studio Code przechodzi do początku kolejnego lub poprzedniego słowa