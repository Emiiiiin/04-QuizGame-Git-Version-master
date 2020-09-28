import control.MainController;
import view.MainView;
import model.Player;

public class MainProgram {

    public static void main(String[] args){
        MainView mainView = new MainView(new MainController());
    }
}
