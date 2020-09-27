package com.company.cena;

import com.jogamp.opengl.GL2;

public class Ex6 {

    public static void drawStar(GL2 gl)
    {
        gl.glColor3f(0,1,0);
        gl.glBegin(GL2.GL_TRIANGLES);

        //first triangle top triangle
        gl.glVertex3f(0, 0.75f, 0);
        gl.glVertex3f(-0.2f, 0.4f, 0);
        gl.glVertex3f(0.2f, 0.4f, 0);

        //Second middle inverted
        gl.glVertex3f(0, -0.25f, 0);
        gl.glVertex3f(-0.75f, 0.4f, 0);
        gl.glVertex3f(0.75f, 0.4f, 0);

        //Third bottom left
        gl.glVertex3f(-0.35f, 0.2f, 0);
        gl.glVertex3f(-0.55f, -0.6f, 0);
        gl.glVertex3f(0, -0.25f, 0);

        //Forth bottom left
        gl.glVertex3f(0.35f, 0.2f, 0);
        gl.glVertex3f(0.55f, -0.6f, 0);
        gl.glVertex3f(0, -0.25f, 0);

        gl.glEnd();
    }

    public static void rotateStar(GL2 gl)
    {
        gl.glPushMatrix();
        gl.glRotatef(80f,0,1,0);
        Ex6.drawStar(gl);
        gl.glPopMatrix();
    }
}
