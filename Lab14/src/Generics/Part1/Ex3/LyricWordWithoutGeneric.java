package Generics.Part1.Ex3;

import java.util.ArrayList;
import java.util.List;

public class LyricWordWithoutGeneric {
    private static final Word[] lyric = {
            new Word("you",1), new Word("say",2), new Word("it",3),
            new Word("best",4),new Word("when",5),new Word("you",6),
            new Word("say",7), new Word("nothing",8), new Word("at",9),
            new Word("all",10)};

    public static void main(String[] args) {
        List arrayList = new ArrayList();
        for (Word w : lyric)
            arrayList.add(w);
        for (Object o : lyric){
            Word w = (Word) o;
            System.out.print(w.getValue() + ", "+ w.getPosition());
        }
    }

}
