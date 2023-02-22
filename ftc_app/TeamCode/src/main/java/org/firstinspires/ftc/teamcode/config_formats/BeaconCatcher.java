package org.firstinspires.ftc.teamcode.config_formats;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * Created by asowd on 11/23/2016.
 */
@TeleOp(name = "BEACON_LIGHT")
public class BeaconCatcher extends LinearOpMode {

    protected ColorSensor COLOR_LEFT;
    protected ColorSensor COLOR_RIGHT;

    protected ElapsedTime runtime = new ElapsedTime();

    protected void getTelemetry(){
        telemetry.addData("COLOR_LEFT", COLOR_LEFT.argb());
        telemetry.addData("COLOR_RIGHT", COLOR_RIGHT.argb());
        telemetry.update();
    }


    @Override
    public void runOpMode() throws InterruptedException{
        COLOR_LEFT = hardwareMap.colorSensor.get("COLOR_LEFT");
        COLOR_RIGHT = hardwareMap.colorSensor.get("COLOR_RIGHT");
        waitForStart();

        runtime.reset();
        while (opModeIsActive()){
            getTelemetry();
            idle();
        }

    }

}
