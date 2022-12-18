package ru.netology;

public class Radio {

    public int currentRadioStation;

    public int nextRadioStation(int[] station) {
        int currentStation = currentRadioStation;
        for (int i = 0; i < station.length; i++) {
            if (station[i] < station[currentStation]) {
                currentStation = i;
            }
        }
        return currentStation;
    }

    public int prevRadioStation(int[] station) {
        int currentStation = 0;
        for (int i = 0; i < station.length; i++) {
            if (station[i] > station[currentStation]) {
                currentStation = i;
            }
        }
        return currentStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public int currentSoundVolume;

    public void setToMaxSound() {
        currentSoundVolume = 10;
    }

    public void setToMinSound() {
        currentSoundVolume = 0;
    }

    public void increaseVolume() {
        if (currentSoundVolume < 10) {
            currentSoundVolume = currentSoundVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentSoundVolume < 0) {
            currentSoundVolume = currentSoundVolume + 1;
        }
    }

    public void setCurrentSoundVolume(int newCurrentSoundVolume) {
        if (newCurrentSoundVolume < 0) {
            return;
        }
        if (newCurrentSoundVolume > 10) {
            return;
        }
        currentSoundVolume = newCurrentSoundVolume;
    }







}
