package token;

// token生成器的设计：包含完整的认证信息, 带有过期时间
// 1. 静态token
// 2. 动态token
public class TokenGenerator {

    private String generateDummyTokenWithExpiryTimeAndTenantAndGroup(
            // Key key,
            int expiryTime,
            String tenantID,
            String issuer,
            String clientId,
            String groupName,
            int groupType) {
        int now = (int) (System.currentTimeMillis() / 1000);
        // return new IdTokenInfo.IdTokenInfoBuilder()
        //                .setClientId(clientId)
        //                .setGroupType(IdTokenInfo.GroupType.fromValue(groupType))
        //                .setGroup(groupName)
        //                .setUserId(Integer.parseInt(TOKEN_USERID))
        //                .setCreationDate(new Date())
        //                .setExpiryTime(expiryTime)
        //                .setIssueTime(now)
        //                .setSid(Integer.parseInt(TOKEN_SID))
        //                .setUsername(TOKEN_USERNAME)
        //                .setUserlabel(TOKEN_USERNAME)
        //                .setTenantId(tenantID)
        //                .setIssuer(issuer)
        //                .build(), key);
        return "token";
    }
}
