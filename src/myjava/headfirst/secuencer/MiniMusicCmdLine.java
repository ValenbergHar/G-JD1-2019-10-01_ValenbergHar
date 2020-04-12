package headfirst.secuencer;

import javax.sound.midi.*;

public class MiniMusicCmdLine {
	public static void main(String[] args) {
		MiniMusicCmdLine mini = new MiniMusicCmdLine();

		int instrument = 102;
		int note = 60;
		mini.play(instrument, note);

	}

	public void play(int instrument, int note) {
		try {
			Sequencer sequencer = MidiSystem.getSequencer();
			sequencer.open();

			Sequence seq = new Sequence(Sequence.PPQ, 4);
			Track track = seq.createTrack();

			for (int i = 5; i < 64; i += 4) {
				track.add(makeEvent(144, 1, i, 100, i));
				track.add(makeEvent(128, 1, i, 100, i + 2));
			}

			sequencer.setSequence(seq);
			sequencer.setTempoInBPM(200);
			sequencer.start();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
		MidiEvent event = null;
		try {
			ShortMessage a = new ShortMessage();
			a.setMessage(comd, chan, one, two);
			event = new MidiEvent(a, tick);
		} catch (Exception e) {
		}
		return event;
	}
}
