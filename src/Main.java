//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    byte myNum = 100;
    short myShort = 5000;
    int a = 150;
    long myLong = 15000000000L;
    float f=67.19f;
    boolean b=true;
    char c ='g';
    System.out.println(myNum);
    System.out.println(myShort);
    System.out.println(a);
    System.out.println(myLong);
    System.out.println(f);
    System.out.println(b);
    System.out.println(c);
    float boat= (float) f;
    long kong=(long) boat;
    int mint=(int) kong;
    char izard=(char) mint;
    short port=(short) izard;
    byte light=(byte) port;
    System.out.println("Innen kezdődik");
    System.out.println(boat);
    System.out.println(kong);
    System.out.println(mint);
    System.out.println(izard);
    System.out.println(port);
    System.out.println(light);
}
