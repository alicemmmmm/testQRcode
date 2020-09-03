package cn.alicem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName QRcodeApplication
 * @Description TODO
 * @Author LiHongBin
 * @Date 2020\9\3 0003 20:00
 * @Version 1.0
 **/
@SpringBootApplication(scanBasePackages = "cn.alicem")
public class QRcodeApplication {
    public static void main(String[] args) {
        SpringApplication.run(QRcodeApplication.class,args);
    }
}
