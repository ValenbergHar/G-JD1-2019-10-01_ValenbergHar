package patterns.pattern_command.commands;

import patterns.pattern_command.controls.controllers.CeilingFan;

/**
 * @author rassoll
 * @created 02.06.2017
 * @$Author$
 * @$Revision$
 */
public class CeilingFanMediumCommand extends CeilingFunBase
{
    public CeilingFanMediumCommand(CeilingFan ceilingFan)
    {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute()
    {
        super.execute();
        ceilingFan.medium();
    }
}
