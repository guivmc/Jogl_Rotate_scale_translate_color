package com.company.cena;

import com.jogamp.opengl.GL2;

public class Ex1 {

    public static void drawBaseSquare(GL2 gl)
    {
        gl.glColor3f(1f, 1f,1f);
        gl.glBegin(GL2.GL_QUADS);
        gl.glVertex3f(-.25f, .25f, 0.0f); // top left
        gl.glVertex3f(.25f, .25f, 0.0f); // top right
        gl.glVertex3f(.25f, -.25f, 0.0f); // bottom right
        gl.glVertex3f(-.25f, -.25f, 0.0f); // bottom left
        gl.glEnd();
    }

    public static void translateTopRight(GL2 gl)
    {
        gl.glColor3f(1f, 0,0);
        gl.glPushMatrix();
        gl.glTranslatef(.5f,.5f,0);
        Ex1.drawBaseSquare(gl);
        gl.glPopMatrix();
    }

    public static void translateBottomLeft(GL2 gl)
    {
        gl.glColor3f(1f, 0,0);
        gl.glPushMatrix();
        gl.glTranslatef(-.5f,-.5f,0);
        Ex1.drawBaseSquare(gl);
        gl.glPopMatrix();
    }
    public static void rotate45OnZ(GL2 gl)
    {
        gl.glColor3f(1f, 0,0);
        gl.glPushMatrix();
        gl.glTranslatef(.5f,-.5f,0);
        gl.glRotatef(45f,0,0,1);
        Ex1.drawBaseSquare(gl);
        gl.glPopMatrix();
    }

    public static void scaleUp(GL2 gl)
    {
        gl.glColor3f(1f, 0,0);
        gl.glPushMatrix();
        gl.glTranslatef(-1f,.75f,0);
        gl.glScalef(1.5f, 1.5f,1f);
        Ex1.drawBaseSquare(gl);
        gl.glPopMatrix();
    }

    public static void scaleDown(GL2 gl)
    {
        gl.glColor3f(1f, 0,0);
        gl.glPushMatrix();
        gl.glTranslatef(-.75f,0,0);
        gl.glScalef(-.2f, -.2f,1f);
        Ex1.drawBaseSquare(gl);
        gl.glPopMatrix();
    }
}
