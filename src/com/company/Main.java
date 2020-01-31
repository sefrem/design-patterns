package com.company;

import com.company.memento.Editor;
import com.company.memento.History;


public class Main {
    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        editor.restore(history.pop());
        editor.restore(history.pop());

        editor.setContent("baba");
        history.push(editor.createState());
        editor.restore(history.pop());

        System.out.println(editor.getContent());

    }
}


//public class Main {
//   public static void main(String[] args) {
//       drawUIControl(new TextBox());
//   }
//
//   public static void drawUIControl(UIControl control) {
//    control.draw();
//   }
//}

//    public static void main(String[] args) {
//        var mailService = new MailService();
//        mailService.sendEmail();
//    }


//    public static void main(String[] args) {
//	    User user = new User("Slava", "Efremov");
//	    user.sayHello();
//    }

//    public static void main(String[] args) {
//    TaxCalculator calculator = getCalculator();
//    calculator.calculateTax();
//    calculator.calculateInsurance();


//    public static TaxCalculator getCalculator() {
//        return new TaxCalculator2019();
//    }


//    public static void main(String[] args) {
//        var account = new Account();
//        account.deposit(10);
//        account.withdraw(5);
//        System.out.println(account.getBalance());
//    }


//    public static void main(String[] args) {
//    var mailService = new MailService();
//    mailService.sendEmail();
//    }

