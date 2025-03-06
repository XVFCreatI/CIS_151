
import java.io.*;

// By implementing Serializable interface
// we make sure that state of instances of class DogStepTracker
// can be saved in a file.
// This is required for serialization and de-serialization
// to work properly.


class DogStepTracker implements Serializable {
    private static final long serialVersionUID = 1L;
    
    int steps = 100;
    String dogName = "Water";
    String dogBreed = "Corgi";
    String owner = "Samson";


    // DogStepTracker class constructor
    public DogStepTracker(int steps, String dogName, String dogBreed, String owner) {
        this.steps = steps;
        this.dogName = dogName;
        this.dogBreed = dogBreed;
        this.owner = owner;
    }
}

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DogStepTracker tracker = new DogStepTracker(5000, "Buddy", "Corgi", "Samson");

        // Serializing 'tracker'
        FileOutputStream fos = new FileOutputStream("dog_tracker.data");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(tracker);

        // De-serializing 'tracker'
        FileInputStream fis = new FileInputStream("dog_tracker.data");
        ObjectInputStream ois = new ObjectInputStream(fis);
        DogStepTracker deserializedTracker = (DogStepTracker) ois.readObject(); // down-casting object

        System.out.println("Dog Name: " + deserializedTracker.dogName + ", Steps: " + deserializedTracker.steps);
        System.out.println("Owner: " + deserializedTracker.owner);
        System.out.println("Dog Breed: " + deserializedTracker.dogBreed);
        // TODO: print all the other data
        // closing streams
        oos.close();
        ois.close();
    }
}


