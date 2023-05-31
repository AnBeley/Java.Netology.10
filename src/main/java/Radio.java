public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void next() {
        if (currentStation >= 9) {
            currentStation = 0;
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    public void prev() {
        if (currentStation <= 0) {
            currentStation = 9;
        } else {
            setCurrentStation(currentStation - 1);
        }
    }

    public void nextVol() {
        if (currentVolume >= 100) {
            currentVolume = 100;
        } else {
            setCurrentVolume(currentVolume + 1);
        }
    }

    public void prevVol() {
        if (currentVolume <= 0) {
            currentVolume = 0;
        } else {
            setCurrentVolume(currentVolume - 1);
        }
    }
}
