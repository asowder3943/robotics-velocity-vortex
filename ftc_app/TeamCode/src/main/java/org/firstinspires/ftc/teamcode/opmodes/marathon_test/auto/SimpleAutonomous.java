package org.firstinspires.ftc.teamcode.opmodes.marathon_test.auto;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.config_formats.MarathonTest;

/**
 * Created by asowd on 12/10/2016.
 */

@Autonomous(name = "simpleAuto")
public class SimpleAutonomous extends MarathonTest {

    @Override
    public void runOpMode() throws InterruptedException {
        getConfig();
        arrangeHardware();
        waitForStart();
        if (opModeIsActive()){
            driveStraight(CRUISE_POWER,1000);
            turn(.1,45);
            turn(.1,-45);
            orientRobot(.1,180);
            driveToLine(.25);
        }
    }
}
