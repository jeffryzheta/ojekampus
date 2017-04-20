
/**
 * Write a description of class PesananOlehPelangganDitemukanException here.
 * 
 * @author Jeffry Kurniawan Zheta 
 * @version (a version number or a date)
 */
public class PesananOlehPelangganDitemukanException extends Exception
{
    // instance variables - replace the example below with your own
    private Pelanggan pelanggan_error;

    /**
     * Constructor for objects of class PesananOlehPelangganDitemukanException
     */
    public PesananOlehPelangganDitemukanException(Pelanggan pelanggan_input)
    {
        super("Pesanan oleh");
        this.pelanggan_error = pelanggan_input;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getMessage()
    {
        return super.getMessage() + pelanggan_error.getNama() + " tidak ditemukan";
    }
}
