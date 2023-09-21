// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;
import java.util.function.Supplier;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Sub_Arm;

public class Cmd_Wrist extends CommandBase {
  /** Creates a new Cmd_Wrist. */
  private final Sub_Arm Arm;
  private final Supplier<Double> Joystick;
  public Cmd_Wrist(Sub_Arm arm,Supplier<Double> joytick) {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(arm);
    this.Arm=arm;
    this.Joystick=joytick;

  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double direccion;
    if(Math.abs(Joystick.get())<=.25){direccion=0;}else{direccion=Joystick.get();}
    Arm.setSpeedWrist(direccion);

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
