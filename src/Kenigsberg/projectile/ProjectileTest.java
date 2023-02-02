package Kenigsberg.projectile;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProjectileTest
{
    @Test
    public void getX()
    {
        // given
        Projectile projectile = new Projectile(39, 77,6);

        // when
        double x = projectile.getX();

        // then
        assertEquals(359.0414, x, .0001);
    }

    @Test
    public void getY()
    {
        // given
        Projectile projectile = new Projectile(39, 77,6);

        // when
        double y = projectile.getY();

        // then
        assertEquals(114.3460, y, .001);
    }

    @Test
    public void incTime()
    {
        // given
        Projectile projectile = new Projectile(39, 77, 6);

        // when
        projectile.incTime(4);

        // then
        assertEquals(10, projectile.getTime());
    }

}