package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.PWMVictorSPX; // Victor SPX using PWM
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class TestMotors extends SubsystemBase {

  private final PWMVictorSPX testMotor1;  // Declare the motor controller

  /** Creates a new TestMotors. */
  public TestMotors() {
    // Initialize the motor controller with the PWM channel (e.g., 0 for PWM channel 0)
    testMotor1 = new PWMVictorSPX(0);  // Adjust channel number based on where it’s connected
  }

  /** Activates the motor at full speed forward. */
  public void activateMotors() {
    testMotor1.set(1.0); // Full speed forward
  }

  /** Deactivates the motor by stopping it. */
  public void deactivateMotors() {
    testMotor1.set(0.0); // Stop the motor
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}

