package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void test() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(7);

        int expected = 7;
        int actual = radio.getCurrentRadioStation();


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNew() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNewSecond() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();


        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void actualNextRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);

        radio.next();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void oneNextRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.next();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldPrevRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.prevRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void givePrevRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(7);

        radio.prevRadioStation();

        int expected = 6;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void newPrevRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.prevRadioStation();

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void oneMorePrevRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);

        radio.prevRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testVolume() {
        Volume volume = new Volume();

        volume.setCurrentVolume(7);

        int expected = 7;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeNew() {
        Volume volume = new Volume();

        volume.setCurrentVolume(-1);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeNewSecond() {
        Volume volume = new Volume();

        volume.setCurrentVolume(11);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextCurrentVolume() {
        Volume volume = new Volume();

        volume.setCurrentVolume(3);

        volume.nextCurrentVolume();

        int expected = 4;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldGiveCurrentVolume() {
        Volume volume = new Volume();

        volume.setCurrentVolume(10);

        volume.nextCurrentVolume();

        int expected = 10;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGiveVolume() {
        Volume volume = new Volume();
        volume.setCurrentVolume(9);

        volume.nextCurrentVolume();

        int expected = 10;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void firstCurrentVolume() {
        Volume volume = new Volume();
        volume.setCurrentVolume(0);

        volume.nextCurrentVolume();

        int expected = 1;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevVolume() {
        Volume volume = new Volume();
        volume.setCurrentVolume(0);

        volume.prevVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void givePrevVolume() {
        Volume volume = new Volume();
        volume.setCurrentVolume(8);

        volume.prevVolume();

        int expected = 7;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void newPrevVolume() {
        Volume volume = new Volume();
        volume.setCurrentVolume(10);

        volume.prevVolume();

        int expected = 9;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void firstPrevVolume() {
        Volume volume = new Volume();
        volume.setCurrentVolume(1);

        volume.prevVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testInRange() {
        Radio radio = new Radio(30);

        radio.setCurrentRadioStation(25);

        int actual = radio.getCurrentRadioStation();
        int expected = 25;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testOutOfRange() {
        Radio radio = new Radio(30);

        radio.setCurrentRadioStation(35);

        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMaxLimit() {
        Radio radio = new Radio(30);

        radio.setCurrentRadioStation(29);

        int actual = radio.getCurrentRadioStation();
        int expected = 29;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMinLimit() {
        Radio radio = new Radio(30);

        radio.setCurrentRadioStation(0);

        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testVolumeInRange() {
        Volume volume = new Volume(100);

        volume.setCurrentVolume(65);

        int actual = volume.getCurrentVolume();
        int expected = 65;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testVolumeOutOfRange() {
        Volume volume = new Volume(100);

        volume.setCurrentVolume(150);

        int actual = volume.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeMaxLimit() {
        Volume volume = new Volume(100);

        volume.setCurrentVolume(99);

        int actual = volume.getCurrentVolume();
        int expected = 99;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeMinLimit() {
        Volume volume = new Volume(100);

        volume.setCurrentVolume(0);

        int actual = volume.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}
