
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package computerpad;
/**
 *
 * @author Administrator
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class NumberButton extends Button
{
  int number;
  public NumberButton(int number)
   {
    super(""+number);
    this.number=number;
    setForeground(Color.blue);
   }
  public int getNumber()
   {
     return number;
   }
}
