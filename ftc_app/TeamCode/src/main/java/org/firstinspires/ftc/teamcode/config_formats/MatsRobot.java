package org.firstinspires.ftc.teamcode.config_formats;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.GyroSensor;
import com.qualcomm.robotcore.hardware.IrSeekerSensor;
import com.qualcomm.robotcore.hardware.OpticalDistanceSensor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.TouchSensor;

/**
 * Created by asowd on 11/16/2016.
 */

public class MatsRobot extends LinearOpMode{
    protected DcMotor MOTOR_LEFT = hardwareMap.dcMotor.get("MOTOR_LEFT");
    protected DcMotor MOTOR_RIGHT = hardwareMap.dcMotor.get("MOTOR_RIGHT");
    protected Servo BEACON_PUSH = hardwareMap.servo.get("BEACON_PUSH");

    protected ColorSensor BEACON_LEFT = hardwareMap.colorSensor.get("BEACON_LEFT");
    protected ColorSensor COLOR_2 = hardwareMap.colorSensor.get("COLOR_2");
    protected GyroSensor GYRO= hardwareMap.gyroSensor.get("GYRO");

    protected OpticalDistanceSensor FRONT_DIST = hardwareMap.opticalDistanceSensor.get("FRONT_DIST");
    protected TouchSensor FRONT_TOUCH = hardwareMap.touchSensor.get("FRONT_TOUCH");

    public void telemetryDisplay(){

        telemetry.addData("MOTOR_LEFT", MOTOR_LEFT.getCurrentPosition());
        telemetry.addData("MOTOR_LEFT", MOTOR_LEFT.getPower());
        
        telemetry.addData("MOTOR_RIGHT", MOTOR_RIGHT.getCurrentPosition());
        telemetry.addData("MOTOR_RIGHT", MOTOR_RIGHT.getPower());

        telemetry.addData("servo",BEACON_PUSH.getPosition());

        telemetry.addData("Color_val", BEACON_LEFT.argb());
        telemetry.addData("Color_val", COLOR_2.argb());
        telemetry.addData("Gyro_val", GYRO.getHeading());
        telemetry.addData("Distance", FRONT_DIST.getLightDetected());
        telemetry.addData("Touch", FRONT_TOUCH.isPressed());
    }

    public void runOpMode() throws InterruptedException{
        waitForStart();
        while (opModeIsActive()){

            idle();
        }
    }

}
