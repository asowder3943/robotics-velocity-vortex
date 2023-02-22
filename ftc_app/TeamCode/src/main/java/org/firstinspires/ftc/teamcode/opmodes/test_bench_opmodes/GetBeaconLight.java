package org.firstinspires.ftc.teamcode.opmodes.test_bench_opmodes;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.config_formats.TestBench;

/**
 * Created by asowd on 11/23/2016.
 */

@TeleOp(name = "BeaconLight", group = "TeleOp")
@Disabled
public class GetBeaconLight extends TestBench{
    public void runOpMode() throws InterruptedException{
        waitForStart();
        while (opModeIsActive()){
            telemetryDisplay();
            idle();
        }
    }
}
