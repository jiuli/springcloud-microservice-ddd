package name.ealen.domain.entity;

import java.math.BigDecimal;

/**
 * @author lijunsong
 * @date 2018/12/29 16:23
 * @since 1.0
 */
public class ProductSKU implements IEntity{
    private Long Id;
    private String code;
    private String spec;
    private BigDecimal pv;
    private BigDecimal price;
    private String imageUrl;
    private Long productSPUId;
    private String productSPUName;

    //业务逻辑
}
