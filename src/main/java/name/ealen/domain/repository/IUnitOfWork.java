package name.ealen.domain.repository;

/**
 * 工作单元接口就定义了一个提交方法，在具体实现时，其实就是对应的EF Core的整个聚合的事务提交方法
 *
 *
 * @author lijunsong
 * @date 2018/12/29 15:54
 * @since 1.0
 */
public interface IUnitOfWork {
    void Commit();
}
