public class Radio {
    public int currentStation;
    public int currentVolume;


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
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        } else if (currentStation == 9) {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = 9;
        } else if (currentStation < 9) {
            currentStation = currentStation - 1;
        }
    }
}
