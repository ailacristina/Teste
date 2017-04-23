package view;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Created by marcus on 28/06/2015.
 */
@ManagedBean(name = "index")
@RequestScoped
public class IndexView {
    private String message;

    public IndexView(){
        message = "Hi Daniel, estou apenas testanto, mas em breve sua aplicação também estará"
                + "no ar!! :)";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
