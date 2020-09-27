package com.company.cena;

import com.jogamp.opengl.GL2;

public class Ex2 {

    public static void ceu(GL2 gl )
    {
        gl.glColor3f(0, 0.5f,1f);
        gl.glBegin(GL2.GL_QUADS);
        gl.glVertex3f(-1f, 1f, 0.0f); // top left
        gl.glVertex3f(1f, 1f, 0.0f); // top right
        gl.glVertex3f(1f, 0, 0.0f); // bottom right
        gl.glVertex3f(-1f, 0, 0.0f); // bottom left
        gl.glEnd();
    }

    public static void terra(GL2 gl )
    {
        gl.glColor3f(0.5f, 1f,0.25f);
        gl.glBegin(GL2.GL_QUADS);
        gl.glVertex3f(-1f, 0, 0.0f); // top left
        gl.glVertex3f(1f, 0, 0.0f); // top right
        gl.glVertex3f(1f, -1f, 0.0f); // bottom right
        gl.glVertex3f(-1f, -1f, 0.0f); // bottom left
        gl.glEnd();
    }

    public static void calsada(GL2 gl )
    {
        gl.glColor3f(1f, 1f,0);
        gl.glBegin(GL2.GL_QUADS);
        gl.glVertex3f(-0.4f, -0.5f, 0.0f); // top left
        gl.glVertex3f(0, -0.5f, 0.0f); // top right
        gl.glVertex3f(0.5f, -1f, 0.0f); // bottom right
        gl.glVertex3f(-0.7f, -1f, 0.0f); // bottom left
        gl.glEnd();
    }

    public static void parede(GL2 gl )
    {
        gl.glColor3f(1f, 0,0);
        gl.glBegin(GL2.GL_QUADS);
        gl.glVertex3f(-0.5f, 0.4f, 0.0f); // top left
        gl.glVertex3f(0.5f, 0.4f, 0.0f); // top right
        gl.glVertex3f(0.5f, -0.5f, 0.0f); // bottom right
        gl.glVertex3f(-0.5f, -0.5f, 0.0f); // bottom left
        gl.glEnd();
    }

    public static void porta(GL2 gl )
    {
        gl.glColor3f(0, 1f,0);
        gl.glBegin(GL2.GL_QUADS);
        gl.glVertex3f(-0.4f, 0.2f, 0.0f); // top left
        gl.glVertex3f(0, 0.2f, 0.0f); // top right
        gl.glVertex3f(0, -0.5f, 0.0f); // bottom right
        gl.glVertex3f(-0.4f, -0.5f, 0.0f); // bottom left
        gl.glEnd();

        gl.glColor3f(0, 0,0);
        gl.glBegin(GL2.GL_POINTS);
        gl.glPointSize(1f);
        gl.glVertex3f(-0.35f, -0.2f, 0.0f); // top left
        gl.glEnd();
    }

    public static void janela(GL2 gl )
    {
        gl.glColor3f(0, 0,0);
        gl.glBegin(GL2.GL_LINE_LOOP);
        gl.glVertex3f(0.1f, 0.2f, 0.0f); // top left
        gl.glVertex3f(0.4f, 0.2f, 0.0f); //top right
        gl.glEnd();

        gl.glBegin(GL2.GL_LINE_LOOP);
        gl.glVertex3f(0.4f, 0.2f, 0.0f); // top right
        gl.glVertex3f(0.4f, 0f, 0.0f); //bottom right
        gl.glEnd();

        gl.glBegin(GL2.GL_LINE_LOOP);
        gl.glVertex3f(0.4f, 0f, 0.0f); //bottom right
        gl.glVertex3f(0.1f, 0f, 0.0f); //bottom left
        gl.glEnd();

        gl.glBegin(GL2.GL_LINE_LOOP);
        gl.glVertex3f(0.1f, 0f, 0.0f); //bottom left
        gl.glVertex3f(0.1f, 0.2f, 0.0f); // top left
        gl.glEnd();

        gl.glBegin(GL2.GL_LINE_LOOP);
        gl.glVertex3f(0.25f, 0, 0.0f); //bottom middle x
        gl.glVertex3f(0.25f, 0.2f, 0.0f); //top middle x
        gl.glEnd();

        gl.glBegin(GL2.GL_LINE_LOOP);
        gl.glVertex3f(0.1f, 0.1f, 0.0f); //left middle y
        gl.glVertex3f(0.4f, 0.1f, 0.0f); //right middle y
        gl.glEnd();
    }

    public static void telhado(GL2 gl)
    {
        gl.glColor3f(0, 0,1f);
        gl.glBegin(GL2.GL_TRIANGLES);
        gl.glVertex3f(0,0.75f,0.0f);//top
        gl.glVertex3f(0.5f, 0.4f, 0.0f);//bottom left
        gl.glVertex3f(-0.5f, 0.4f, 0.0f);//bottom right
        gl.glEnd();
    }
}
