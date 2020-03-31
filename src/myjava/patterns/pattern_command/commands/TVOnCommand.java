package patterns.pattern_command.commands;

import patterns.pattern_command.controls.controllers.TV;

/**
 * @author rassoll
 * @created 05.06.2017
 * @$Author$
 * @$Revision$
 */
public class TVOnCommand implements Command
{
    private TV tv;

    public TVOnCommand(TV tv)
    {
        this.tv = tv;
    }

    @Override
    public void execute()
    {
        tv.on();
    }

    @Override
    public void undo()
    {
        tv.off();
    }
}
