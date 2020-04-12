package headfirst.secuencer;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.*;

public class MusicTest {

	public static void main(String[] args) {
		MusicTest musicTest = new MusicTest();
		musicTest.play();
	}

	public void play() {

		try {
			Sequencer player  = MidiSystem.getSequencer();
			player.open();
			Sequence seq = new Sequence(Sequence.PPQ, 4);
			Track track = seq.createTrack();

			ShortMessage a = new ShortMessage();
			a.setMessage(192, 1, 102, 100);
			MidiEvent noteOn = new MidiEvent(a, 1);
			track.add(noteOn);

			ShortMessage b = new ShortMessage();
			a.setMessage(128, 1, 44, 100);
			MidiEvent noteOff = new MidiEvent(b, 3);
			track.add(noteOff);
			
			player.setSequence(seq);
			player.start();
			
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
