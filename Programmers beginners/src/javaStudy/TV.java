package javaStudy;

public interface TV {
	public int MIN_VOLUME=0;	//상수선언
	public int MAX_VOLUME=100; // 상수선언
	
	public void turnOn(); 
	public void turnOff(); 
	public void changeVolume(int volume);
	public void changeChannel(int channel);
	
}
