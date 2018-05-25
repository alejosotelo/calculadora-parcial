/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraparcial;

public class Puntos {
    private final  int x1;
    private final  int x2;
    private final  int y1;
    private final  int y2;

    public Puntos(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double dis(int x1, int x2, int y1, int y2){

        double resdis;
        double res1,res2;
        double difx, dify;
        
//difx y dif y son la diferencia entre los puntos
        res1=this.x2-this.x1;   res2=this.y2-this.y1;
        res1=Math.pow(res1, 2)+Math.pow(res2, 2);
        resdis=Math.sqrt(res1);
        difx=res1*y1;
        dify=res2*res1;
        
        
        
         return resdis; }
}