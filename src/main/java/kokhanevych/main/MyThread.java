package kokhanevych.main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.Callable;

public class MyThread implements Callable<Long> {
    private String dir;
    private Long quantity;

    public String getDir() {
        return dir;
    }

    public Long getQuantity() {
        return quantity;
    }

    public MyThread(String dir){
        this.dir = dir;
        quantity = 0L;
    }

    @Override
    public Long call() {
        try {
            quantity = Files.walk(Paths.get(dir))
                    .parallel()
                    .filter(p -> !p.toFile().isDirectory())
                    .count();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return quantity;
    }
}
