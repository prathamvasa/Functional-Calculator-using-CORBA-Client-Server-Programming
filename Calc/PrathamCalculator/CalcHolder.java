package PrathamCalculator;

/**
* PrathamCalculator/CalcHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Calc.idl
* Wednesday, 22 October 2014 09:18:24 o'clock PDT
*/

public final class CalcHolder implements org.omg.CORBA.portable.Streamable
{
  public PrathamCalculator.Calc value = null;

  public CalcHolder ()
  {
  }

  public CalcHolder (PrathamCalculator.Calc initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = PrathamCalculator.CalcHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    PrathamCalculator.CalcHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return PrathamCalculator.CalcHelper.type ();
  }

}
