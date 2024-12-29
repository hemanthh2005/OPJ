public class cpx {
    double img;
    double rl;

    cpx(double r,double i){
        rl=r;
        img=i;
    }
    cpx(){
        rl=0;
        img=0;

    }
    cpx add(cpx otr){
        double nrl=rl+otr.rl;
        double nimg=img+otr.img;
        return new cpx(nimg,nrl);
    }
    cpx sub(cpx otr){
        double nrl=rl-otr.rl;
        double nimg=img-otr.img;
        return new cpx(nimg,nrl);
}
void display(){
    if(img>0){
        System.out.println(rl+"+"+img+"i");
    }else{
        System.out.println(rl+"+"+Math.abs(img)+"i");
    }
    }

    public static void main(String[] args) {
        cpx num1=new cpx(5.5,4.0);
        cpx num2=new cpx(3.2,-2.5);

        System.out.println("First complex num: ");
        num1.display();

        cpx sum=num1.add(num2);
        System.out.println("sum: ");
        sum.display();

        cpx diff=num1.sub(num2);
        System.out.println("Difference: ");
        diff.display();
    }
}
