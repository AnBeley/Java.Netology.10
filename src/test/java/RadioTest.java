import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetStationZeroLimitFirst() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(9, radio.getMaxStation());
        Assertions.assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationZeroLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(9, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationNineLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(9, radio.getMaxStation());
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationNineLimitFirst() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(9, radio.getMaxStation());
        Assertions.assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(9, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(9, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetVolumeZeroLimitFirst() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        Assertions.assertEquals(0, radio.getMinVolume());
        Assertions.assertEquals(100, radio.getMaxVolume());
        Assertions.assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetVolumeZeroLimit() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        Assertions.assertEquals(0, radio.getMinVolume());
        Assertions.assertEquals(100, radio.getMaxVolume());
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetVolumeHundredLimit() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        Assertions.assertEquals(0, radio.getMinVolume());
        Assertions.assertEquals(100, radio.getMaxVolume());
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetVolumeHundredLimitFirst() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        Assertions.assertEquals(0, radio.getMinVolume());
        Assertions.assertEquals(100, radio.getMaxVolume());
        Assertions.assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetAboveMaxVol() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        Assertions.assertEquals(0, radio.getMinVolume());
        Assertions.assertEquals(100, radio.getMaxVolume());
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetBelowMinVol() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        Assertions.assertEquals(0, radio.getMinVolume());
        Assertions.assertEquals(100, radio.getMaxVolume());
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void next() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.next();

        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(9, radio.getMaxStation());
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void nextNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();

        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(9, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void prev() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);

        radio.prev();

        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(9, radio.getMaxStation());
        Assertions.assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void prevZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prev();

        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(9, radio.getMaxStation());
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void nextVol() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.nextVol();

        Assertions.assertEquals(0, radio.getMinVolume());
        Assertions.assertEquals(100, radio.getMaxVolume());
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void nextVolHundred() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.nextVol();

        Assertions.assertEquals(0, radio.getMinVolume());
        Assertions.assertEquals(100, radio.getMaxVolume());
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void prevVol() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        radio.prevVol();

        Assertions.assertEquals(0, radio.getMinVolume());
        Assertions.assertEquals(100, radio.getMaxVolume());
        Assertions.assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void prevZeroVol() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.prevVol();

        Assertions.assertEquals(0, radio.getMinVolume());
        Assertions.assertEquals(100, radio.getMaxVolume());
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetStationZeroLimitFirstSet() {
        Radio radio = new Radio(15);

        radio.setCurrentStation(1);

        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(14, radio.getMaxStation());
        Assertions.assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationZeroLimitSet() {
        Radio radio = new Radio(15);

        radio.setCurrentStation(0);

        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(14, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationFifteenLimitSet() {
        Radio radio = new Radio(15);

        radio.setCurrentStation(14);

        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(14, radio.getMaxStation());
        Assertions.assertEquals(14, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationFifteenLimitFirstSet() {
        Radio radio = new Radio(15);

        radio.setCurrentStation(13);

        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(14, radio.getMaxStation());
        Assertions.assertEquals(13, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetAboveMaxSet() {
        Radio radio = new Radio(15);

        radio.setCurrentStation(15);

        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(14, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetBelowMinSet() {
        Radio radio = new Radio(15);

        radio.setCurrentStation(-1);

        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(14, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void nextSet() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(8);

        radio.next();

        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(14, radio.getMaxStation());
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void nextFifteenSet() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(14);

        radio.next();

        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(14, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void prevSet() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(7);

        radio.prev();

        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(14, radio.getMaxStation());
        Assertions.assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void prevZeroSet() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(0);

        radio.prev();

        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(14, radio.getMaxStation());
        Assertions.assertEquals(14, radio.getCurrentStation());
    }

}
