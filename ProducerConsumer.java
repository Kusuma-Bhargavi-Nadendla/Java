class Queue {
    int n;
    boolean ValueSet = false;

    synchronized int get() {
        if (!ValueSet) {
            try {
                wait();
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
        }
            System.out.println("Got=" + n);
            ValueSet = false;
            notify();
        
        
        return n;
        
    }

    synchronized void Put(int n) {
        if (ValueSet) {
            try {
                wait();
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
        }
        this.n = n;
        ValueSet = true;
        System.out.println("Put=" + n);
        notify();
    }
}

class Producer implements Runnable {
    Queue q;

    Producer(Queue q) {
        this.q = q;
        new Thread(this, "producer").start();
    }

    public void run() {
        int i = 1;
        while (true) {
            q.Put(i++);
        }
    }
}

class Consumer implements Runnable {
    Queue q;

    Consumer(Queue q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    public void run() {
        while (true) {
            q.get();
        }
    }
}

class ProducerConsumer{
    public static void main(String[] args) {
        Queue q = new Queue();
        new Producer(q);
        new Consumer(q);
        System.out.println("Producer Consumer Problem Starts");
    }
}
