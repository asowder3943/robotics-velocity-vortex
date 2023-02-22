package org.firstinspires.ftc.teamcode.opmodes.dec_competition.auto.neutral;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;

import org.firstinspires.ftc.teamcode.config_formats.dec_competition;

/**
 * Created by asowd on 12/2/2016.
 */
@Autonomous(name = "ballAndStop", group="neutral")
@Disabled
public class BallAndStop extends dec_competition {
    @Override
    public void runOpMode() {
        getConfig();
        arrangeHardware();
        waitForStart();
        runtime.reset();
        if (opModeIsActive()){
            knockOffBall();
        }

    }
}
