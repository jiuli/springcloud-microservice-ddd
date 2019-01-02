package name.ealen.domain.aggregates;

import name.ealen.domain.entity.IEntity;

/**
 * 聚合根接口就是从实体接口继承，只是未来的用法可以在仓储中定义持久化时的领域对象必须从这个接口或继承了这个接口的抽象类继承下来的
 * @author lijunsong
 * @date 2018/12/29 15:50
 * @since 1.0
 */
public interface IAggregationRoot extends IEntity {

}
