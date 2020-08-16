package javaProfessional.ex_003_waiting.mywaiting;

public class Main {
    public static void main(String[] args) {
        Prod p = new Prod();
        Creater creater = new Creater(5, p);
        Cons cons = new Cons(5, p);

        creater.start();
        cons.start();
    }
}

class Prod {
    int id;
    boolean isProduced;

    synchronized void setP(int id) {
        if (isProduced) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        this.id = id;
        System.out.println("Set " + id);
        isProduced = true;
        notify();
    }


    synchronized void getP() {
        if (!isProduced) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("Get " + id);
        isProduced = false;
        notify();
    }
}

class Creater extends Thread {
    int count;
    Prod p;

    public Creater(int count, Prod p) {
        this.count = count;
        this.p = p;
    }


    @Override
    public void run() {
        for (int i = 1; i < count + 1; i++) {
            p.setP(i);
        }
    }
}

class Cons extends Thread {
    int count;
    Prod p;

    public Cons(int count, Prod p) {
        this.count = count;
        this.p = p;
    }

    @Override
    public void run() {
        for (int i = 1; i < count + 1; i++) {
            p.getP();
        }
    }
}