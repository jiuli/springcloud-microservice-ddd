package name.ealen.domain.vo;

import lombok.Data;
import name.ealen.domain.entity.Award;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author lijunsong
 * @date 2018/12/28 17:59
 * @since 1.0
 */
@Data
public class AwardPool {
    /**
     * 奖池支持的城市
     */
    private List<Integer> cityIds;
    /**
     * 奖池支持的得分
     */
    private Long score;
    /**
     * 奖池匹配的用户类型
     */
    private int userGroupType;
    /**
     * 奖池中包含的奖品
     */
    private List<Award> awards;

    /** 城市是否匹配
     * @param cityId
     * @return
     */
    public boolean matchedCity(int cityId) {
        //
        return this.cityIds.contains(cityId);
    }

    /** 分数是否匹配
     * @param score
     * @return
     */
    public boolean matchedScore(int score) {
        //
        return this.score == score;
    }

    /**
     * 奖品获取
     * @return
     */
    public Award randomGetAward() {
        int sumOfProbablity = 0;
        for (Award award : awards) {
            sumOfProbablity += award.getProbability();
        }
        int range = 0;
        int randomNum = ThreadLocalRandom.current().nextInt(sumOfProbablity);
        for (Award award : awards) {
            range += award.getProbability();
            if (randomNum < range) {
                return award;
            }
        }
        return null;
    }
}
