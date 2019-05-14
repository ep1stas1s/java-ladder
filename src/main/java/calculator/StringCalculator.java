package calculator;

public class StringCalculator {
    private static final int SPLIT_BOUNDARY = 2;
    private static final int SEPARATOR_LENGTH = 1;
    private static final int SEPARATOR_GROUP = 0;
    private static final int SEPARATOR = 1;

    private static final String BEFORE_SEPARATOR = "\n";
    private static final String AFTER_SEPARATOR = "//";

    //TODO 로직, 예외처리부분 보강
    public String createCustomSeparator(String input) {
        if (input == null || input.isEmpty()) {
            return null;
        }
        String[] splitInput = input.split(BEFORE_SEPARATOR);
        isValidSplitInput(splitInput.length, SPLIT_BOUNDARY);

        String[] unrefinedSeparator = splitInput[SEPARATOR_GROUP].split(AFTER_SEPARATOR);
        isValidSplitInput(unrefinedSeparator.length, SPLIT_BOUNDARY);
        isValidSplitInput(unrefinedSeparator[SEPARATOR].length(), SEPARATOR_LENGTH);

        return unrefinedSeparator[SEPARATOR];
    }

    private void isValidSplitInput(int length, int splitBoundary) {
        if (length != splitBoundary) {
            throw new IllegalArgumentException();
        }
    }
}
