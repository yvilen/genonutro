package api.mongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "trading_platforms")
public class TradingPlatform {

    @Id
    String id;
    String type;
    String alias;
    String platformUrl;
    String platformLogin;
    String platformPass;
    String platformServiceUrl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getPlatformUrl() {
        return platformUrl;
    }

    public void setPlatformUrl(String platformUrl) {
        this.platformUrl = platformUrl;
    }

    public String getPlatformLogin() {
        return platformLogin;
    }

    public void setPlatformLogin(String platformLogin) {
        this.platformLogin = platformLogin;
    }

    public String getPlatformPass() {
        return platformPass;
    }

    public void setPlatformPass(String platformPass) {
        this.platformPass = platformPass;
    }

    public String getPlatformServiceUrl() {
        return platformServiceUrl;
    }

    public void setPlatformServiceUrl(String platformServiceUrl) {
        this.platformServiceUrl = platformServiceUrl;
    }
}
