package example.rule8.sample;

import java.time.LocalTime;
import java.util.List;

class WakeUpClock {

    List<Music> musics;

    List<AlermTime> alermTimes;

    LocalTime now;

    void alerm() throws InterruptedException {
        for (AlermTime alermTime : alermTimes) {
            if (alermTime.equals(now)) {
                for (Music music : musics) {
                    music.beep();
                    Thread.sleep(600);
                }
            }

        }
    }

}

class Music {
    void beep(){
        
    }

}

class AlermTime {

}
