package org.firstinspires.ftc.teamcode.opmodes.dec_competition.auto.Testing;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.config_formats.dec_competition;

/**
 * Created by asowd on 11/29/2016.
 */

@Autonomous (name = "simpleAuto")
@Disabled
public class simpleAuto extends dec_competition  {
    public void runOpMode() {

        getConfig();
        arrangeHardware();
        waitForStart();
        runtime.reset();

        if (opModeIsActive()) {
                if (gamepad1.x)
                    driveDistance(1);
                if (gamepad1.b)
                    driveDistance(-1);
                if (gamepad1.a)
                    turn(45);
                if (gamepad1.y)
                    turn(-45);
            getTelemetry();
        }

    }
}
