package org.firstinspires.ftc.teamcode.opmodes.dec_competition.auto.blue;

import org.firstinspires.ftc.teamcode.config_formats.dec_competition;

/**
 * Created by asowd on 12/2/2016.
 */

public class bParkInCorner extends dec_competition {
    @Override
    public void runOpMode() {
        getConfig();
        arrangeHardware();
        waitForStart();
        runtime.reset();
        if (opModeIsActive()){
            turn(-45);
            driveDistance(CORNER_POS);
            turn(45);
            driveDistance(100);
        }

    }
}
