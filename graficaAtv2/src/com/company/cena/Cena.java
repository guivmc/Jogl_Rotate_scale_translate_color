package com.company.cena;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.glu.GLU;
/**
 *
 * @author Siabreu
 */
public class Cena implements GLEventListener{    
    private float xMin, xMax, yMin, yMax, zMin, zMax;    
    GLU glu;
    
    @Override
    public void init(GLAutoDrawable drawable) {
        //dados iniciais da cena
        glu = new GLU();
        //Estabelece as coordenadas do SRU (Sistema de Referencia do Universo)
        xMin = yMin = zMin = -1;
        xMax = yMax = zMax = 1;        
    }

    @Override
    public void display(GLAutoDrawable drawable) {  
        //obtem o contexto Opengl
        GL2 gl = drawable.getGL().getGL2();

        //Respostas
        //region ex1
//        Ex1.drawBaseSquare(gl);
//        Ex1.translateTopRight(gl);
//        Ex1.translateBottomLeft(gl);
//        Ex1.rotate45OnZ(gl);
//        Ex1.scaleDown(gl);
//        Ex1.scaleUp(gl);
        //endregion

        //region ex2
        //Casa Normal
//        Ex2.ceu(gl);
//        Ex2.terra(gl);
//        Ex2.calsada(gl);
//        Ex2.parede(gl);
//        Ex2.porta(gl);
//        Ex2.janela(gl);
//        Ex2.telhado(gl);

        //Casa torta
//        Ex2.ceu(gl);
//        Ex2.terra(gl);
//        Ex2.calsada(gl);
//        Ex2.parede(gl);
//
//        gl.glPushMatrix();
//        gl.glScalef(1f, 0.5f, 1f);
//        Ex2.porta(gl);
//        gl.glPopMatrix();
//
//        gl.glPushMatrix();
//        gl.glRotatef(20f, 0, 0, 1);
//        Ex2.janela(gl);
//        gl.glPopMatrix();
//
//        gl.glPushMatrix();
//        gl.glTranslatef(0.3f, 0.1f, 0);
//        Ex2.telhado(gl);
//        gl.glPopMatrix();
        //endregion

        //region ex6
//        Ex6.drawStar(gl);
        Ex6.rotateStar(gl);
        //endregion
    }

    @Override
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {    
        //obtem o contexto grafico Opengl
        GL2 gl = drawable.getGL().getGL2();  
        
        //evita a divisão por zero
        if(height == 0) height = 1;
        //calcula a proporção da janela (aspect ratio) da nova janela
        float aspect = (float) width / height;
        
        //seta o viewport para abranger a janela inteira
        gl.glViewport(0, 0, width, height);
                
        //ativa a matriz de projeção
        gl.glMatrixMode(GL2.GL_PROJECTION);      
        gl.glLoadIdentity(); //lê a matriz identidade
        
        //Projeção ortogonal
        //true:   aspect >= 1 configura a altura de -1 para 1 : com largura maior
        //false:  aspect < 1 configura a largura de -1 para 1 : com altura maior
        if(width >= height)            
            gl.glOrtho(xMin * aspect, xMax * aspect, yMin, yMax, zMin, zMax);
        else        
            gl.glOrtho(xMin, xMax, yMin / aspect, yMax / aspect, zMin, zMax);
                
        //ativa a matriz de modelagem
        gl.glMatrixMode(GL2.GL_MODELVIEW);
        gl.glLoadIdentity(); //lê a matriz identidade
        System.out.println("Reshape: " + width + ", " + height);
    }    
       
    @Override
    public void dispose(GLAutoDrawable drawable) {}         
}
