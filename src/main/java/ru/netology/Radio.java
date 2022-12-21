package ru.netology;

public class Radio {

    private int currentRadioStation;
    private int currentVolume;

    public void next() {
        if (currentRadioStation != 9) {
            currentRadioStation++;
        } else {
           currentRadioStation = 0;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation != 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = 9;
        }
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void nextCurrentVolume() {
        if (currentVolume != 10) {
            currentVolume++;
        } else {
            currentVolume = 0;
        }

    }

    public void prevVolume() {
        if (currentVolume != 0) {
            currentVolume--;
        } else {
            currentVolume = 10;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}
