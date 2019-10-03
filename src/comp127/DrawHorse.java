package comp127;

import comp127graphics.CanvasWindow;
import comp127graphics.Line;
import comp127graphics.Rectangle;

public class DrawHorse {

    public static void main(String[] args) {

        CanvasWindow cw = new CanvasWindow("Horse",500,500);
        Rectangle head = new Rectangle(400,100, 80,35 );
        cw.add(head);

        Rectangle ear1 = new Rectangle(400,85,7,15);
        cw.add(ear1);

        Rectangle ear2 = new Rectangle(410,85,7,15);
        cw.add(ear2);

        Rectangle body = new Rectangle(265,140,150,75);
        cw.add(body);

        Line leg1 = new Line(265,215,265,280);
        cw.add(leg1);

        Line leg2 = new Line(275,215,275,280);
        cw.add(leg2);

        Line leg3 = new Line(415,215,415,280);
        cw.add(leg3);

        Line leg4 = new Line(405,215,405,280);
        cw.add(leg4);

        Line tail = new Line(265,145,240,215);
        cw.add(tail);


        cw.draw();

    }
}
