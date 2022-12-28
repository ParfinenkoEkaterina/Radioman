package ru.netology;

public class Volume {
    private int currentVolume;
    private int maxVolume;

    public Volume() {
        maxVolume = 10;
    }

    public Volume(int volumeCount) {
        maxVolume = volumeCount - 1;
    }



    public void nextCurrentVolume() {
        if (currentVolume != maxVolume) {
            currentVolume++;
        } else {
            currentVolume = maxVolume;
        }

    }

    public void prevVolume() {
        if (currentVolume != 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}
