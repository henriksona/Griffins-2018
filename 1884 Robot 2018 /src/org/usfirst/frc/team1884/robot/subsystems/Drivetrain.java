package org.usfirst.frc.team1884.robot.subsystems;

import org.usfirst.frc.team1884.robot.RobotMap;
import org.usfirst.frc.team1884.robot.commands.Drive;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {
	public Drivetrain(){
		
	}
	public void teleopDrive(double x, double z){
		RobotMap.mainDrive.arcadeDrive(x,  z, true);
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new Drive());
    }
}

