package day55_abstraction.flags;

public class FlagDrawing {
    public static void main(String[] args) {
        RussianFlag russianFlag = new RussianFlag();
        russianFlag.draw();

        UkrainianFlag ukraine = new UkrainianFlag();
        ukraine.draw();

        FrenchFlag france = new FrenchFlag();
        france.draw();


    }
}
