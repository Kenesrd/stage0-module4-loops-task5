package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        for (int x = 1; x <= sideLength; x++){
            for (int y = 1; y <= sideLength; y++){
                if (x != 1 && x != sideLength && y != 1 && y != sideLength){
                    System.out.print(" ");
                } else {
                    System.out.print(8);
                }
            }
            System.out.println();
        }

    }
}
