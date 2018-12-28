package name.ealen.domain.repository;

import name.ealen.domain.aggregates.DrawLottery;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author lijunsong
 * @date 2018/12/28 18:39
 * @since 1.0
 */
public class DrawLotteryRepository {
    /**
     * 屏蔽对底层奖池及奖品的直接访问，仅对抽奖的聚合根资源进行管理
     */
    @Autowried
    private DrawLotteryCacheAccessObj drawLotteryCacheAccessObj;

    public DrawLottery getDrawLotteryById(int lotteryId) {
        DrawLottery drawLottery = drawLotteryCacheAccessObj.get(lotteryId);
        if (drawLottery != null) {
            return drawLottery;
        }
        drawLottery = getDrawLotteryFromDB(lotteryId);
        //加入缓存
        drawLotteryCacheAccessObj.add(lotteryId, drawLottery);

        return drawLottery;
    }

    /** 从数据库获取抽奖
     * @return
     */
    private DrawLottery getDrawLotteryFromDB() {
        return new DrawLottery();
    }
}
