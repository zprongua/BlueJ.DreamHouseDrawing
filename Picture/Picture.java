
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square commerce1;
    private Square commerce12;
    private Square commerce2;
    private Square commerce22;
    private Circle commerceA;
    private Circle commerceB;
    private Circle commerceC;
    private Circle commerceD;
    private Square logan31;
    private Square logan32;
    private Square logan33;
    private Square blueCross;
    private Square comcast1;
    private Square comcast2;
    private Square comcast3;
    private Square BNY1;
    private Square BNY2;
    private Triangle BNY3;
    private Square liberty11;
    private Square liberty12;
    private Triangle liberty13;
    private Triangle liberty14;
    private Circle liberty15;
    private Square liberty21;
    private Square liberty22;
    private Triangle liberty23;
    private Square other1;
    private Square other2;
    private Square other3;
    private Square other4;
    private Square antenna1;
    private Square antenna2;
    private Square antenna3;
    private Square antenna4;
    private Square antenna5;
    private Circle moon;
    private Square phillie1;
    private Square phillie2;
    private Circle phillie3;
    private Circle phillie4;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {        
        moon = new Circle();
        moon.changeColor("white");
        moon.changeSize(75);
        moon.moveHorizontal(430);
        moon.moveVertical(10);
        moon.makeVisible();
        
        //commerce buildings
        commerce1 = new Square();
        commerce1.changeColor("black");
        commerce1.moveVertical(80);
        commerce1.changeSize(50);
        commerce1.makeVisible();

        commerce12 = new Square();
        commerce12.changeColor("black");
        commerce12.changeSize(50);
        commerce12.moveVertical(130);
        commerce12.makeVisible();
        
        commerce2 = new Square();
        commerce2.changeColor("black");
        commerce2.changeSize(50);
        commerce2.moveHorizontal(55);
        commerce2.moveVertical(80);
        commerce2.makeVisible();
        
        commerce22 = new Square();
        commerce22.changeColor("black");
        commerce22.changeSize(50);
        commerce22.moveHorizontal(55);
        commerce22.moveVertical(130);
        commerce22.makeVisible();
        
        commerceA = new Circle();
        commerceA.changeColor("black");
        commerceA.moveHorizontal(38);
        commerceA.moveVertical(65);
        commerceA.changeSize(10);
        commerceA.makeVisible();
        
        commerceB = new Circle();
        commerceB.changeColor("black");
        commerceB.moveHorizontal(81);
        commerceB.moveVertical(65);
        commerceB.changeSize(10);
        commerceB.makeVisible();
        
        commerceC = new Circle();
        commerceC.changeColor("black");
        commerceC.moveHorizontal(91);
        commerceC.moveVertical(65);
        commerceC.changeSize(10);
        commerceC.makeVisible();
        
        commerceD = new Circle();
        commerceD.changeColor("black");
        commerceD.moveHorizontal(137);
        commerceD.moveVertical(65);
        commerceD.changeSize(10);
        commerceD.makeVisible();
        
        //logan3
        logan31 = new Square();
        logan31.changeColor("black");
        logan31.changeSize(75);
        logan31.moveHorizontal(110);
        logan31.moveVertical(105);
        logan31.makeVisible();
        
        logan32 = new Square();
        logan32.changeColor("black");
        logan32.changeSize(25);
        logan32.moveHorizontal(121);
        logan32.moveVertical(85);
        logan32.makeVisible();
        
        logan33 = new Square();
        logan33.changeColor("black");
        logan33.changeSize(30);
        logan33.moveHorizontal(116);
        logan33.moveVertical(90);
        logan33.makeVisible();
        
        //blueCross
        blueCross = new Square();
        blueCross.changeColor("black");
        blueCross.changeSize(36);
        blueCross.moveHorizontal(149);
        blueCross.moveVertical(85);
        blueCross.makeVisible();
        
        //comcast
        comcast1 = new Square();
        comcast1.changeColor("black");
        comcast1.changeSize(45);
        comcast1.moveHorizontal(160);
        comcast1.moveVertical(60);
        comcast1.makeVisible();
        
        comcast2 = new Square();
        comcast2.changeColor("black");
        comcast2.changeSize(75);
        comcast2.moveHorizontal(130);
        comcast2.moveVertical(105);
        comcast2.makeVisible();
        
        comcast3 = new Square();
        comcast3.changeColor("black");
        comcast3.changeSize(38);
        comcast3.moveHorizontal(165);
        comcast3.moveVertical(30);
        comcast3.makeVisible();
        
        //BNY
        BNY1 = new Square();
        BNY1.changeColor("black");
        BNY1.changeSize(70);
        BNY1.moveHorizontal(210);
        BNY1.moveVertical(110);
        BNY1.makeVisible();
        
        BNY2 = new Square();
        BNY2.changeColor("black");
        BNY2.changeSize(45);
        BNY2.moveHorizontal(210);
        BNY2.moveVertical(80);
        BNY2.makeVisible();
        
        BNY3 = new Triangle();
        BNY3.changeColor("black");
        BNY3.changeSize(30, 51);
        BNY3.moveHorizontal(242);
        BNY3.moveVertical(88);
        BNY3.makeVisible();
        
        //liberty1
        liberty11 = new Square();
        liberty11.changeColor("black");
        liberty11.changeSize(50);
        liberty11.moveHorizontal(285);
        liberty11.moveVertical(130);
        liberty11.makeVisible();
        
        liberty12 = new Square();
        liberty12.changeColor("black");
        liberty12.changeSize(45);
        liberty12.moveHorizontal(310);
        liberty12.moveVertical(85);
        liberty12.makeVisible();
        
        liberty13 = new Triangle();
        liberty13.changeColor("black");
        liberty13.changeSize(30, 51);
        liberty13.moveHorizontal(342);
        liberty13.moveVertical(90);
        liberty13.makeVisible();
        
        liberty14 = new Triangle();
        liberty14.changeColor("white");
        liberty14.changeSize(15, 35);
        liberty14.moveHorizontal(242);
        liberty14.moveVertical(100);
        liberty14.makeVisible();
        
        liberty15 = new Circle();
        liberty15.changeColor("red");
        liberty15.changeSize(5);
        liberty15.moveHorizontal(370);
        liberty15.moveVertical(23);
        liberty15.makeVisible();
        
        antenna1 = new Square();
        antenna1.changeColor("black");
        antenna1.changeSize(5);
        antenna1.moveHorizontal(330);
        antenna1.moveVertical(35);
        antenna1.makeVisible();
        antenna2 = new Square();
        antenna2.changeColor("black");
        antenna2.changeSize(5);
        antenna2.moveHorizontal(330);
        antenna2.moveVertical(40);
        antenna2.makeVisible();
        antenna3 = new Square();
        antenna3.changeColor("black");
        antenna3.changeSize(5);
        antenna3.moveHorizontal(330);
        antenna3.moveVertical(45);
        antenna3.makeVisible();
        antenna4 = new Square();
        antenna4.changeColor("black");
        antenna4.changeSize(5);
        antenna4.moveHorizontal(330);
        antenna4.moveVertical(50);
        antenna4.makeVisible();
        antenna5 = new Square();
        antenna5.changeColor("black");
        antenna5.changeSize(5);
        antenna5.moveHorizontal(330);
        antenna5.moveVertical(55);
        antenna5.makeVisible();
        
        //other
        other1 = new Square();
        other1.changeColor("black");
        other1.changeSize(50);
        other1.moveHorizontal(285);
        other1.moveVertical(130);
        other1.makeVisible();
        
        other2 = new Square();
        other2.changeColor("black");
        other2.changeSize(50);
        other2.moveHorizontal(335);
        other2.moveVertical(130);
        other2.makeVisible();
        
        other3 = new Square();
        other3.changeColor("black");
        other3.changeSize(50);
        other3.moveHorizontal(385);
        other3.moveVertical(130);
        other3.makeVisible();
        
        other4 = new Square();
        other4.changeColor("black");
        other4.changeSize(50);
        other4.moveHorizontal(435);
        other4.moveVertical(130);
        other4.makeVisible();
        
        //liberty2
        liberty12 = new Square();
        liberty12.changeColor("black");
        liberty12.changeSize(45);
        liberty12.moveHorizontal(390);
        liberty12.moveVertical(85);
        liberty12.makeVisible();
        
        liberty13 = new Triangle();
        liberty13.changeColor("black");
        liberty13.changeSize(30, 51);
        liberty13.moveHorizontal(422);
        liberty13.moveVertical(90);
        liberty13.makeVisible();
        
        //phillies
        phillie1 = new Square();
        phillie1.changeColor("red");
        phillie1.changeSize(30);
        phillie1.moveHorizontal(-20);
        phillie1.moveVertical(-20);
        phillie1.makeVisible();
        phillie2 = new Square();
        phillie2.changeColor("red");
        phillie2.changeSize(30);
        phillie2.moveHorizontal(-20);
        phillie2.moveVertical(10);
        phillie2.makeVisible();
        phillie3 = new Circle();
        phillie3.changeColor("red");
        phillie3.changeSize(40);
        phillie3.moveHorizontal(45);
        phillie3.moveVertical(-30);
        phillie3.makeVisible();
        phillie4 = new Circle();
        phillie4.changeColor("white");
        phillie4.changeSize(20);
        phillie4.moveHorizontal(55);
        phillie4.moveVertical(-20);
        phillie4.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(commerce1 != null)   // only if it's painted already...
        {
            commerce1.changeColor("black");
            commerce2.changeColor("white");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(commerce1 != null)   // only if it's painted already...
        {
            commerce1.changeColor("red");
            commerce2.changeColor("black");
        }
    }

}
