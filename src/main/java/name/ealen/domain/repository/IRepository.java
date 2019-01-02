package name.ealen.domain.repository;

/**
 * 仓储接口从工作单元接口与资源释放接口继承，为未来的数据访问框架和可替换性提供顶层约束
 * 在java就是JpaRepository等接口
 * @author lijunsong
 * @date 2018/12/29 15:55
 * @since 1.0
 */
public interface IRepository extends IUnitOfWork {
}
