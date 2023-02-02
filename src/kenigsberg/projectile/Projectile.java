package kenigsberg.projectile;

public class Projectile
{

    private final double angle;
    private final double velocity;
    private int time;

    public Projectile(double angle, double velocity)
    {
        this.angle = angle;
        this.velocity = velocity;
        this.time = 0;
    }


    public double getAngle()
    {
        return angle;
    }


    public double getVelocity()
    {
        return velocity;
    }

    public int getTime()
    {
        return time;
    }

    public void setTime(int time)
    {
        this.time = time;
    }

    public double getX()
    {
        return Math.cos(Math.toRadians(angle)) * velocity * time;
    }

    public double getY()
    {
        return Math.sin(Math.toRadians(angle)) * velocity * time - .5 * 9.8 * time * time;
    }

    public void incTime(double delta)
    {
        this.time += delta;
    }

}
