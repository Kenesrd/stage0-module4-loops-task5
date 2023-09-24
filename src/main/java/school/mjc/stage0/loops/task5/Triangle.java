package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        for (int x = 1; x <= cathetusLength; x++){
            for (int y = 1; y <= cathetusLength; y++){
                if (x < y){
                    System.out.print(" ");
                } else {
                    System.out.print(8);
                }
            }
            System.out.println();
        }
    }

}
