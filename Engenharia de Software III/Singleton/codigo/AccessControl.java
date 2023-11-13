import java.util.ArrayList;
import java.util.List;

public class AccessControl {
    private static AccessControl instance = null;
    private List<User> users = new ArrayList<>();

    private AccessControl() {
    }

    public static AccessControl getInstance() {
        if (instance == null) {
            instance = new AccessControl();
        }
        return instance;
    }

    public void grantAccess(User user) {
        if (!users.contains(user)) {
            users.add(user);
            System.out.println(user.getName() + " recebeu acesso concedido.");
        } else {
            System.out.println(user.getName() + " já possui acesso concedido.");
        }
    }

    public void revokeAccess(User user) {
        if (users.contains(user)) {
            users.remove(user);
            System.out.println(user.getName() + " teve seu acesso revogado.");
        } else {
            System.out.println(user.getName() + " não possui acesso concedido para ser revogado.");
        }
    }

    public boolean hasAccess(User user) {
        return users.contains(user);
    }
}
