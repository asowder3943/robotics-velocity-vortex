package org.firstinspires.ftc.teamcode.opmodes.clean_beacon.auto;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;

import org.firstinspires.ftc.teamcode.config_formats.CleanBeacon;

/**
 * Created by asowd on 12/3/2016.
 */
@Autonomous(name = "runAuto Red")
@Disabled
public class simpleAuto extends CleanBeacon {
    public void runOpMode() throws InterruptedException {

        getConfig();
        arrangeHardware();
        waitForStart();
        runtime.reset();

        double launchPower = 0, launch_inc = 0;

        if (opModeIsActive()) {
            setDrivePower(.2, 0);
            while (getRuntime() < 2){}
            stopRobot();
        }
    }

    }