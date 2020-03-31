package patterns.pattern_command.commands;

import patterns.pattern_command.controls.controllers.CeilingFan;

/**
 * @author rassoll
 * @created 02.06.2017
 * @$Author$
 * @$Revision$
 */
public class CeilingFanHighCommand extends CeilingFunBase
{
    public CeilingFanHighCommand(CeilingFan ceilingFan)
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
