package org.firstinspires.ftc.teamcode.opmodes.test_bench_opmodes;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.config_formats.TestBench;

@TeleOp(name = "Test1", group = "TeOpmode")
@Disabled
public class Test1 extends TestBench{
    public void runOpMode() throws InterruptedException{
        waitForStart();
        while (opModeIsActive()){
            telemetryDisplay();
            MOTOR_1.setPower(gamepad1.left_stick_y);
            idle();
        }
    }
}
