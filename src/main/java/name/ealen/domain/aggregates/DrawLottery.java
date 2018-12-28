package name.ealen.domain.aggregates;

import lombok.Data;
import name.ealen.domain.vo.AwardPool;

import java.util.List;

/**
 * @author lijunsong
 * @date 2018/12/28 17:56
 * @since 1.0
 */
@Data
public class DrawLottery {
    /**
     * 抽奖id
     */
    private int lotteryId;
    /**
     * 奖池
     */
    private List<AwardPool> awardPoolList;

    public void setLotteryId(int lotteryId) {
        if(lotteryId < 0) {
            throw new IllegalAccessException("非法的抽奖id");
        }
        this.lotteryId = lotteryId;
    }

    public AwardPool chooseAwardPool(DrawLotteryContext context) {
        //
    }
}
