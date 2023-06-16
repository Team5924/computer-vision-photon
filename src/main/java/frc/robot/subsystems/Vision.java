// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import java.util.function.BooleanSupplier;
import org.photonvision.PhotonUtils;
import org.photonvision.PhotonCamera;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.math.util.Units;
import frc.robot.Constants;
import edu.wpi.first.math.util.Units;

public class Vision extends SubsystemBase {
  /** Creates a new Vision. */
  private final PhotonCamera camera = new PhotonCamera("PhotonUSBCamera");

  public Vision() {
    
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public final double distance(){
    var result = camera.getLatestResult();

    if (result.hasTargets()){
      return  Units.metersToInches(PhotonUtils.calculateDistanceToTargetMeters(
        Constants.CameraConstants.kCameraHeightMeters,
        Constants.CameraConstants.kTargetHeightMeters,
        Constants.CameraConstants.kCameraPitchRadians,
        Units.degreesToRadians(result.getBestTarget().getPitch())));
    } else {
      return 0;
    }
  }

  public final boolean hasTargets() {
    var result = camera.getLatestResult();
    return result.hasTargets();
  }
}