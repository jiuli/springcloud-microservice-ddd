package name.ealen.domain.vo;

/**
 * 联系人值对象
 * @author lijunsong
 * @date 2018/12/29 17:16
 * @since 1.0
 */
public class Contact implements IValueObject {
    private Long id;
    private String name;
    private String province;
    private String city;
    private String zero;
    private String address;
    private boolean defaultContact;
}
