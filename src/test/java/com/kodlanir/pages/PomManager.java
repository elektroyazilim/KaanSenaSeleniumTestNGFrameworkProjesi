package com.kodlanir.pages;


public class PomManager extends Annotations{

    private Homepage homepage;
    private RegisterPage registerPage;

    private SuccessPage successPage;
    private LambdaRegisterPage lambdaRegisterPage;


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


}
