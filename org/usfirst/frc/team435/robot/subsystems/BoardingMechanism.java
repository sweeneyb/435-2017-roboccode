package org.usfirst.frc.team435.robot.subsystems;

import org.usfirst.frc.team435.robot.RobotMap;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class BoardingMechanism extends Subsystem {

	public BoardingMechanism() {
		// TODO Auto-generated constructor stub
	}

	public void lift(double speed) {
    	RobotMap.endgame1Motor.set(speed);
    	RobotMap.endgame2Motor.set(speed);
    }

    public void initDefaultCommand() {
    }

}

