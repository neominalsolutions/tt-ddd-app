package com.mertalptekin.dddapp.application.handler;


import com.mertalptekin.dddapp.application.event.OrderSummited;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;

@Component
public class OrderSubmitedListener {

    // Not: TransactionalEventListener yapısı after commit çalışır. Eğer @Transactional anatasyonu kullanılarak kayıt atılıyorsa. Kayıt commit sonrası tetiklenir. Eğer kayıt başarısız ise rollback dönerse buradaki event tetiklenemez.
    // Senaryo genel olarak veri kaynağına yazıldıktan sonra event fırlat şeklinde POST COMMIT genelde olabilir.

    @TransactionalEventListener
    //@EventListener
    public void orderSubmitted(OrderSummited event) {
        // buradaki logic devam eder.
        // artık order submit olduktan sonraki süreç
        System.out.println("Order submitted");
    }

}
