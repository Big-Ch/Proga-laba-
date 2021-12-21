package lab3.Characters;

public class MyOpinionPrinter implements OpinionPrinter{
    @Override
    public void print(Character.Mind mind, String s, boolean flag, Object o) {
        System.out.println(mind.MakeOpinion(s, flag, o).sound());
    }
}
