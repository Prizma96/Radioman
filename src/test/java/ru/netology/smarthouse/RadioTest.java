package ru.netology.smarthouse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void shouldSetCurrentStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(5);

        assertEquals(5, rad.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentStation110() {
        Radio rad = new Radio();
        rad.setCurrentStation(110);

        assertEquals(110, rad.getCurrentStation());
    }

    @Test
    public void shouldGetNumberOfStations() {
        Radio rad = new Radio(15);

        assertEquals(15, rad.getNumberOfStations());
    }

    @Test
    public void shouldSetNumberOfStations() {
        Radio rad = new Radio ();
        rad.setNumberOfStations(15);

        assertEquals(15, rad.getNumberOfStations());
    }

    @Test
    public void shouldConstructorSetNumberOfStations() {
        Radio rad = new Radio (15);

        assertEquals(15, rad.getNumberOfStations());
    }

    @Test
    public void shouldSetNumberOfStationsLess10() {
        Radio rad = new Radio ();
        rad.setNumberOfStations(5);

        assertEquals(10, rad.getNumberOfStations());
    }

    @Test
    public void shouldConstructorSetNumberOfStationsLess10() {
        Radio rad = new Radio (5);

        assertEquals(10, rad.getNumberOfStations());
    }

    @Test
    public void shouldSetNumberOfStationsNegative() {
        Radio rad = new Radio ();
        rad.setNumberOfStations(-5);

        assertEquals(10, rad.getNumberOfStations());
    }

    @Test
    public void shouldConstructorSetNumberOfStationsNegative() {
        Radio rad = new Radio (-5);

        assertEquals(10, rad.getNumberOfStations());
    }

    @Test
    public void shouldSetNumberOfStations10() {
        Radio rad = new Radio ();
        rad.setNumberOfStations(10);

        assertEquals(10, rad.getNumberOfStations());
    }

    @Test
    public void shouldConstructorSetNumberOfStations10() {
        Radio rad = new Radio (10);

        assertEquals(10, rad.getNumberOfStations());
    }
    @Test
    public void shouldSetFactoryStation() {
        Radio rad = new Radio();

        assertEquals(9, rad.getMaxStation());
    }

    @Test
    public void shouldSetStationNegative() {
        Radio rad = new Radio();
        rad.setCurrentStation(-1);

        assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void shouldGetNextStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(5);

        rad.nextStation();

        assertEquals(6, rad.getCurrentStation());
    }

    @Test
    public void shouldGetNextStationFromMax() {
        Radio rad = new Radio(20);
        rad.setCurrentStation(rad.getMaxStation());

        rad.nextStation();

        assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void shouldGetPreviousStationFrom1() {
        Radio rad = new Radio();
        rad.setCurrentStation(1);

        rad.prevStation();

        assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void shouldGetPreviousStationFrom0() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);

        rad.prevStation();

        assertEquals(9, rad.getCurrentStation());
    }

    @Test
    public void shouldConstructorGetPreviousStationFrom0() {
        Radio rad = new Radio(13);
        rad.setCurrentStation(0);

        rad.prevStation();

        assertEquals(12, rad.getCurrentStation());
    }

    @Test
    public void shouldGetPreviousStationFromMax() {
        Radio rad = new Radio(20);

        rad.prevStation();

        assertEquals(19, rad.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(3);

        assertEquals(3, rad.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolumeBigNumber() {
        Radio rad = new Radio();
        rad.setCurrentVolume(1000);

        assertEquals(100, rad.getCurrentVolume());
    }

    @Test
    public void shouldGetVolumePlusOne() {
        Radio rad = new Radio();
        rad.setCurrentVolume(3);

        rad.plusVolume();

        assertEquals(4, rad.getCurrentVolume());
    }

    @Test
    public void shouldGetVolumePlusOneFrom100() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);

        rad.plusVolume();

        assertEquals(100, rad.getCurrentVolume());
    }

    @Test
    public void shouldGetVolumeMinusOne() {
        Radio rad = new Radio();
        rad.setCurrentVolume(3);

        rad.minusVolume();

        assertEquals(2, rad.getCurrentVolume());
    }

    @Test
    public void shouldGetVolumeMinusOneFrom0() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        rad.minusVolume();

        assertEquals(0, rad.getCurrentVolume());
    }

}