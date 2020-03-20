package com.kritesh.paypal.paymentservice;

import com.kritesh.paypal.paymentservice.model.PaymentVerificationResponse;
import com.kritesh.paypal.paymentservice.model.Product;
import com.kritesh.paypal.paymentservice.model.ProductsResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by kritesh on 7/7/2017.
 */

public interface PayPalAPI {

    @FormUrlEncoded
    @POST("api/verify_mobile_payment")
    Call<PaymentVerificationResponse>VerifyMobilePayment(@Field("payment_id") String paymentID
            , @Field("uid") String userID
            , @Field("amount") String amount
            , @Field("currency") String currency);

    @GET("api/products")
    Call<ProductsResponse>getProducts();
}
