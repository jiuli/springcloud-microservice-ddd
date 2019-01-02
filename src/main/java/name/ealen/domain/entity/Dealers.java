package name.ealen.domain.entity;

import name.ealen.domain.aggregates.IAggregationRoot;
import name.ealen.domain.vo.Contact;
import name.ealen.domain.vo.DealerTree;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author lijunsong
 * @date 2018/12/29 17:03
 * @since 1.0
 */
public class Dealers implements IAggregationRoot {
    private Long id;
    private String code;
    private String name;
    private String tel;
    private BigDecimal totalEleMoney;
    private BigDecimal JiangJinMoney;
    private BigDecimal totalPV;
    private CardType cardType;
    private Level levvel;
    private int subCount;
    private List<Contact> contactList;
    private DealerTree dealerTree;

    public enum CardType {
        //
        NONE("空", -1),
        REGULAR_MEMBER("普通会员", 0),
        SLIVER_MEMBER("银卡会员", 1),
        GOLD_MEMBER("金卡会员", 2);
    }
    public enum Level {
        //
        NONE("空", -1),
        CHAIRMAN("董事",0),
        AREA_MANAGER("片区经理", 1),
        PROVINCE_MANAGER("省区经理", 2),
        REGIONAL_MANAGER("大区经理",3);
    }
}
