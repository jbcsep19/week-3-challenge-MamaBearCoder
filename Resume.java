import java.util.ArrayList;

public class Resume {


    private String nombre;
    private String nombre2;
    private String email;
    private String company;
    private String Title;
    private int startDate;
    private int endDate;
    private String description;


    public Resume() {

    }


    public String getName() {
        return nombre;
    }

    public void setName(String name) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Resume(String nombre, String nombre2, String email) {
        this.nombre = nombre;
        this.nombre2 = nombre2;
        this.email = email;

    }

    public Resume(String company, int startDate, int endDate, String description) {
        this.company = company;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }


}


