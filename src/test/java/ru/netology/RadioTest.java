package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStation() {
        Radio radio = new Radio();

        int[] station = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int expectedCurrentStation = 0;
        int actual = radio.nextRadioStation(station);

        Assertions.assertEquals(expectedCurrentStation, actual);

    }

    @Test
    public void shouldSetPrevRadioStation() {
        Radio radio = new Radio();

        int[] station = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int expectedPrevStation = 9;
        int actual = radio.prevRadioStation(station);

        Assertions.assertEquals(expectedPrevStation, actual);
    }

    @Test
    public void shouldSetSoundVolume() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(10);

        int expected = 10;
        int actual = radio.currentSoundVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxSound() {
        Radio radio = new Radio();

        radio.setToMaxSound();

        int expected = 10;
        int actual = radio.currentSoundVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(10);

        int expected = 10;
        int actual = radio.currentSoundVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.currentSoundVolume = 0;

        int expected = 0;
        int actual = radio.currentSoundVolume;

        Assertions.assertEquals(expected, actual);
    }


}
