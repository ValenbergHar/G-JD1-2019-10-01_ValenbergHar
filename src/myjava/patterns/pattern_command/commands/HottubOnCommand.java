package patterns.pattern_command.commands;

import patterns.pattern_command.controls.controllers.Hottub;

/**
 * @author rassoll
 * @created 05.06.2017
 * @$Author$
 * @$Revision$
 */
public class HottubOnCommand implements Command
{
    private Hottub hottub;

    public HottubOnCommand(Hottub hottub)
    {
        this.hottub = hottub;
    }

    @Override
    public void execute()
    {
        hottub.on();
    }

    @Override
    public void undo()
    {
        hottub.off();
    }
}
