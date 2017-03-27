package dao.xml.users.manager;

import entities.users.Manager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Denys Vodotiiets.
 */

@XmlRootElement(name = "managers")
@XmlAccessorType(XmlAccessType.FIELD)
public class Managers {

    @XmlElement(name = "manager")
    private List<Manager> managers;

    public Managers() {
        managers = new ArrayList<>();
    }

    public List<Manager> getManagers() {
        return managers;
    }

    public void setManagers(List<Manager> managers) {
        this.managers = managers;
    }

}
