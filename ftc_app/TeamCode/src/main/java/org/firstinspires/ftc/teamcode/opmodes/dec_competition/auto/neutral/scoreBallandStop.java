package org.firstinspires.ftc.teamcode.opmodes.dec_competition.auto.neutral;

import org.firstinspires.ftc.teamcode.config_formats.dec_competition;

/**
 * Created by asowd on 12/2/2016.
 */

public class scoreBallandStop extends dec_competition {
    @Override
    public void runOpMode() {
        getConfig();
        arrangeHardware();
        waitForStart();
        runtime.reset();
        if (opModeIsActive()){
            scoreParticle();
            knockOffBall();
        }

    }
}
