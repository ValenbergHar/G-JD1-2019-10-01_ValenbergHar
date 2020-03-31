package patterns.pattern_command.commands;

import patterns.pattern_command.controls.controllers.Stereo;

/**
 * @author rassoll
 * @created 02.06.2017
 * @$Author$
 * @$Revision$
 */
public class StereoOffWithCDCommand implements Command
{
    Stereo stereo;

    public StereoOffWithCDCommand(Stereo stereo)
    {
        this.stereo = stereo;
    }

    @Override
    public void execute()
    {
        stereo.off();
    }

    @Override
    public void undo()
    {
        stereo.on();
    }
}
