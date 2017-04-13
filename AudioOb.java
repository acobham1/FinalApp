package alea.aleac.finalapp;

import alea.aleac.finalapp.audio.BaseAudioOb;

/**
 * Created by aleac on 4/11/2017.
 */

public class AudioOb extends BaseAudioOb {
    private String name;
    private String size;
    private String duration;
    private String info;
    private String iconUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
