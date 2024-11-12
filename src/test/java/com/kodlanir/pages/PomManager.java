package com.kodlanir.pages;


import com.kodlanir.utils.BrowserUtils;

public class PomManager extends Annotations{

    private Homepage homepage;
    private RegisterPage registerPage;
    private SuccessPage successPage;
    private LambdaRegisterPage lambdaRegisterPage;
    private LambdaLoginPage lambdaLoginPage;
    private LambdaCartPage lambdaCartPage;

    public Homepage getHomepage() {

        return homepage == null ? new Homepage() : homepage;
    }

    public RegisterPage getRegisterPage() {

        return registerPage == null ? new RegisterPage() : registerPage;
    }

    public SuccessPage getSuccessPage() {

        return successPage == null ? new SuccessPage() : successPage;
    }

    public LambdaRegisterPage getLambdaRegisterPage() {

        return lambdaRegisterPage == null ? new LambdaRegisterPage() : lambdaRegisterPage;
    }

    public LambdaLoginPage getLambdaLoginPage(){
        return lambdaLoginPage == null ? new LambdaLoginPage() : lambdaLoginPage;
    }

    public LambdaCartPage getLambdaCartPage(){
        return lambdaCartPage == null ? new LambdaCartPage() : lambdaCartPage;
    }
}
