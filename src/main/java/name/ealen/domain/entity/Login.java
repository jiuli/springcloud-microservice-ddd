package name.ealen.domain.entity;

import name.ealen.domain.aggregates.IAggregationRoot;

/**
 * @author lijunsong
 * @date 2018/12/29 17:21
 * @since 1.0
 */
public class Login implements IAggregationRoot {
    private Long id;
    private String code;
    private String password;
    private Long dealerId;
}
