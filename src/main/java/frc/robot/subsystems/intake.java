package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;
import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

/**
 * Subsystem for controlling the intake mechanism using CAN with VictorSPX controllers.
 */
public class intake extends SubsystemBase {
    // Motor declarations
    private CANSparkMax MotorArriba = new CANSparkMax(6, MotorType.kBrushed);  // Replace with the actual CAN ID for MotorArriba
    private CANSparkMax MotorAbajo = new CANSparkMax(9, MotorType.kBrushed);
    
    
    
    // Replace with the actual CAN ID for MotorAbajo

    public intake() {
        // Motor initialization if needed
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }

    @Override
    public void simulationPeriodic() {
        // This method will be called once per scheduler run when in simulation
    }

    // Methods to control the intake motors
    public void activateIntake() {
        System.out.println("waza");
        MotorArriba.set(0.3);  // Set speed for intake activation
        MotorAbajo.set(0.3);
    }

    public void stopIntake() {
        System.out.println("waza");
        MotorArriba.set(0.0);  // Stop the motors
        MotorAbajo.set(0.0);
    }
}
