package main;

import java.awt.EventQueue;

import view.LogOnFrame;
import view.adminFrame;
import view.secadminFrame;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        EventQueue.invokeLater(new Runnable() {
          public void run() {
              try {
                  LogOnFrame frame = new LogOnFrame();
                  frame.setVisible(true);
              } catch (Exception e) {
                  e.printStackTrace();
              }
          }
      });

    }

}
//public static void main(String[] args) {
//    EventQueue.invokeLater(new Runnable() {
//        public void run() {
//            try {
//                LogOnFrame frame = new LogOnFrame();
//                frame.setVisible(true);                   
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    });
//}


//
//public static void main(String[] args) {
//    EventQueue.invokeLater(new Runnable() {
//        public void run() {
//            try {
//                adminFrame frame = new adminFrame();
//                frame.setVisible(true);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    });
//}