class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

	//stack for digits
	Stack<Integer> stack = new Stack();

	//fill stack w/ digits from right to left
	int n = x;
	while (n > 0) {
		//push digit to stack
		stack.push(n % 10);
		n /= 10;
	}

	n = x;
	while (n > 0) {
		//check in reverse order from stack to see if digits match
		if (n % 10 != stack.pop()) return false;
		n /= 10;
	}

	//get here its true
	return true;
    }
}