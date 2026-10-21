package Pertemuan8;

public class PatrolRobot extends Robot {

    public Battery battery;

    public PatrolRobot(String Name, int CPUSpeed, int Power, Battery battery) {
        this.Name = Name;
        this.CPUSpeed = CPUSpeed;
        this.Power = Power;
        this.battery = battery;
    }

    @Override
    public void increasePower() {
        this.Power += 20;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public String getName() {
        return Name;
    }

    @Override
    public void setName(String name) {
        this.Name = name;
    }

    public int getCPUSpeed() {
        return CPUSpeed;
    }

    @Override
    public void setCPUSpeed(int CPUSpeed) {
        this.CPUSpeed = CPUSpeed;
    }

    public int getPower() {
        return Power;
    }

    public void setPower(int power) {
        this.Power = power;
    }
}