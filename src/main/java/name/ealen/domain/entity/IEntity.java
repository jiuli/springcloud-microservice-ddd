package name.ealen.domain.entity;

/**
 * Id是一个未来存储到数据库表中的技术主键，Code是领域对象的唯一业务标识符。
 * 你也可以扩展这个接口，定义两个实体比较接口(未来实现就是比较两个实体如果Code一致，则代表两个实体相等)。
 * @author lijunsong
 * @date 2018/12/29 15:48
 * @since 1.0
 */
public interface IEntity {
    String code = "";
    Long id = 0L;

}
