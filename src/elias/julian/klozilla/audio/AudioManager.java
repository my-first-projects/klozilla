package elias.julian.klozilla.audio;

import elias.julian.klozilla.main.Var;

public class AudioManager {
	
	public static void startBackgroundMusic() {
		if(!Var.musicIsPlaying) {
			Audio.playMusicInLoop("audio/track2.wav");
			Var.musicIsPlaying = true;
		}
	}
	
	public static void playAudioGameOver() {
		Audio.playMusic("audio/gameOver.wav");
	}
	
	public static void playAudioLevelUp() {
		Audio.playMusic("audio/levelUp.wav");
	}
	
	public static void playAudioStarting() {
		Audio.playMusic("audio/starting.wav");
	}
	
	public static void playAudioToiletPlopp() {
		Audio.playMusic("audio/toiletPlopp.wav");
	}
	
	public static void playAudioSlowDown() {
		Audio.playMusic("audio/slowDown.wav");
	}
	
	public static void playAudioSpeedUp() {
		Audio.playMusic("audio/speedUp.wav");
	}
	
	public static void playAudioBell() {
		Audio.playMusic("audio/bell.wav");
	}
	
	public static void playAudioJumpscare() {
		Audio.playMusicAtFullVolume("audio/jumpscare.wav");
	}
}
