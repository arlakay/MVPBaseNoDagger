package com.erd.pjitransport.network;

import com.erd.pjitransport.model.resp.QuestionResp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface FirstNetworkAPI {

    @Headers("Content-Type: application/json")
    @GET("questions")
    Call<QuestionResp> getQuestions();

//
//    // AUTHENTICATION
//    @Headers({"Accept: application/json", "Content-Type: application/json"})
//    @POST("/transport/user/api/auth")
//    Call<LoginResp> auth(@Body LoginReq request);
//
//    //CEK EMAIL MUST BE EXIST
//    @Headers("Accept: application/json")
//    @GET("/transport/user/api/user/emailIsExist/{email}")
//    Call<LoginResp> cekEmailExist(@Path("email") String email);
//
//    //SEND SECRET CODE
//    @Headers({"Accept: application/json", "Content-Type: application/json"})
//    @POST("/transport/user/api/user/sendVerificationCode/{email}")
//    Call<LoginResp> sendCode(@Path("email") String email);
//
//    //VALIDATE SECRET CODE
//    @Headers({"Accept: application/json", "Content-Type: application/json"})
//    @POST("/transport/user/api/user/validateEmailAndSecret/{email}/{secret}")
//    Call<LoginResp> validateCode(@Path("email") String email, @Path("secret") String secret);
//
//    //RESET PWD
//    @Headers({"Accept: application/json", "Content-Type: application/json"})
//    @POST("/transport/user/api/user/resetPwd")
//    Call<LoginResp> resetPwd(@Body ResetPasswordReq request);
//
//    // CHARGE CODE API
//
//    // GET ALL CHARGE CODE
//    @Headers("Accept: application/json")
//    @GET("/transport/trx/ccode")
//    Call<ChargeCodeResp> getChargeCode(@Query("page") int page,
//                                       @Query("count") int count,
//                                       @Query("order") String order,
//                                       @Query("sort") String sort);
//
//    //CREATE NEW CHARGE CODE
//    @Headers({"Accept: application/json", "Content-Type: application/json"})
//    @POST("/transport/trx/ccode")
//    Call<ChargeCodeResp> createNewChargeCode(@Body ChargeCodeReq request);
//
//    //GET CHARGE CODE BY CODE
//    @Headers("Accept: application/json")
//    @GET("/transport/trx/ccode/code")
//    Call<List<ChargeCodeContent>> getChargeCodeByCode(@Query("code") String code,
//                                                      @Query("status") String status);
//
//    //GET CHARGE CODE BY OWNER
//    @Headers("Accept: application/json")
//    @GET("/transport/trx/ccode/codeByOwner")
//    Call<ChargeCodeResp> getChargeCodeByOwner(@Query("owner") String owner);
//
//    //DELETE CHARGE CODE BY ID
//    @Headers("Accept: application/json")
//    @DELETE("/transport/trx/ccode/{id}")
//    Call<ChargeCodeResp> deleteChargeCodeById(@Path("id") String id);
//
//    //GET CHARGE CODE BY ID
//    @Headers("Accept: application/json")
//    @GET("/transport/trx/ccode/{id}")
//    Call<ChargeCodeResp> getChargeCodeById(@Path("id") String id);
//
//    //UPDATE CHARGE CODE BY ID
//    @Headers({"Accept: application/json", "Content-Type: application/json"})
//    @PUT("/transport/trx/ccode/{id}")
//    Call<ChargeCodeResp> updateChargeCodeById(@Path("id") String id, @Body ChargeCodeReq chargeCode);
//
//    // TRANSACTION
//
//    // GET ALL TRX
//    @Headers("Accept: application/json")
//    @GET("/transport/trx/trx")
//    Call<TrxResp> getTrx(@Query("page") int page,
//                         @Query("count") int count,
//                         @Query("order") String order,
//                         @Query("sort") String sort);
//
//    //CREATE NEW TRX
//    @Headers({"Accept: application/json", "Content-Type: application/json"})
//    @POST("/transport/trx/trx")
//    Call<TrxResp> createNewTrx(@Body TransactionReq request);
//
//    //GET TRX BY APPROVER
//    @Headers("Accept: application/json")
//    @GET("/transport/trx/trx/trxByApprover")
//    Call<List<TrxContent>> getTrxByApprover(@Query("approver") String approver);
//
//    //GET TRX BY CODE AND STATUS
//    @Headers("Accept: application/json")
//    @GET("/transport/trx/trx/trxByCodeAndStatus")
//    Call<TrxResp> getTrxByCodeAndStatus(@Query("code") String code,
//                                        @Query("status") String status);
//
//    //GET TRX BY USER
//    @Headers("Accept: application/json")
//    @GET("/transport/trx/trx/trxByUser")
//    Call<List<TrxContent>> getTrxByUser(@Query("requester") String requester);
//
//    //DELETE TRX BY ID
//    @Headers("Accept: application/json")
//    @DELETE("/transport/trx/trx/{id}")
//    Call<TrxResp> deleteTrxById(@Path("id") String id);
//
//    //GET TRX BY ID
//    @Headers("Accept: application/json")
//    @GET("/transport/trx/trx/{id}")
//    Call<TrxResp> getTrxById(@Path("id") String id);
//
//    //UPDATE TRX BY ID
//    @Headers({
//            "Accept: application/json",
//            "Content-Type: application/json"
//    })
//    @PUT("/transport/trx/trx/{id}")
//    Call<TrxResp> updateTrxById(@Path("id") String id,
//                                    @Body TransactionReq request);
//
//
//
//
///*    @POST("user_pass.php")
//    Call<LoginResp> doLogIn(@Body LoginReq request);*/
}
