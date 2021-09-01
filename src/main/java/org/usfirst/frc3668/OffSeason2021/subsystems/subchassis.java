package org.usfirst.frc3668.OffSeason2021.subsystems;

import com.revrobotics.SparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import org.usfirst.frc3668.OffSeason2021.hardware.wlSpark;
import org.usfirst.frc3668.OffSeason2021.OI;
import org.usfirst.frc3668.OffSeason2021.Robot;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

/**
 *
 */
public class SubChassis extends Subsystem {

  public static wlSpark leftDriveSpark;
  public static wlSpark rightDriveSpark;
  public static TalonSRX leftFollowerTalon;
  public static TalonSRX rightFollowerTalon;
  public DifferentialDrive m_Drive;
  
  public SubChassis() {
    leftDriveSpark = new wlSpark(13, MotorType.kBrushless);
    rightDriveSpark = new wlSpark(16, MotorType.kBrushless);
    DifferentialDrive m_Drive = new DifferentialDrive(leftDriveSpark, rightDriveSpark);

    leftDriveSpark.setInverted(true); // if you want to invert motor outputs, you must do so here
    rightDriveSpark.setInverted(false);
    leftFollowerTalon.setInverted(true);
    rightFollowerTalon.setInverted(false);
  }

  public void teleopPeriodic() {
    
    // Arcade drive with a given forward and turn rate
    m_Drive.arcadeDrive(Robot.oi.joyDrive.getY(), Robot.oi.joyDrive.getX());
  }

  public void winMatch(){
//��������������������������_����
//�������������������������������
//����������_���__�����___�������
//�_��___�������__������__�������
//�����_��___�������������������
//�������__������������_��_���_��
//����_��_���__������__����������
//�������_��__�����____����������
//��������������___�__�_���������
//�����������_�������������������
//������_�������___�_�_�_�_������
//��������__���������������������
//������������__�����������������
//���������������_____�����������

  }

  @Override
  protected void initDefaultCommand() {
    // TODO Auto-generated method stub

  }


}