package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    void shouldSetCurrentRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentRadioStationOver9() {
        Radio radio = new Radio();

        //radio.minRadioStation(10);
        radio.setCurrentRadioStation(10);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentRadioStationUnder0() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);

        //int expected = 0;
        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetNextRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);
        radio.setNextRadioStation();

        int expected = 9;
        int actual = radio.getNextRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetNextRadioStation9() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);
        radio.setNextRadioStation();

        int expected = 9;
        int actual = radio.getNextRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetPrevRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(6);
        radio.setPrevRadioStation();

        int expected = 5;
        int actual = radio.getPrevRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(4);

        int expected = 4;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolumeOver10() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolumeUnder0() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }


    @Test
    void shouldSetIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(3);
        radio.setIncreaseVolume();

        int expected = 4;
        int actual = radio.getIncreaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetIncreaseVolumeOver10() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);
        radio.setIncreaseVolume();

        int expected = 10;
        int actual = radio.getIncreaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(8);
        radio.setDecreaseVolume();

        int expected = 7;
        int actual = radio.getDecreaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetDecreaseVolumeUnder0() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);
        radio.setDecreaseVolume();

        int expected = 0;
        int actual = radio.getDecreaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetMaxVolume() {
        Radio radio = new Radio();

        radio.setMaxVolume(11);

        int expected = 10;
        int actual = radio.getMaxVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetMaxVolumeUnder10() {
        Radio radio = new Radio();

        radio.setMaxVolume(9);

        int expected = 9;
        int actual = radio.getMaxVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetMinVolume() {
        Radio radio = new Radio();

        radio.setMinVolume(0);

        int expected = 0;
        int actual = radio.getMinVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetMinVolumeOver1() {
        Radio radio = new Radio();

        radio.setMinVolume(2);

        int expected = 2;
        int actual = radio.getMinVolume();

        assertEquals(expected, actual);
    }

}