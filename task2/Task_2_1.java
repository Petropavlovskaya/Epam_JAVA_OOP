package by.epam.petropavlovskaya.task2;

public class Task_2_1 {
	static int mas[][] = {{1,2}, {4,-1}, {-3,-2}};
	static int minX=0, maxX=0, minY=0, maxY=0, avX=0, avY=0;
	//static int mas[][] = {{-3,-3}, {-2,-2}, {1,1}}; 	// наклонная прямая
	//static int mas[][] = {{-2,2}, {1,2}, {3,2}};		// горизонтальная
	//static int mas[][] = {{2,1}, {2,-1}, {2,-3}};		// вертикальная
	//static int mas[][] = {{2,2}, {4,-1}, {-3,-2}};		// обычный треугольник


	static float side1, side2, side3;

	public static void main(String[] args) {
		int a = checkIsTriangle(mas);
		if(a == 0)
			System.out.println("This is a line");
		else
			isRightTriangle(maxX, maxY, minX, minY, avX, avY);
	}

	static int checkIsTriangle(int m[][]){
		boolean x, y;
		y = (m[0][1] == m[1][1] & m[2][1] == m[1][1]); 	// Если у1=у2=у3 - это вертикальная линия
		x = (m[0][0] == m[1][0] & m[2][0] == m[1][0]);	// Если x1=x2=x3 - это горизонтальная линия
		if(x || y)
			return 0;

		// Определяем бОльшую, меньшую и среднюю точки. Проверяем на возмужную наклонную линию.
		for(int i=0 ; i<3; i++) {
			if(mas[i][0]>maxX) {
				maxX = mas[i][0];
				maxY = mas[i][1];
			}
			if(mas[i][0]<minX) {
				minX = mas[i][0];
				minY = mas[i][1];
			}
		}

		for(int i=0 ; i<3; i++) {
			if((mas[i][0] != maxX && mas[i][1] != maxY) & (mas[i][0] != minX && mas[i][1] != minY)) {
				avX = mas[i][0];
				avY = mas[i][1];
			}
		}

		float a=(float)(maxX-minX)/(maxY-minY);
		if(avX == a*avY)
			return 0;

		return 1;
	}


	static void isRightTriangle(int maxX, int maxY, int minX, int minY, int avX, int avY){
		int bigSide = (int) Math.pow(maxX-minX, 2) + (int) Math.pow(maxY-minY, 2);
		int shortSide1 = (int) Math.pow(maxX-avX, 2) + (int) Math.pow(maxY-avY, 2);
		int shortSide2 = (int) Math.pow(minX-avX, 2) + (int) Math.pow(minY-avY, 2);
		if (bigSide == shortSide1+shortSide2)
			System.out.println("This is a right triangle");
		else
			System.out.println("This is a usual triangle");
	}


}
