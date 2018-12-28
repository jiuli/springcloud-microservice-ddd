package name.ealen.domain.facade;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author lijunsong
 * @date 2018/12/28 18:47
 * @since 1.0
 */
public class UserCityInfoFacade {
    @Autowired
    private CityService cityService;

    public CityInfo getCityInfo(LotteryContext context){
        CityRequest request = new CityRequest();
        request.setLat(context.getLat());
        request.setLng(context.getLng());
        CityResponse response = cityService.getCityInfo(request);

        return buildCityInfo(response);
    }

}
