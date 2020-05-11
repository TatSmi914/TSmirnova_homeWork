package tSmirnova_hW05_all.CallBack;

public class Timer {
    ITimer time;

    Timer (ITimer action){
        this.time = action;
    }
    public void timeRemain() {
        time.executeTimer();
    }
}