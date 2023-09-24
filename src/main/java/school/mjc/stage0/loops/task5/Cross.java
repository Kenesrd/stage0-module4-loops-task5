package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        for (int x = 1; x <= sideLength; x++){
            for (int y = 1; y <= sideLength; y++){
                if (x != sideLength / 2+1 && y != sideLength / 2+1){
                    System.out.print(" ");
                } else {
                    System.out.print(8);
                }
            }
            System.out.println();
        }
    }

}
