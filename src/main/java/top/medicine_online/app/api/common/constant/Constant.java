package top.medicine_online.app.api.common.constant;

public interface Constant {
    // 创建时间
    String CREATE_TIME = "createTime";
    // 更新时间
    String UPDATE_TIME = "updateTime";
    // 逻辑删除
    String DELETE_FLAG = "deleteFlag";
    // 用户id
    String USER_ID = "userId";

    // 微信小程序 appId
    String APP_ID = "wxf1a91e28c1c9e1c3";

    // appSecret
    String APP_SECRET = "3be509b5a162b45d261b06fe3bb71e00";

    // 微信返回参数中的属性名
    String WX_ERR_CODE = "errcode";

    // 返回参数中的属性名
    String WX_OPENID = "openid";

    // 返回参数中的属性名
    String WX_SESSION_KEY = "session_key";

    // 前端没有登录的时候会携带的token，后续会用到
    String NO_TOKEN = "no-token";
}
