package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name="Basic",group=" ")
public class SkeletonOpMode extends LinearOpMode {
    /* 1: INITIALIZATION
     Initialize all variables here */

    DcMotor MotorA, MotorB, MotorC, MotorD;

    @Override
    public void runOpMode() {
    /* 2: CONFIGURATION
    Connect all variables to the robot (not Boolean, Integer, etc but Motors, Sensors)
     */
    MotorA = hardwareMap.get(DcMotor.class, "frontleft");
    MotorB = hardwareMap.get(DcMotor.class, "frontright");
    MotorC = hardwareMap.get(DcMotor.class, "backleft");
    MotorD = hardwareMap.get(DcMotor.class, "backright");

    waitForStart();

    /* 3: EXECUTION
    Actual programing loop, write code here
    Add while() loop if teleop, don't if autonomous
     */

    while(!opModeIsActive()){

        leftSide(-gamepad1.left_stick_y);
        rightSide(-gamepad1.right_stick_y);

        /* 4: TELEMETRY
        For debugging, helps identify problems
         */

        telemetry.addLine(String.format("Left Stick + %d",-gamepad1.left_stick_y));
        telemetry.addLine(String.format("Right Stick + %d",-gamepad1.right_stick_y));

    }



    }
    /* 5: METHODS
        Set up functions/methods at the bottom of the code
     */
    public void leftSide(double pwr){
        MotorA.setPower(pwr);
        MotorC.setPower(pwr);
    }

    public void rightSide(double pwr){
        MotorB.setPower(pwr);
        MotorD.setPower(pwr);
    }
}
