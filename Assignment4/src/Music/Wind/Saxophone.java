package Music.Wind;

import Music.Playable;

public class Saxophone implements Playable {
    @Override
    public void play() {
        System.out.println("Saxophone");
    }
    public void display(){
        System.out.println("sax");
    }
}
