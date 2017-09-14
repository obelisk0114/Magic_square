package checkSquare;

public class CheckValidity {
	private int length;
	private int maxNumber;
	
	public CheckValidity(int[][] table) {
		length = table.length;
		maxNumber = length * length;
	}
	
	public boolean checkRow(int[][] table) {
		double sum = length * (maxNumber + 1) / 2;
		for (int i = 0; i < length; i++) {
			double cul = 0;
			for (int j = 0; j < length; j++) {
				cul += table[i][j];
			}
			
			if (cul != sum)
				return false;
		}
		return true;
	}
	
	public boolean checkCol(int[][] table) {
		double sum = length * (maxNumber + 1) / 2;
		for (int i = 0; i < length; i++) {
			double cul = 0;
			for (int j = 0; j < length; j++) {
				cul += table[j][i];
			}
			
			if (cul != sum)
				return false;
		}
		return true;
	}
	
	public boolean checkDiagonal(int[][] table) {
		double sum = length * (maxNumber + 1) / 2;
		double cul = 0;
		for (int i = 0; i < length; i++) {
			cul += table[i][i];
		}
		if (cul != sum)
			return false;
		
		cul = 0;
		for (int j = 0; j < length; j++) {
			cul += table[j][length - 1 - j];
		}
		if (cul != sum)
			return false;
		
		return true;
	}
	
	public boolean checkTotal(int[][] table) {
		double cul = 0;
		double cul2 = 0;
		for (int i = 0; i < length; i++) {
			cul += table[i][i];
			cul2 += table[i][length - 1 - i];
		}
		
		if (cul != cul2)
			return false;
		double sum = cul;
		
		for (int i = 0; i < length; i++) {
			cul = 0;
			cul2 = 0;
			for (int j = 0; j < length; j++) {
				cul += table[i][j];
				cul2 += table[j][i];
			}
			
			if (cul != sum || cul2 != sum)
				return false;
		}
		return true;
	}

}
