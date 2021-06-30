package excercise;

public class WhileNumberPlayer {
	private int number;
	
	WhileNumberPlayer(int i) {
		this.number = i;
		System.out.println(this.number);
	}
	
	public void printSquaresUptoLimit() {
		int number = 0;
		
		int squareNum = 1;
		while (number < 30) {
			System.out.print(squareNum * squareNum + " ");
			squareNum ++;
			number = squareNum * squareNum;
			}
		}
	
	public void printCubesUptoLimit() {
		int number = 0;
		System.out.println("");
		int squareNum = 1;
		while (number < 30) {
			System.out.print(squareNum * squareNum * squareNum + " ");
			squareNum ++;
			number = squareNum * squareNum * squareNum;
		     }
	   }

	};