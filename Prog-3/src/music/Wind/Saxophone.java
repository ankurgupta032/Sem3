package music.Wind;

import music.Playable;

public class Saxophone implements Playable {

    @Override
    public void play() {
        System.out.println("Saxophone");
    }
    public void display(){
        System.out.println("Sax");
    }
}
