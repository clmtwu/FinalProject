import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
public class sound {



	public static void RunMusic(String path) throws LineUnavailableException {
		try {
			AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File(path));
			Clip clip = AudioSystem.getClip();
			clip.open(inputStream);
			clip.loop(0);
			clip.start();
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	public static void stopMusic(){
		
	}
	
	public static void main (String[] args) throws LineUnavailableException {
		
		File file = new File("windows10.wav");
		
		try {
			AudioInputStream input = AudioSystem.getAudioInputStream(file);
			Clip clip = AudioSystem.getClip();
			clip.open(input);
			clip.start();
			
		} catch (UnsupportedAudioFileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
