// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
public class Sub_Intake extends SubsystemBase {
  
  private final CANSparkMax MotorIntake= new CANSparkMax(8, MotorType.kBrushless);

  public Sub_Intake() {
    MotorIntake.restoreFactoryDefaults();
    MotorIntake.setIdleMode(CANSparkMax.IdleMode.kBrake);
    MotorIntake.setSmartCurrentLimit(20);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    SmartDashboard.putNumber("Voltaje", MotorIntake.getOutputCurrent());
  }

  public void SetIntake (double Intakespeed){
    MotorIntake.set(Intakespeed);
    //System.out.println(Intakespeed);
  }

  public double GetVoltaje(){
   return MotorIntake.getOutputCurrent();
  }
}
