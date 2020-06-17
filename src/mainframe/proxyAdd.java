/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainframe;

/**
 *
 * @author ADMIN
 */
public class proxyAdd {
  String IPAdd,Chain,Protocol,InInterface,DstHost,Action;
  public proxyAdd (String IP, String ch,String pr, String in, String dst,String act) {
      this.IPAdd = IP;
      this.Chain = ch;
      this.Protocol = pr;
      this.InInterface = in;
      this.DstHost = dst;
      this.Action = act;
  }

  
}
