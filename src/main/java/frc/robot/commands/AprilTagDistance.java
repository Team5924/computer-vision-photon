// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Vision;
import org.photonvision.PhotonCamera;




public class AprilTagDistance extends CommandBase {
  /** Creates a new AprilTagDistance. */
  private final Vision mVision;
  private final Vision mResult;

  public AprilTagDistance(Vision vision, Vision result) {
    // Use addRequirements() here to declare subsystem dependencies.
    mVision = vision;  
    mResult = result;
    addRequirements(mVision);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    System.out.println(result);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
