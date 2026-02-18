package org.example.Programs;

public class ReverseOnlyVowel {

    public static void main(String[] args) {

                String str = "hello";
                char[] arr = str.toCharArray();

                int left = 0;
                int right = arr.length - 1;

                while (left < right) {

                    if (isVowel(arr[left]) && isVowel(arr[right])) {
                        // swap vowels
                        char temp = arr[left];
                        arr[left] = arr[right];
                        arr[right] = temp;

                        left++;
                        right--;
                    }
                    else if (!isVowel(arr[left])) {
                        left++;
                    }
                    else {
                        right--;
                    }
                }

                System.out.println(new String(arr));
            }

            public static boolean isVowel(char ch) {
                return ch == 'a' || ch == 'e' || ch == 'i' ||
                        ch == 'o' || ch == 'u' ||
                        ch == 'A' || ch == 'E' ||
                        ch == 'I' || ch == 'O' || ch == 'U';
            }
        }


