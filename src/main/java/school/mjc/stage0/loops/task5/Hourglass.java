package school.mjc.stage0.loops.task5;

public class Hourglass {
    private int addEmptyField = 1;
    private int minusEmptyField = 0;
    private int drawingEight;
    private int drawEightSecondHalf = 0;
    private boolean evenOrOdd;

    public void printHourglassOfGivenSize(int height) {
        drawingEight = height;
        evenOrOdd = (height % 2 == 0);

        for (int i = 1; i <= height; i++){
            conditions(i, height);
            System.out.println();
        }
    }

    private void conditions(int i, int height){
        if (i > 1 && i < height){
            if (addEmptyField <= drawingEight/2 + 1){
                drawingEight -= 2;
                drawEightSecondHalf = drawingEight;
                emptyField(addEmptyField);
                eightField(drawingEight);
                emptyField(addEmptyField);
                minusEmptyField = addEmptyField++;
            } else if(evenOrOdd) {
                emptyField(minusEmptyField);
                eightField(drawEightSecondHalf);
                emptyField(minusEmptyField);
                evenOrOdd = false;
            } else {
                minusEmptyField--;
                drawEightSecondHalf += 2;
                emptyField(minusEmptyField);
                eightField(drawEightSecondHalf);
                emptyField(minusEmptyField);
            }
        } else {
            for (int j = 1; j <= height; j++){
                System.out.print(8);
            }
        }
    }

    private void emptyField(int width){
        for (int j = 1; j <= width; j++){
            System.out.print(" ");
        }
    }
    private void eightField(int width){
        for (int j = 1; j <= width; j++){
            System.out.print(8);
        }
    }
}
