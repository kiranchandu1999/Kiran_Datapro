class Downloader extends Thread {
    String file;

    Downloader(String file) {
        this.file = file;
    }

    @Override
    public void run() {
        download();
    }

    void download() {
        System.out.println(Thread.currentThread().getName() + " started downloading file: " + file);
        // we can sleep thread
        try {
            Thread.sleep(2000);
        } catch(InterruptedException ie) {
            System.out.println(ie);
        }
        System.out.println(Thread.currentThread().getName() + " finished downloading file: " + file);
    }
}

class FileDownloader {
    public static void main(String[] args) {
        Downloader d1 = new Downloader("example.java");
        Downloader d2 = new Downloader("flowers.jpg");
        Downloader d3 = new Downloader("songs.mp3");

        d1.start();
        d2.start();
        d3.start();

        // joining threads
        try {
            d1.join();
            d2.join();
            d3.join();
        } catch(InterruptedException ie) {
            System.out.println(ie);
        }

        System.out.println("All files downloaded...");
    }
}