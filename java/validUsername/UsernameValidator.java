/**
 * Dev: Nathan Kurz
 * 
 * Class validates a username using a regex. The constraints are:
 *  - Must be (a-z|A-Z|0-9)
 *  - First char must be a letter
 *  - Must be 8-30 characters in length
 */
class UsernameValidator {
    /*
     * regex description: 
     *  [[A-Z]|[a-z]]: indicates the first character must be a letter case insensitive
     *  [A-Z]|[a-z]|\\d|[_]: indicates the following characters can be either letters, digits, or an underscore
     * 
     */
    public static final String regularExpression = "[[A-Z]|[a-z]][[A-Z]|[a-z]|\\d|[_]]{7,29}$";
}