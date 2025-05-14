class Downloader extends Thread {
    String fileName;

    @Override
    public void run() {
        fileDownload();
    }

    Downloader(String fileName) {
        this.fileName = fileName;
    }

    void fileDownload() {
        System.out.println("Downloading file " + fileName);
        System.out.println("Thread name: " + Thread.currentThread().getName());
        // can hold thread for a while
        try {
            Thread.sleep(2000);
        }
        catch(InterruptedException ie){
            System.out.println("Thread interrupted..." + Thread.currentThread().getName());
        }
        System.out.println("Finished downloading file " + fileName);
    }
}

class FileDownloader {
    public static void main(String[] args) {
        Downloader d1 = new Downloader("main.java");
        Downloader d2 = new Downloader("flower.jpg");
        Downloader d3 = new Downloader("pushpa_album.mp3");

        // d1.fileDownload();
        // d2.fileDownload();
        // d3.fileDownload();
        d1.start();
        d2.start();
        d3.start();
    }
}