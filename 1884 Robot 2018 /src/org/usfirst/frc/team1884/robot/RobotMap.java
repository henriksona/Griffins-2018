package org.usfirst.frc.team1884.robot;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;
	public static VictorSP motorL1 =  new VictorSP(0);
	public static VictorSP motorL2 =  new VictorSP(1);
	public static VictorSP motorR1 =  new VictorSP(2);
	public static VictorSP motorR2 =  new VictorSP(3);
	public static SpeedControllerGroup left = new SpeedControllerGroup(motorL1, motorL2);
	public static SpeedControllerGroup right = new SpeedControllerGroup(motorR1, motorR2);
	public static DifferentialDrive mainDrive = new DifferentialDrive(left, right);
	
	
	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}