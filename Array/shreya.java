class Solution {
    public String generateTheString(int n) {
         if (n == 1) {
            return "o";
        }
        StringBuilder sb = new StringBuilder();
        if (n % 2 == 0) {
            for (int i = 0; i < n - 1; i++) {
                sb.append("o");
            }
            sb.append("h");
        } else {
            for (int i = 0; i < n - 2; i++) {
                sb.append("o");
            }
            sb.append("hc");
        }

        return sb.toString();
    }
}
