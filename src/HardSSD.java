public class HardSSD {
    private int ssd;     //Объом памяти
    private int chapter; //Раздел

    public HardSSD(int ssd, int chapter) {
        this.ssd = ssd;
        this.chapter = chapter;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public int getChapter() {
        return chapter;
    }

    public void setChapter(int chapter) {
        this.chapter = chapter;
    }
}
