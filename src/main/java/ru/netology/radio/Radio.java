package ru.netology.radio;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int minVolume = 0;
    private int maxVolume = 10;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minRadioStation) {
            // return;
            currentRadioStation = maxRadioStation;
        }
        if (currentRadioStation > maxRadioStation) {
            //return;
            currentRadioStation = minRadioStation;
        }
        this.currentRadioStation = currentRadioStation;

    }

    public void setNextRadioStation() {
        if (currentRadioStation < maxRadioStation) {
            this.currentRadioStation = currentRadioStation + 1;
        }
        // if (currentRadioStation >= maxRadioStation ) {
        // this.currentRadioStation = minRadioStation;
        // }
    }

    public int getNextRadioStation() {
        return currentRadioStation;
    }

    public void setPrevRadioStation() {

        int newStation = currentRadioStation - 1;
        this.currentRadioStation = newStation;

    }

    public int getPrevRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
        }
        this.currentVolume = currentVolume;
    }


    public void setIncreaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
        }
        this.currentVolume = currentVolume;
    }

    public int getIncreaseVolume() {
        return currentVolume;
    }

    public void setDecreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
        }
        this.currentVolume = currentVolume;
    }

    public int getDecreaseVolume() {
        return currentVolume;
    }

    public void setMaxVolume(int currentVolume) {
        if (currentVolume >= maxVolume) {
            this.currentVolume = maxVolume;
        }
        if (currentVolume < maxVolume) {
            this.currentVolume = currentVolume;
        }
    }

    public int getMaxVolume() {
        return currentVolume;
    }

    public void setMinVolume(int currentVolume) {
        if (currentVolume < 1) {
            this.currentVolume = minVolume;
        }
        if (currentVolume > 1) {
            this.currentVolume = currentVolume;
        }
    }

    public int getMinVolume() {

        return currentVolume;
    }
}
