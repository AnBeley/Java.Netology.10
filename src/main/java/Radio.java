public class Radio {
    private int maxStationDefault = 9;
    private int minStation = 0;
    private int maxStation;
    private int currentStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;

    public Radio(int size) {
        maxStation = (minStation + size) - 1;
    }

    public Radio() {
        maxStation = maxStationDefault;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void next() {
        if (currentStation >= maxStation) {
            currentStation = minStation;
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    public void prev() {
        if (currentStation <= minStation) {
            currentStation = maxStation;
        } else {
            setCurrentStation(currentStation - 1);
        }
    }

    public void nextVol() {
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
        } else {
            setCurrentVolume(currentVolume + 1);
        }
    }

    public void prevVol() {
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
        } else {
            setCurrentVolume(currentVolume - 1);
        }
    }
}
