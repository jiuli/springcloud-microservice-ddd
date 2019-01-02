package name.ealen.domain.vo;

/**
 * 层次结构值对象
 * @author lijunsong
 * @date 2018/12/29 17:19
 * @since 1.0
 */
public class DealerTree implements IValueObject {
    private Long id;
    private Long dealerId;
    private Long parentId;
    public int layer;

}
