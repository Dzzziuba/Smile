package dziuba.roma.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Roma Dziuba
 */
public class Journalist {
    private String name;
    private String surname;
    private String bday;
    private String workplace;
    @JsonIgnore
    private String image;

    public Journalist() {
    }

    public Journalist(String name, String surname, String bday, String workplace, String image) {

        this.name = name;
        this.surname = surname;
        this.bday = bday;
        this.workplace = workplace;
        this.image = image;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBday() {
        return bday;
    }

    public void setBday(String bday) {
        this.bday = bday;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Journalist{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", bday='" + bday + '\'' +
                ", workplace='" + workplace + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
