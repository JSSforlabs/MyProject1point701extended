package model.roles;

import java.util.HashSet;

/**
 * Training
 */
public class Training {
    private HashSet<Gymnastic> gymnastics;

    public Training() {
    }

    public Training(HashSet<Gymnastic> gymnastics) {
        this.gymnastics = gymnastics;
    }

    public HashSet<Gymnastic> getGymnastics() {
        return gymnastics;
    }

    public void setGymnastics(HashSet<Gymnastic> gymnastics) {
        this.gymnastics = gymnastics;
    }

    @Override
    public String toString() {
        return "Training{" +
                "gymnastics=" + gymnastics +
                '}';
    }
}
