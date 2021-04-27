package Lab4;

public class AudioBook extends BookDemo {
    protected boolean audio;

    public Boolean getAudioSetting() {
        return this.audio;
    }

    public void setAudioSetting(Boolean _Audio) {
        this.audio = _Audio;
    }

    public AudioBook(String author, int year, String title, Boolean audio) {
        super(title, year, author);
        this.setAudioSetting(audio);
    }

}
