package frc.robot.subsystems;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class outake extends SubsystemBase {

    private CANSparkMax leftMotor = new CANSparkMax(2, MotorType.kBrushless);  
    private CANSparkMax rightMotor = new CANSparkMax(3, MotorType.kBrushless); 

    public outake() {
        leftMotor.setInverted(true);
    }

    @Override
    public void periodic() {

    }

    @Override
    public void simulationPeriodic() {
        
    }

    public void activateOutake() {
        leftMotor.set(0.4);  
        rightMotor.set(0.4);  
    }

    public void stopOutake() {
        leftMotor.set(0.0);  
        rightMotor.set(0.0);  
    }
}
