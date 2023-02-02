package Kenigsberg.projectile;

import Kenigsberg.projectile.Projectile;

public class Main
{
    public static void main(String[] args)
    {
        Projectile projectile = new Projectile(39, 77, 6);

        for (int t = 0; t <= 10; t++)
        {
            System.out.printf("For time %d x = %f and y = %f\n", t, projectile.getX(), projectile.getY());
        }
    }
}
