package frc.robot;

import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
//import edu.wpi.first.wpilibj2.command.Command.InterruptionBehavior;

/**
 * This class is where the bulk of the robot should be declared.
 */
public class RobotContainer {

    private static RobotContainer m_robotContainer = new RobotContainer();

    // Subsystems
    public final intake m_intake = new intake();
    public final outake m_outake = new outake();  // New outake subsystem

    // Joysticks
    private final XboxController xboxController1 = new XboxController(0);

    // A chooser for autonomous commands
    SendableChooser<Command> m_chooser = new SendableChooser<>();

    /**
     * The container for the robot. Contains subsystems, OI devices, and commands.
     */
    private RobotContainer() {
        // Configure the button bindings
        configureButtonBindings();

        // Configure autonomous sendable chooser
        SmartDashboard.putData("Auto Mode", m_chooser);
    }

    public static RobotContainer getInstance() {
        return m_robotContainer;
    }

    /**
     * Use this method to define your button->command mappings.
     */
    private void configureButtonBindings() {
        // Intake button mappings
        final JoystickButton buttonA = new JoystickButton(xboxController1, XboxController.Button.kA.value);
        final JoystickButton buttonB = new JoystickButton(xboxController1, XboxController.Button.kB.value);

        // Outake button mappings
        final JoystickButton buttonX = new JoystickButton(xboxController1, XboxController.Button.kX.value);
        final JoystickButton buttonY = new JoystickButton(xboxController1, XboxController.Button.kY.value);

        // Button A activates the intake
        buttonA.onTrue(new InstantCommand(() -> m_intake.activateIntake(), m_intake))
           .onFalse(new InstantCommand(() -> m_intake.stopIntake(), m_intake));

        // Button B stops the intake
        buttonX.onTrue(new InstantCommand(() -> m_intake.activateDesintake(), m_intake))
           .onFalse(new InstantCommand(() -> m_intake.stopIntake(), m_intake));


        // Button X activates the speeker shooter
        buttonB.onTrue(new InstantCommand(() -> m_outake.outakeSpeeker(), m_outake))
           .onFalse(new InstantCommand(() -> m_outake.stopOutake(), m_outake));

        // Button Y stops the amp shooter
        buttonY.onTrue(new InstantCommand(() -> m_outake.outakeAmp(), m_outake))
           .onFalse(new InstantCommand(() -> m_outake.stopOutake(), m_outake));
    }

    public XboxController getXboxController1() {
        return xboxController1;
    }

    /**
     * Use this to pass the autonomous command to the main {@link Robot} class.
     *
     * @return the command to run in autonomous
     */
    public Command getAutonomousCommand() {
        // The selected command will be run in autonomous
        return m_chooser.getSelected();
    }
}


