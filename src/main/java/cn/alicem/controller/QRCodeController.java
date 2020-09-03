package cn.alicem.controller;

import cn.alicem.util.QRCodeUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @ClassName QRCodeController
 * @Description TODO
 * @Author LiHongBin
 * @Date 2020\9\3 0003 20:54
 * @Version 1.0
 **/
@RestController
public class QRCodeController {

    @RequestMapping("/code")
    public String getCode() throws IOException {
        QRCodeUtil qrCodeUtil = new QRCodeUtil();
        String qrCode = qrCodeUtil.createQRCode("http://www.baidu.com", 200, 200);
        System.out.println(qrCode);
        qrCode = "<img src='"+qrCode+"' />";
        return qrCode;
    }
}
