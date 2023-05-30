import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {
    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();


        radio.setCurrentStation(10);


        int expected = 0;
        int actual = radio.getCurrentStation();


        Assertions.assertEquals(expected, actual);
    }

   // @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();


        radio.setCurrentVolume(10);


        int expected = 10;
        int actual = radio.getCurrentVolume();


        Assertions.assertEquals(expected, actual);
    }


    //@Test
    public void shouldNotSetAboveMax() {
        Radio radio = new Radio();


        radio.currentStation = 10;


        int expected = 0;
        int actual = radio.getCurrentStation();


        Assertions.assertEquals(expected, actual);
    }

    //@Test
    public void shouldNotSetAboveMaxVol() {
        Radio radio = new Radio();


        radio.currentVolume = 100;


        int expected = 0;
        int actual = radio.getCurrentVolume();


        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void next() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);


        radio.next();


        int expected = 0;
        int actual = radio.getCurrentStation();


        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void prev() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);


        radio.prev();


        int expected = 6;
        int actual = radio.getCurrentStation();


        Assertions.assertEquals(expected, actual);
    }
}
