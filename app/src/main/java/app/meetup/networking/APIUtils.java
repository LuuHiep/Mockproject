package app.meetup.networking;


public class APIUtils {
    public static final String BASE_URL = "http://172.16.18.91/18175d1_mobile_100_fresher/public/api/v0/";

    public static APIService getService() {
        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }


}
