package com.viniciuszanin.qrcode.generation.controller;

import com.viniciuszanin.qrcode.generation.dto.QrCodeGenerateRequest;
import com.viniciuszanin.qrcode.generation.dto.QrCodeGenerateResponse;
import com.viniciuszanin.qrcode.generation.service.QrCodeGeneratorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/qrcode")
public class QrCodeController {

    private final QrCodeGeneratorService grCodeGeneratorService;

    public QrCodeController(QrCodeGeneratorService grCodeService) {
        this.grCodeGeneratorService = grCodeService;
    }

    @PostMapping
    public ResponseEntity<QrCodeGenerateResponse> generate(@RequestBody QrCodeGenerateRequest request) {
        try {
            QrCodeGenerateResponse response = this.grCodeGeneratorService.generateAndUploadQrCode(request.text());
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }
}

