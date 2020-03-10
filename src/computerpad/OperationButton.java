
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
public class OperationButton extends Button
{
  String 运算符号;
  public OperationButton(String s)
   {
    super(s);
    运算符号=s;
    setForeground(Color.red);
   }
  public String get运算符号()
   {
     return 运算符号;
   }
}
