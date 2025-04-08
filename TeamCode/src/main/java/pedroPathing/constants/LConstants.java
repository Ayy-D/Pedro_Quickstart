package pedroPathing.constants;

import com.pedropathing.localization.*;
import com.pedropathing.localization.constants.*;
import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;

public class LConstants {
    static {
        ThreeWheelIMUConstants.forwardTicksToInches = 0.0029363081877;
        ThreeWheelIMUConstants.strafeTicksToInches = 0.0021096339461716034;
        ThreeWheelIMUConstants.turnTicksToInches = .001989436789;
        ThreeWheelIMUConstants.leftY = 1;
        ThreeWheelIMUConstants.rightY = -1;
        ThreeWheelIMUConstants.strafeX = -2.5;
        ThreeWheelIMUConstants.leftEncoder_HardwareMapName = "leftFront";
        ThreeWheelIMUConstants.rightEncoder_HardwareMapName = "rightRear";
        ThreeWheelIMUConstants.strafeEncoder_HardwareMapName = "leftRear";
        ThreeWheelIMUConstants.leftEncoderDirection = Encoder.REVERSE;
        ThreeWheelIMUConstants.rightEncoderDirection = Encoder.FORWARD;
        ThreeWheelIMUConstants.strafeEncoderDirection = Encoder.FORWARD;
        ThreeWheelIMUConstants.IMU_HardwareMapName = "imu";
        ThreeWheelIMUConstants.IMU_Orientation = new RevHubOrientationOnRobot(RevHubOrientationOnRobot.LogoFacingDirection.UP, RevHubOrientationOnRobot.UsbFacingDirection.RIGHT);

    }
}




