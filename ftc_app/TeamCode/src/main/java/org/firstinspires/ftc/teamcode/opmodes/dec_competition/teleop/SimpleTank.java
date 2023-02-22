package org.firstinspires.ftc.teamcode.opmodes.dec_competition.teleop;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.config_formats.dec_competition;

/**
 * Created by asowd on 11/23/2016.
 */

@TeleOp(name = "simpleTank")
@Disabled
public class SimpleTank extends dec_competition {
    public void runOpMode() {

        getConfig();
        arrangeHardware();
        waitForStart();
        runtime.reset();
        double gate_pos = 0, select_pos = 0;

        while (opModeIsActive()){

            getTelemetry();
            DRIVE_LEFT.setPower(gamepad1.left_stick_y);
            DRIVE_RIGHT.setPower(gamepad1.right_stick_y);

            BUTTON_PUSHER.setPower(gamepad1.left_stick_x);
            BUTTON_PUSHER.setPower(gamepad1.right_stick_x);

            if (gamepad1.x)
                gate_pos+=.1;
            if (gamepad1.b)
                gate_pos-=.1;

            if (gate_pos<0)
                gate_pos = 0;
            if (gate_pos>1)
                gate_pos = 1;
            BALL_GATE.setPosition(gate_pos);

            if (select_pos<0)
                select_pos = 0;
            if (select_pos>1)
                select_pos = 1;
            BUTTON_SELECTOR.setPosition(select_pos);
        }

    }
}
