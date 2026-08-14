class Solution {
    public boolean isValid(String s) {

        
        if (s.length() > 0 && (s.charAt(0) == '}' || s.charAt(0) == ')' || s.charAt(0) == ']')) {
            return false;
        } 

        Map<Character, Character> closingBrackets = new HashMap<>();
        closingBrackets.put('}','{');
        closingBrackets.put(')','(');
        closingBrackets.put(']','[');

        List<Character> stack = new ArrayList<>();
        stack.add(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            Character currentBracket = s.charAt(i);
            if (closingBrackets.containsKey(currentBracket)) {
               if (stack.size() > 0 && closingBrackets.get(currentBracket) == stack.get(stack.size() - 1)) {
                    stack.remove(stack.size() - 1);
                } else {
                    return false;
                }
            } else {
                stack.add(currentBracket);
            } 
        }

        return stack.size() == 0;
    }
}
