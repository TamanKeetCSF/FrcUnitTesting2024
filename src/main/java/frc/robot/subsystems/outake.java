package frc.robot.subsystems;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class outake extends SubsystemBase {

    private CANSparkMax outakeIzquierda = new CANSparkMax(1, MotorType.kBrushless);  
    private CANSparkMax outakeDerecha = new CANSparkMax(12, MotorType.kBrushless); 

    public outake() {
        outakeIzquierda.setInverted(true);
    }

    @Override
    public void periodic() {

    }

    @Override
    public void simulationPeriodic() {
        
    }

    public void outakeAmp() {
        outakeIzquierda.set(0.3);  
        outakeDerecha.set(0.3);  
        System.out.println("Outake amp");
    }
    public void outakeSpeeker() {
        outakeIzquierda.set(0.7);  
        outakeDerecha.set(0.7);  
        System.out.println("outake Speeker");
    }

    public void stopOutake() {
        outakeIzquierda.set(0);  
        outakeDerecha.set(0);  
        //System.out.println("stop outake");
    }
}
