package equals;

/**
 * A question with a text and an answer.
 */
public class Question {
    private String text;
    private String answer;

    /**
     * Constructs a question with empty question and answer.
     */
    public Question() {
        // calls constructor for Object()
        //        this.text = "";
        //        this.answer = "";
        this("","");
    }
                                   // new Question("text of question","answer of question");
                                   // new Question(); new Question("","");
    /**
     *
     * @param text
     * @param answer
     */
    public Question(String text, String answer){
        this.text = text;
        this.answer = answer;
    }

    /**
     * Sets the question text.
     *
     * @param questionText the text of this question
     */
    public void setText(String questionText) {
        text = questionText;
    }

    /**
     * Sets the answer for this question.
     *
     * @param correctResponse the answer
     */
    public void setAnswer(String correctResponse) {
        answer = correctResponse;
    }

    /**
     * Checks a given response for correctness.
     *
     * @param response the response to check
     * @return true if the response was correct, false otherwise
     */
    public boolean checkAnswer(String response) {
        return response.equals(answer);
    }

    /**
     * Displays this question.
     */
    public void display() {
        System.out.println(text);
    }

    @Override
	public int hashCode() {
    	// hashCode() should be kept consistent with equals(foo):
    	// if this.equals(foo) returns true, then also
    	// this.hashCode() == foo.hashCode() should be true
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.answer == null) ? 0 : this.answer.hashCode());
		result = prime * result + ((this.text == null) ? 0 : this.text.hashCode());
		return result;
	}

    @Override
	public boolean equals(Object obj) {
		if (this == obj) { // references to the same object
			return true;
		}
		if (obj == null) { // this != null (always), so they cannot be equal
			return false;
		}
		if (!(obj instanceof Question)) { // wrong type of obj for equality
			return false;
		}

		// at this point we are sure that obj is an instance of Question
		// so that it is safe to do the type cast and get a reference of
		// type Question and access the corresponding attributes
		Question other = (Question) obj;

		// this and other are equal iff all attributes are,
		// so go through them one by one
		if (this.answer == null) {
			if (other.answer != null) {
				return false;
			}
		} else if (!this.answer.equals(other.answer)) {
			return false;
		}

		if (this.text == null) {
			if (other.text != null) {
				return false;
			}
		} else if (!this.text.equals(other.text)) {
			return false;
		}

		return true;
	}
}
