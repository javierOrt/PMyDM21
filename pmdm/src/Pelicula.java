public class Pelicula {

    //Atriutos
    private String m_sTitulo;
    private String m_sDirector;
    private String m_sCategoria;
    private int m_nAno;
    private int m_nDuracion;

    //Metodos

    public String getM_sTitulo() {
        return m_sTitulo;
    }

    public void setM_sTitulo(String m_sTitulo) {
        this.m_sTitulo = m_sTitulo;
    }

    public String getM_sDirector() {
        return m_sDirector;
    }

    public void setM_sDirector(String m_sDirector) {
        this.m_sDirector = m_sDirector;
    }

    public String getM_sCategoria() {
        return m_sCategoria;
    }

    public void setM_sCategoria(String m_sCategoria) {
        this.m_sCategoria = m_sCategoria;
    }

    public int getM_nAno() {
        return m_nAno;
    }

    public void setM_nAno(int m_nAno) {
        this.m_nAno = m_nAno;
    }

    public int getM_nDuracion() {
        return m_nDuracion;
    }

    public void setM_nDuracion(int m_nDuracion) {
        this.m_nDuracion = m_nDuracion;
    }

    //contructor
    public Pelicula(String m_sTitulo, String m_sDirector, String m_sCategoria, int m_nAno, int m_nDuracion) {
        this.m_sTitulo = m_sTitulo;
        this.m_sDirector = m_sDirector;
        this.m_sCategoria = m_sCategoria;
        this.m_nAno = m_nAno;
        this.m_nDuracion = m_nDuracion;
    }

    public Pelicula(){
        this.m_sTitulo = "";
        this.m_sDirector = "";
        this.m_sCategoria = "";
        this.m_nAno = 0;
        this.m_nDuracion = 0;
    }

    public Pelicula peliculaMasAntigua(Pelicula p1, Pelicula p2){
        if (p1.getM_nAno()==p2.getM_nAno()) return null;

        if (p1.getM_nAno()>p2.getM_nAno()){
            return p1;
        }
        else
        {
            return p2;
        }
    }
}
