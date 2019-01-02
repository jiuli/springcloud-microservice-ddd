package name.ealen.domain.entity;

import name.ealen.domain.aggregates.IAggregationRoot;

import java.util.List;

/**
 * 产品SPU主要是产品的名字和相关描述
 * 产品SKU包括产品SPU的多个规格，每个规格有不同的价格与PV值
 * 产品SPU与产品SKU属于同一个聚合，产品SPU是聚合根
 * @author lijunsong
 * @date 2018/12/29 16:20
 * @since 1.0
 */
public class ProductSPU implements IAggregationRoot {
    private Long id;
    private String code;
    private String name;
    private String description;
    /**
     * ProductSPU包含了一个ProductSKU的集合（也就是引用），这就代表它们同属一个聚合，
     * 在具体使用EF Core做持久化时，会作为一个事务统一持久化
     */
    public List<ProductSKU> productSKUList;

    //业务逻辑

}
