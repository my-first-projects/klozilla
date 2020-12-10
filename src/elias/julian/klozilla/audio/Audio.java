// Elias
package elias.julian.klozilla.audio;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

public class Audio {

	public static synchronized void playMusicInLoop(String track) {
		final String trackname = track;
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					try {
						Clip clip = AudioSystem.getClip();
						AudioInputStream inputstream = AudioSystem.getAudioInputStream(new File(trackname));
						clip.open(inputstream);
						FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
						gainControl.setValue((float) -30.0); // Reduce volume by 10 decibels.
						clip.loop(clip.LOOP_CONTINUOUSLY);
						Thread.sleep(clip.getMicrosecondLength() / 1000);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	}
	
	public static synchronized void playMusic(String track) {
		final String trackname = track;
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Clip clip = AudioSystem.getClip();
					AudioInputStream inputstream = AudioSystem.getAudioInputStream(new File(trackname));
					clip.open(inputstream);
					FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
					gainControl.setValue((float) -20.0); // Reduce volume by 10 decibels.
					clip.start();
					Thread.sleep(clip.getMicrosecondLength() / 1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}).start();
	}
	
	
	public static synchronized void playMusicAtFullVolume(String track) {
		final String trackname = track;
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Clip clip = AudioSystem.getClip();
					AudioInputStream inputstream = AudioSystem.getAudioInputStream(new File(trackname));
					clip.open(inputstream);
					clip.start();
					Thread.sleep(clip.getMicrosecondLength() / 1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}).start();
	}
	
	
	
}