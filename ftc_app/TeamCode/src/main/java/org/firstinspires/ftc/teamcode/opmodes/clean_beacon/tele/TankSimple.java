package org.firstinspires.ftc.teamcode.opmodes.clean_beacon.tele;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.config_formats.CleanBeacon;

/**
 * Created by asowd on 12/2/2016.
 */
@TeleOp(name = "runThis")
@Disabled
public class TankSimple extends CleanBeacon {
    public void runOpMode() throws InterruptedException {

        getConfig();
        arrangeHardware();
        waitForStart();
        runtime.reset();

        double launchPower = 0, launch_inc = 0;

        while (opModeIsActive()) {



            getTelemetry();

            DRIVE_LEFT.setPower((gamepad1.left_stick_y) * 0.5);
            DRIVE_RIGHT.setPower((gamepad1.right_stick_y) * 0.5);
            BUTTON_PUSHER.setPower(gamepad1.left_trigger * -1 + gamepad1.right_trigger);


            if (gamepad1.x)
                BUTTON_SELECTOR.setPosition(BUTTON_LEFT);
            else if (gamepad1.b)
                BUTTON_SELECTOR.setPosition(BUTTON_RIGHT);
            else
                BUTTON_SELECTOR.setPosition(BUTTON_NEUTRAL);


        }
    }
}
