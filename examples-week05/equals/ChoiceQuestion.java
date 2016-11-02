package equals;

import java.util.ArrayList;

/**
 * A question with multiple choices.
 */
public class ChoiceQuestion extends Question {
    private ArrayList<String> choices;

    /**
     * Constructs a choice question with no choices.
     */
    public ChoiceQuestion() {
        // calls constructor for Question()
        choices = new ArrayList<String>();
    }

    public ChoiceQuestion(String text, String answer){
        // calls constructor for Question/2/String/String
        super(text,answer);
        // do some other stuff
        choices = new ArrayList<String>();
    }

    /**
     * Adds an answer choice to this question.
     *
     * @param choice  the choice to add
     * @param correct true if this is the correct choice, false otherwise
     */
    public void addChoice(String choice, boolean correct) {
        choices.add(choice);
        if (correct) {
            // Convert choices.size() to string
            String choiceString = "" + choices.size();
            setAnswer(choiceString);
        }
    }

    @Override
    public void display() {
        // Display the question text
        super.display();
        // Display the answer choices
        for (int i = 0; i < choices.size(); i++) {
            int choiceNumber = i + 1;
            System.out.println(choiceNumber + ": " + choices.get(i));
        }
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((this.choices == null) ? 0 : this.choices.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) { // takes care of the superclass attributes
			return false;
		}
		if (!(obj instanceof ChoiceQuestion)) {
			return false;
		}
		ChoiceQuestion other = (ChoiceQuestion) obj;
		if (this.choices == null) {
			if (other.choices != null) {
				return false;
			}
		} else if (!this.choices.equals(other.choices)) {
			return false;
		}
		return true;
	}
}
