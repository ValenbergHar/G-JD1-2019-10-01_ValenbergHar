package patterns.pattern_command.commands;

import patterns.pattern_command.controls.controllers.CeilingFan;

/**
 * @author rassoll
 * @created 05.06.2017
 * @$Author$
 * @$Revision$
 */
public class CeilingFunLowCommand extends CeilingFunBase
{
    public CeilingFunLowCommand(CeilingFan ceilingFan)
    {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute()
    {
        super.execute();
        ceilingFan.high();
    }
}
