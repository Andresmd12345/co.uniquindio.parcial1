package Model;

public class Estudiante {

    private String nombre;
    private int edad;
    private String correo;
    private String tipoEstudiante;
    private int semestre;
    private double nota1;
    private double nota2;
    private double nota3;
    private double promedio;

    public Estudiante() {

    }

    public Estudiante(String nombre, int edad, String correo, String tipoEstudiante, int semestre, double nota1, double nota2, double nota3, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.tipoEstudiante = tipoEstudiante;
        this.semestre = semestre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.promedio = promedio;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        correo = correo;
    }

    public String getTipoEstudiante() {
        return tipoEstudiante;
    }

    public void setTipoEstudiante(String tipoEstudiante) {
        tipoEstudiante = tipoEstudiante;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        semestre = semestre;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public double calcularDefinitiva(double nota1, double nota2, double nota3) {

        promedio = (getNota1() + getNota2() + getNota3()) / 3;
        return promedio;


    }


    public String obtenerInformacion() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", correo='" + correo + '\'' +
                ", tipoEstudiante='" + tipoEstudiante + '\'' +
                ", semestre=" + semestre +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                '}';
    }
}