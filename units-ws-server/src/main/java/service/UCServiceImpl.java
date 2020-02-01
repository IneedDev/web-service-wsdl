package service;

import javax.jws.WebService;

@WebService(endpointInterface = "service.UC")
public class UCServiceImpl implements UC {

    public double c2f(double degrees)
    {
        return degrees * 9.0 / 5.0 + 32;
    }


    public double cm2in(double cm)
    {
        return cm / 2.54;
    }

    public double f2c(double degrees)
    {
        return (degrees - 32) * 5.0 / 9.0;
    }

    public double in2cm(double in)
    {
        return in * 2.54;
    }
}
