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
        currentStation = currentStation >= 9 ? 0 : ++currentStation;
        setCurrentStation(currentStation);
    }

    public void prev() {
        currentStation = currentStation <= 0 ? 9 : --currentStation;
        setCurrentStation(currentStation);
    }

    public void nextVol() {
        currentVolume = currentVolume >= 100 ? 100 : ++currentVolume;
        setCurrentStation(currentVolume);
    }

    public void prevVol() {
        currentVolume = currentVolume <= 0 ? 0 : --currentVolume;
        setCurrentStation(currentVolume);
    }
}
