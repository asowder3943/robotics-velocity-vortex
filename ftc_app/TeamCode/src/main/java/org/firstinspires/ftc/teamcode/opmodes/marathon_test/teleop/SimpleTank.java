package org.firstinspires.ftc.teamcode.opmodes.marathon_test.teleop;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.config_formats.MarathonTest;

/**
 * Created by asowd on 12/10/2016.
 */

@TeleOp(name = "MarathonSimpleTank")

public class SimpleTank extends MarathonTest {
    @Override
    public void runOpMode() throws InterruptedException {
        getConfig();
        arrangeHardware();
        waitForStart();

        while (opModeIsActive()){
            DRIVE_LEFT.setPower(-1*gamepad1.left_stick_y);
            DRIVE_RIGHT.setPower(-1*gamepad1.right_stick_y);

            BUTTON_PUSHER.setPower(gamepad1.right_trigger - gamepad1.left_trigger);

            if (gamepad1.x)
                chooseButton(Button.left);
            if (gamepad1.b)
                chooseButton(Button.right);


            getTelemetry();
        }

    }
}
