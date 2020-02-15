package com.example.kotlin_test;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiService {

    @GET("/users")
    Call<ResponseBody> testcall(@Query("name") String name,@Query("part") String part);

    @GET("/")
    Call<ResponseBody> test();
}
