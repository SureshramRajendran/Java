class Grade_Conversion {
public static void main(String[]args){
int mark;
mark=Integer.parseInt(args[0]);
if(mark<100 && mark>80){System.out.println("A Grade");}
else if(mark<80 && mark>60){System.out.println("B Grade");}
else if(mark<60 && mark>40){System.out.println("C Grade");}
else if(mark<40){System.out.println("Fail");}
else {System.out.println("Invalid Data");}
}
}
