package Pertemuan8;

public class Robot {
    public String Name;
    public int CPUSpeed;
    public int Power;

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setCPUSpeed(int CPUSpeed) {
        this.CPUSpeed = CPUSpeed;
    }

    public void increasePower() {
        this.Power += 10;
    }

    public void reducePower() {
        this.Power -= 10;
    }
}
