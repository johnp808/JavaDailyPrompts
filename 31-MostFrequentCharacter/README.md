# Most Frequent Character Counter

### 6-23-25

## Goal: Count how often each letter appears in a sentence and display the letter(s) with the highest frequency.

# Prompt Write a Java program that:
## Accepts a sentence from the user.
## Ignores non-letter characters and treats uppercase and lowercase letters as the same.
## Counts the frequency of each character using a map.
## Identifies the highest character frequency.
## Displays all characters that occur with this maximum frequency.
## Handles edge cases such as multiple characters sharing the top frequency.

## Input Requirements:

### The user enters a sentence (e.g., "Hello world")
### Only alphabetic characters should be counted.
### Input should be case-insensitive ('H' and 'h' are the same).

## Output Expectations:

### List of most frequent letter(s), separated by commas (no comma after the last).
### Total frequency of those letter(s).

## Edge Case Handling:
### Sentences with only one repeated letter.
### Case differences should not affect frequency count.
### Ties in frequency (e.g., both 'l' and 'o' appearing 3 times).