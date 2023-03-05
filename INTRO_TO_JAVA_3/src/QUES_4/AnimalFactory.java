package QUES_4;

public class AnimalFactory {
        public Animals chooseAnimal(String animal)
        {
            if (animal == null || animal.isEmpty())
                return null;
            switch (animal) {
                case "CAT":
                    return new CAT();
                case "COW":
                    return new COW();
                case "DOG":
                    return new DOG();
                default:
                    throw new IllegalArgumentException("Unknown Animal "+ animal);
            }
        }
}
