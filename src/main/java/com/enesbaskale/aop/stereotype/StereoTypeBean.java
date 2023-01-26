package com.enesbaskale.aop.stereotype;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import lombok.*;

@BenimStereoType
@Data @NoArgsConstructor @AllArgsConstructor
public class StereoTypeBean {
    private Long id;
    private String name="Hi";
    private String trade;
}
