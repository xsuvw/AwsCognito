package com.example.cognito.response;

public class Campaign
{
    private String S;

    public String getS ()
    {
        return S;
    }

    public void setS (String S)
    {
        this.S = S;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [S = "+S+"]";
    }
}
