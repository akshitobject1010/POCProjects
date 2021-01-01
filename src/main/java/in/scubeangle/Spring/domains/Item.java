package in.scubeangle.Spring.domains;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@EqualsAndHashCode()
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String itemName;

    public String getalternateItemName() {
        return alternateItemName;
    }

    public void setAlternateItemName(String alternateItemName) {
        this.alternateItemName = alternateItemName;
    }

    private String parentItemName;
    private int priority;
    private String tag;
    private String userId;
    private String alternateItemName;



}
